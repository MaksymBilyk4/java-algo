package codewars;

public class Main {
    public static void main(String[] args) {
    }

    public static int countSheep (Boolean[] arrayOfSheep) {
        int counter = 0;

        for (Boolean sheep : arrayOfSheep) {
            if (sheep != null && sheep.equals(true)) {
                counter++;
            }
        }

        return counter;
    }
}
