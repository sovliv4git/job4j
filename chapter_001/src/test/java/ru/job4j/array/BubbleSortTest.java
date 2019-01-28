package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {3, 8, 2, 6, 4, 5, 9, 7, 1, 0};
        int[] result = bubbleSort.sort(input);
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
}
