import java.util.Scanner;

public class Validator {

    public double validate(String input){

        Logger logger = new Logger();
        Scanner scan = new Scanner(System.in);

        while (true){
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                logger.log("Неверный ввод данных\n");
                System.out.println("Введите число типа double: ");
                input = scan.next();
            }
        }
    }
}
