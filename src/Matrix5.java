import java.util.Arrays;
import java.util.Random;

public class Matrix5 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 5;
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] arr3 = new int[n][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Массив 1 из случайных чисел");
        System.out.println("----------------------------");
        System.out.println(Arrays.deepToString(arr1));

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Массив 2 из случайных чисел");
        System.out.println("---------------------------");
        System.out.println(Arrays.deepToString(arr2));

            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3[0].length; j++) {
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                    }
                }
        System.out.println("Массив 3 сумма массива 1 и 2");
        System.out.println("---------------------------");
        System.out.println(Arrays.deepToString(arr3));

        System.out.println("Вывод массивов в ряд");
        System.out.println("---------------------------");
        for (int[] a : arr1 ) {
            for (int[] b :arr2) {
                for (int[] c : arr3) {
                    System.out.println(Arrays.deepToString(arr1) + "    " + Arrays.deepToString(arr2)+ "  " + Arrays.deepToString(arr3));

                }

            }

        }

    }
}
