package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons) {
           if (p.getName().contains(key) || p.getSurname().contains(key)
           || p.getPhone().contains(key) || p.getAddress().contains(key)) {
               result.add(p);
           }
        }
        return result;
    }
}
