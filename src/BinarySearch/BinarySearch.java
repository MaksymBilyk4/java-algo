package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(vector, 11));
        System.out.println(searchRec(vector, 11));
    }

    public static int search (int[] vector, int value) {
        int left = 0;
        int right = vector.length - 1;

        while (left < right){
            int middle = left + (right - left) / 2;

            if (vector[middle] == value) {
                return middle;
            }

            if (value > vector[middle]) {
                left = middle + 1;
            }else if (value < vector[middle]) {
                right = middle - 1;
            }
        }

        return vector[left] == value ? left : -1;
    }

    public static int searchRec (int[] vector, int value) {
        return searchRec(vector, value, 0, vector.length - 1);
    }

    public static int searchRec (int[] vector, int value, int left, int right) {
        int middle = left + (right - left) / 2;

        if (vector[middle] == value) {
            return middle;
        }
        if (left >= right) {
            return -1;
        }
        if (value > vector[middle]) {
            return searchRec(vector, value, middle + 1, right);
        }else {
            return searchRec(vector, value, left, middle - 1);
        }
    }


    }
