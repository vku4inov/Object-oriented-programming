package Lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш набор значений");
        System.out.println("После окончания ввода введите любую букву");
        while (true){
       if(scan.hasNextInt()) {
           arrayNumbers.add(scan.nextInt());
                             }
       else
           break;
                    }
        System.out.println(arrayNumbers);
        System.out.println(Collections.min(arrayNumbers));
        System.out.println(Collections.max(arrayNumbers));
                                            }
                }