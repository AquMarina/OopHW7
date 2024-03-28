import java.util.Scanner;

public class ScannerCalculator {
    Log loggin = new Log();

    ComplexOperation createSlojenie = new Slojenie();
    ComplexOperation createVichitanie = new Vichitanie();
    ComplexOperation createUmnojenie = new Umnojenie();
    ComplexOperation createDelenie = new Delenie();

    CreatedOperation createdOperation = new Operations();

    ComplexOperation slojenie = createdOperation.createSlojenie();
    ComplexOperation vichitanie = createdOperation.createVichitanie();
    ComplexOperation umnojenie = createdOperation.createUmnojenie();
    ComplexOperation delenie = createdOperation.createDelenie();

    public void enter() {
        while (true) {
            int real1 = contact2("Введите вещественное число: ");
            int mnim1 = contact2("Введите мнимое число: ");

            while (true) {
                String cmd = contact("Введите операцию ( *, /, +, - ) : ");
                if (cmd.equals("*")) {
                    viewCalc(real1, mnim1, umnojenie);
                    break;
                }
                if (cmd.equals("/")) {
                    viewCalc(real1, mnim1, delenie);
                    break;
                }
                if (cmd.equals("+")) {
                    viewCalc(real1, mnim1, slojenie);
                    break;
                }
                if (cmd.equals("-")) {
                    viewCalc(real1, mnim1, vichitanie);
                    break;
                } else {
                    Log.logError("Введены не корректные данные. Попробуйте снова.");
                }
            }
            String cmd = contact("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String contact(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    private int contact2(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());

    }

    private void viewCalc(int real1, int mnim1, ComplexOperation operation) {
        int real2 = contact2("Введите вещественное 2-е число: ");
        int mnim2 = contact2("Введите мнимое 2-е число: ");
        NumberComplex num1 = new NumberComplex(real1, mnim1);
        NumberComplex num2 = new NumberComplex(real2, mnim2);

        Calculator subtractCalculator = new Calculator(operation);
        logViewOperation(num1, num2, operation);
        NumberComplex result = subtractCalculator.calculate(num1, num2);
        Log.logInfo("Результат операции: " + result);
    }

    private void logViewOperation(NumberComplex a, NumberComplex b, ComplexOperation operation) {
        if (operation.equals(slojenie)) {
            Log.logInfo("Выполнено сложение: " + a + " и " + b);
        } else if (operation.equals(vichitanie)) {
            Log.logInfo("Выполнено вычитание: " + a + " и " + b);
        } else if (operation.equals(umnojenie)) {
            Log.logInfo("Выполнено умножение: " + a + " и " + b);
        } else if (operation.equals(delenie)) {
            Log.logInfo("Выполнено деление: " + a + " и " + b);
        }
    }
}
