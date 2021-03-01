package Lab2;

import java.util.Random;
import java.util.Scanner;

public  class Lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[][] array = new int[size1][size2];
        fillRandom(array,size1,size2);
        printArr(array);
        moveToLeft(array,size1,size2);
        printArr(array);
        moveToRight(array,size1,size2);
        printArr(array);
        moveToUp(array,size1,size2);
        printArr(array);
        moveToDown(array,size1,size2);
        printArr(array);
    }
    //Заполнение матрицы
    public static void fillRandom(int[][] a, int vert, int hor) {
        Random random = new Random();
        // Заполняем все строки и столбцов
        for (int i = 0; i < vert; i++) {
            for (int j = 0; j < hor; j++) {
                a[i][j] = random.nextInt(20) - 10;
            }
        }
    }
    // Вывод матрицы
    public static void printArr(int[][] a) {
        if (a != null) { // Проверка на не пустую матрицу
            for (int[] row : a) { // Для каждой строчки
                for (int k : row) { // Для каждого значения строки
                    System.out.printf("%3d ", k); // Выделил место под каждый символ чтобы матрица была ровной
                }
                System.out.println();
            }
        }
    }



// Сдвиги:
    public static void moveToLeft(int[][] b, int vert, int hor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг влево");
        int step = sc.nextInt();
        if (step > hor || step < 1) {// "||" это or(или)
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {//счетчик кол-ва сдигов
            for (i = 0; i < vert; i++) {
                buff = b[i][0];
                for (j = 0; j < hor - 1; j++) {
                    b[i][j] = b[i][j + 1];
                }
                b[i][j] = buff;

            }
        }
    }

    public static void moveToRight(int[][] b, int vert, int hor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг вправо");
        int step = sc.nextInt();
        if (step > hor || step < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < vert; i++) {
                buff = b[i][hor - 1];
                for (j = hor - 1; j > 0; j--) {
                    b[i][j] = b[i][j - 1];
                }
                b[i][j] = buff;
            }
        }
    }

    public static void moveToUp(int[][] b, int vert, int hor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг вверх");
        int step = sc.nextInt();
        if (step > vert || step < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < hor; i++) {
                buff = b[0][i];
                for (j = 0; j < vert - 1  ; j++) {
                    b[j][i] = b[j + 1 ][i];
                }
                b[j][i] = buff;
            }
        }
    }

    public static void moveToDown(int[][] b, int vert, int hor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг вниз");
        int step = sc.nextInt();
        if (step > vert || step < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < hor; i++) {
                buff = b[vert - 1][i];
                for (j = vert - 1; j > 0; j--) {
                    b[j][i] = b[j - 1][i];
                }
                b[j][i] = buff;
            }
        }
    }
}
