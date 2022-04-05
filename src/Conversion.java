import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = "stop";
        int number;
        String toBinary;
        System.out.println("Введите число от \"0\" до \"10000\"");

        while (true){
            number = scanner.nextInt();
            if(number < 0 || number > 10000){
                System.out.println("Некорректно введено число");
                continue;
            }
            System.out.println("Число: " + number + " в 16-ричной системе равно: " + Integer.toHexString(number));
            System.out.println("Число: " + number + " в 2-ричной системе равно: " + Integer.toBinaryString(number));
            toBinary = Integer.toBinaryString(number);
            System.out.println("Число: " + toBinary + " в 10-ричной системе равно: " + Integer.parseInt(toBinary, 2));
        }
    }
}
