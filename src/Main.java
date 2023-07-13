import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 7, 8, 9};

        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

                if (array[i] < min) {
                    min = array[i];
                }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
