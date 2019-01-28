package ru.job4j.array;

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i][i] != data[i + 1][i + 1])) {
                result = false;
                break;
            } else if (data[data.length - 1][data.length - 1] != data[data.length - 1 - i][data.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
