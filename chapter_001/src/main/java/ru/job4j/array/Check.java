package ru.job4j.array;

public class Check {

    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if(data[1] == data[i]) {
                result = true;
            } else result = false;
        }
        return result;
    }
}
