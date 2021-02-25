import java.util.Scanner;

public class lab1_2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Количество Чисел в массиве");
        int AmountOfNum = scan.nextInt();// переменная для размера массива
        int[] Num = new int[AmountOfNum];// массив с заданной длинной
        System.out.println("Заполните Массив");

        for(int i=0;i<AmountOfNum;i++){// Цикл для заполнения Массива
            Num[i] = scan.nextInt();
        }

        System.out.println("Ваш Массив");

        for(int i=0;i<AmountOfNum;i++){// Цикл для Вывода Массива
            System.out.print(Num[i]+" ");
        }

        System.out.println();//ентер в консоли

        int MaxNum = 0;

        for(int i:Num) { // Циксл for each перебираем наш массив
            if (i > MaxNum) { // Ищем Макс элемент
                MaxNum = i;
            }
        }

        System.out.print("Максимальный элемент = " + MaxNum);
        System.out.println();

        int MinNum = 0;

        for(int i:Num) {// Циксл for each перебираем наш массив
            if (i < MinNum) {// Ищем Мин элемент
                MinNum = i;
            }
        }

        System.out.print("Минимальный элемент = " + MinNum);
    }
}
