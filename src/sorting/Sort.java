package sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arrToSort = {4, 43, 1, 9, -13, 102, 57, -4};
        System.out.println(Arrays.toString(arrToSort));
        insertionSort(arrToSort);
        System.out.println(Arrays.toString(arrToSort));
    }

    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }

    static void bubbleSort(int[] arr) {
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static void swap(int[] arr, int point1, int point2) {
        int tmp = 0;
        tmp = arr[point1];
        arr[point1] = arr[point2];
        arr[point2] = tmp;
    }

    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = current;
        }
    }
}
