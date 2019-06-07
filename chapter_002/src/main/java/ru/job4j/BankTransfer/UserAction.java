package ru.job4j.BankTransfer;

/**
 * @author Vladimir Solovyov (sovliv@yandex.ru)
 * @since 05.06.2019
 * @version 1.0
 **/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAction {

    //список всех пользователей с их аккаунтами
    Map<User, List<Account>> listBanksAccounts = new HashMap<>();

    //добавление пользователя
    public void addUser(User user) {
        this.listBanksAccounts.putIfAbsent(user, new ArrayList<>());
    }

    //удаление пользователя.
    public void deleteUser(User user) {
        this.listBanksAccounts.remove(user);
    }

    //добавить счёт пользователю.
    public void addAccountToUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> userAcc : listBanksAccounts.entrySet()) {
            String userPassport = userAcc.getKey().getPassport();
            if (userPassport.equals(passport)) {
                userAcc.getValue().add(account);
            }
        }
    }

    //удалить один счёт пользователя.
    public void deleteAccountFromUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> userAcc : listBanksAccounts.entrySet()) {
            String userPassport = userAcc.getKey().getPassport();
            if (userPassport.equals(passport)) {
                userAcc.getValue().remove(account);
            }
        }
    }

    //получить список счетов для пользователя.
    public List<Account> getUserAccounts(String passport) {
        List<Account> result = null;
        for (Map.Entry<User, List<Account>> userAcc : listBanksAccounts.entrySet()) {
            String userPassport = userAcc.getKey().getPassport();
            if (!userAcc.getValue().isEmpty()) {
                if (userPassport.equals(passport)) {
                    result = userAcc.getValue();
                    break;
                }
            } else return new ArrayList<>();
        }
        return result;
    }

    //метод для перечисления денег с одного счёта на другой счёт:
    //если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        for (Map.Entry<User, List<Account>> srcAccount : listBanksAccounts.entrySet()) {

        }
        return false;
    }

    public Account findAccountByPassportAndRequisites(String passport, String requisites) {
        Account result = null;
        getUserAccounts(passport);
        for (Map.Entry<User, List<Account>> userAcc : listBanksAccounts.entrySet()) {
            int userAccSize = userAcc.getValue().size();
            for (int i = 0; i < userAccSize; i++) {
                String userRequisites = userAcc.getValue().get(i).requisites;
                if (userRequisites.equals(requisites)) {
                    result = userAcc.getValue().get(i);
                    break;
                }
            }
        }
        return result;
    }
}