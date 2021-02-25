import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNum = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш набор значений");
        System.out.println("После ввода введите 'stop' и нажмите Enter, или введите любую букву ");
        while (true){
       if(scan.hasNextInt()) {
           arrayNum.add(scan.nextInt());
       }
       else { break;
         /** if (scan.hasNextLine()){
              scan.close();
              System.out.println("Ваш набор:");
              System.out.println(arrayNum);
              break;}
          else break; **/
       }
}
        Collections.sort(arrayNum);
        System.out.println("Отсортированный набор:");
        System.out.println(arrayNum);
        System.out.println("Минимальный элемент " + arrayNum.get(0));
        System.out.println("Максимальынй элемент " + arrayNum.get(arrayNum.size()-1));
    }
}
