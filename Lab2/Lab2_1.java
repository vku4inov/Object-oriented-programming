package Lab2;

import java.util.Scanner;

    public class Lab2_1 {
        public static void main(String[] args) throws java.lang.Exception {
            Scanner scan = new Scanner(System.in); // Создаем сканнер для считывания
            System.out.println("Введите числа");
            String line = scan.nextLine();//Ввод чисел
            double avg = 0; //переменная для хранения средней длины
            line = line.replaceAll("[^0-9 ]","");//regex: регулярные выражения для гениев, выучить все не реально, просто гуглите.
            // Крч ищет первое вхождение в слово значений которые я задал и заменяет на новое значение ([^абв] = любой, кроме перечисленных (не а,б, в))
            String[] arr = line.split(" "); //Делим введенные значения на массив по "пробелу"

            for (String s : arr) { //for each
                avg += s.length();//Находим сумму длин чисел
            }
            if (arr.length > 0) avg /= arr.length;// если массив не пуст, то находим среднее знач.
            System.out.println("Средняя длина введенных чисел:" + avg);
            System.out.println("Числа с длиной больше среднего:");
            for (String s : arr) { //for each
                if (s.length() > avg) System.out.println(s + " Длина: " + s.length());//Если длина числа большей средней,то Вывод число и длину
            }
        }
    }

