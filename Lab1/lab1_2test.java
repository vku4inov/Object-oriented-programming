package Lab1;

import java.util.Scanner;

public class lab1_2test {

    //метод, который распечатывает все Числа
    public static void printAllNum(int[] Num) {
        System.out.print("|");
        for (int num : Num) {

            System.out.print(num + "|");
        }
        System.out.println();
    }
    //метод в котором вычисляется максимальное число
    public static int  highestNum(int[] numbers) {
        int maxNum = numbers[0];

        for (int num : numbers) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }
     
    //метод в котором вычисляется минимальное число
    public static int  lowestNum(int[] numbers) {
        int minNum = numbers[0];

        for (int num : numbers) {
            if (num < minNum) {
                minNum = num;
            }
        }
        return minNum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Количество Чисел в массиве");
        int AmountOfNum = scan.nextInt();// переменная для размера массива
        int[] Num = new int[AmountOfNum];// массив с заданной длинной
        System.out.println("Заполните Массив");
        for(int i=0;i<AmountOfNum;i++){// Цикл для заполнения Массива
            Num[i] = scan.nextInt();
        }
        System.out.print("Все числа: ");
        printAllNum(Num);
        System.out.println("Самое большое число " + highestNum(Num));
        System.out.println("Самое маленькое число " + lowestNum(Num));
    }

}