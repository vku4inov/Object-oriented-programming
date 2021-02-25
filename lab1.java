import java.util.Scanner; // импортируем ютил.сканнер, чтобы работал сканнер

public class lab1 {
    public static void main(String[] args){
        System.out.println("Введите Пароль:");// Выводим в консоль надпись
        Scanner scan = new Scanner(System.in);// Объявляем скан для ввода в консоль
        String pass = scan.nextLine(); // Вводим пароль в консоли
        if(pass.equals("228")){ //если пароль совпадает,то
            System.out.println("Верно" );// Выводим в консоль надпись
        }
        else // Иначе
        {
            System.out.println("Не правильно");// Выводим в консоль надпись
        }
    }
}
