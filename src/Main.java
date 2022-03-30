import java.util.*;


public class Main {
    public static void main(String[] args) {
        Сalculations calc = new Сalculations();
        NumTransform nt = new NumTransform();
        Scanner sc = new Scanner(System.in);


            System.out.print("Введите операцию: ");
            String line = sc.nextLine();
            String[] symbols = line.split(" ");
            String firstNumber = symbols[0];
            if (symbols.length < 3) {
                System.out.println("Error: cтрока не является математической операцией");
                System.exit(0);
            } else if (symbols.length > 3) {
                System.out.println("Error: формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) ");
                System.exit(0);
            }
            String sign = symbols[1];
            String secondNumber = symbols[2];


            int num1 = 0;
            int num2 = 0;
            int result;
            String romanResult = null;

            try {
                switch (sign) {
                    case "+":
                        for (String key : nt.romeToArab().keySet()) {
                            if (firstNumber.equals(key)) {
                                num1 = nt.romeToArab().get(key);
                            }
                        }
                        for (String key : nt.romeToArab().keySet()) {
                            if (secondNumber.equals(key)) {
                                num2 = nt.romeToArab().get(key);
                            }
                        }

                        if (num1 == 0 && num2 == 0) {
                            System.out.println("Результат: " + calc.sum(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
                            break;
                        } else if ((num1 == 0 || num2 == 0)) {
                            System.out.println("Error: используются одновременно разные системы счисления");
                            break;
                        } else
                            result = calc.sum(num1, num2);
                        for (int key : nt.arabToRome().keySet()) {
                            if (result == key) {
                                romanResult = nt.arabToRome().get(key);
                            }
                        }
                        System.out.println("Результат: " + romanResult);
                        break;

                    case "-":
                        for (String key : nt.romeToArab().keySet()) {
                            if (firstNumber.equals(key)) {
                                num1 = nt.romeToArab().get(key);
                            }
                        }
                        for (String key : nt.romeToArab().keySet()) {
                            if (secondNumber.equals(key)) {
                                num2 = nt.romeToArab().get(key);
                            }
                        }

                        if (num1 == 0 && num2 == 0) {
                            System.out.println("Результат: " + calc.sub(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
                            break;
                        } else if (num2 >= num1) {
                            System.out.println("Error : в римской системе нет отрицательных чисел и 0");
                            break;
                        } else if (num1 == 0 || num2 == 0) {
                            System.out.println("Error: используются одновременно разные системы счисления");
                            break;
                        } else result = calc.sub(num1, num2);
                        for (int key : nt.arabToRome().keySet()) {
                            if (result == key) {
                                romanResult = nt.arabToRome().get(key);
                            }
                        }
                        System.out.println("Результат: " + romanResult);
                        break;

                    case "*":
                        for (String key : nt.romeToArab().keySet()) {
                            if (firstNumber.equals(key)) {
                                num1 = nt.romeToArab().get(key);
                            }
                        }
                        for (String key : nt.romeToArab().keySet()) {
                            if (secondNumber.equals(key)) {
                                num2 = nt.romeToArab().get(key);
                            }
                        }

                        if (num1 == 0 && num2 == 0) {
                            System.out.println("Результат: " + calc.mult(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
                            break;
                        } else if (num1 == 0 || num2 == 0) {
                            System.out.println("Error: используются одновременно разные системы счисления");
                            break;
                        } else result = calc.mult(num1, num2);
                        for (int key : nt.arabToRome().keySet()) {
                            if (result == key) {
                                romanResult = nt.arabToRome().get(key);
                            }
                        }
                        System.out.println("Результат: " + romanResult);
                        break;

                    case "/":
                        try {
                            for (String key : nt.romeToArab().keySet()) {
                                if (firstNumber.equals(key)) {
                                    num1 = nt.romeToArab().get(key);
                                }
                            }
                            for (String key : nt.romeToArab().keySet()) {
                                if (secondNumber.equals(key)) {
                                    num2 = nt.romeToArab().get(key);
                                }
                            }

                            if (num1 == 0 && num2 == 0) {
                                System.out.println("Результат: " + calc.div(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber)));
                                break;
                            } else if (num1 == 0 || num2 == 0) {
                                System.out.println("Error: используются одновременно разные системы счисления");
                                break;
                            } else result = calc.div(num1, num2);
                            for (int key : nt.arabToRome().keySet()) {
                                if (result == key) {
                                    romanResult = nt.arabToRome().get(key);
                                }
                            }
                            System.out.println("Результат: " + romanResult);
                            break;

                        } catch (ArithmeticException exception) {
                            System.out.println("Error: деление на ноль");
                            break;
                        }
                    default:
                        System.out.println("Error: не верный знак оператора, используйте (+, -, /, *)");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Ошибка ввода");
            }


    }
}





