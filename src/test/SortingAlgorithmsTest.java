package test;

import main.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortingAlgorithmsTest {

    @Test
    public void bubbleSortTest() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] input = {5, 4, 3, 2, 1};
        BubbleSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void selectionSortTest() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] input = {5, 4, 3, 2, 1};
        SelectionSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void insertionSortTest() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] input = {5, 4, 3, 2, 1};
        InsertionSort.sort(input);
        assertArrayEquals(expected, input);
    }

}