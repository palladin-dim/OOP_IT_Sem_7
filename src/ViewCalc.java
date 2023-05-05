import java.util.Scanner;

public class ViewCalc {

    public ViewCalc() {
    }

    public void run() {
        while (true) {
            Logger logger = new Logger();
            double argR = inputArg("Ввести действительную часть первого комплекса: ");
            Calculator calc = new Calculator(argR);
            double argI = inputArg("Ввести мнимую часть первого комплекса: ");
            Calculator calc2 = new Calculator(argI);
            while (true) {
                String cmd = input("Выбрать команду (+, *, =) : ");
                switch (cmd) {
                    case "+":
                        calc.sum(inputArg("Ввести действительную часть второго комплекса: "));
                        calc2.sum(inputArg("Ввести мнимую часть второго комплекса: "));
                        logger.log("Сумма");
                        continue;
                    case "*":
                        calc.multi(inputArg("Введите действительную часть второго аргумента: "));
                        calc2.multi(inputArg("Введите мнимую часть второго аргумента: "));
                        logger.log("Произведение");
                        continue;
                    case "=":
                        double r = calc.getResult();
                        double i = calc2.getResult();
                        System.out.printf("Вывод %s + %si\n", r, i);
                        logger.log(r, i);
                    default:
                        System.out.println("Расчет выполнен");
                        break;
                }
                cmd = input("Продолжить? (Y/N)?");
                if (cmd.equalsIgnoreCase("Y")) {
                    continue;
                }
                break;
            }
        }
    }

    public double inputArg(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        Validator val = new Validator();
        return val.validate(scan.nextLine());
    }

    public String input(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.next();
    }

}
