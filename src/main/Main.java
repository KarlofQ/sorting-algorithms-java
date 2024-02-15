package main;

public class Main {

    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        //change BubbleSort to any other class you want and see that output is the same
        InsertionSort.sort(array);

        for (int i : array) System.out.print(i + " ");
    }

}