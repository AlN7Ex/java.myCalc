import java.util.Scanner;

public class MyCalc {
    void addition(double first, double second) {
        System.out.println(first + second);
    }
    void subtraction(double first, double second) {
        System.out.println(first - second);
    }
    void multiplication(double first, double second) {
        System.out.println(first * second);
    }
    void division(double first, double second) {
        System.out.println(first / second);
    }
    public static void main(String[] args) {
        MyCalc calc = new MyCalc();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Input first num: ");
            double first = scan.nextDouble();
            System.out.print("Input sign: ");
            String operator = scan.next();
            System.out.print("Input second num: ");
            double second = scan.nextDouble();

            if (operator.equals("+"))
                calc.addition(first, second);
            else if (operator.equals("-"))
                calc.subtraction(first, second);
            else if (operator.equals("*"))
                calc.multiplication(first, second);
            else if (operator.equals("/"))
                calc.division(first, second);
            else
                System.out.println("Да да, пошёл я нах*р");
        }
    }
}
