package Lab1;

import java.util.Scanner;

public class lab1_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Количество Чисел в массиве");
        int amountOfNum = scan.nextInt();// переменная для размера массива
        String[] numbers = new String[amountOfNum];// массив с заданной длинной
        System.out.println("Заполните Массив");

        for (int i = 0; i < amountOfNum; i++) {// Цикл для заполнения Массива
            numbers[i] = scan.nextLine();
        }

        System.out.println("Ваш Массив");

        for (int i = 0; i < amountOfNum; i++) {// Цикл для Вывода Массива
            System.out.print(numbers[i] + " ");
        }
        String lenghtOfNum;
        System.out.println();
        for (String i : numbers) {
           lenghtOfNum = i.toString();
            System.out.print(lenghtOfNum.length()+" ");
        }

    }
}
        /**
        System.out.println();//ентер в консоли

        int maxNum = 0;

        for(int i:numbers) { // Циксл for each перебираем наш массив
            if (i > maxNum) { // Ищем Макс элемент
                maxNum = i;
            }
        }

        System.out.print("Максимальный элемент = " + maxNum);
        System.out.println();

        int minNum = 0;

        for(int i:numbers) {// Циксл for each перебираем наш массив
            if (i < minNum) {// Ищем Мин элемент
                minNum = i;
            }
        }
        System.out.print("Минимальный элемент = " + minNum);

        System.out.println();
            int avgNum = 0;
            for (int num : numbers) {
                avgNum = num + avgNum;
            }
        System.out.println(avgNum);

        }
    }
}
**/