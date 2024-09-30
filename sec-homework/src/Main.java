import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      methodNumberTester();
    }
    private static void methodNumberTester()
    {
        NumberTester tester = new NumberTester("numbers.txt");

        tester.setOddEvenTester(number -> number % 2 == 0);
        tester.setPrimeTester(NumberTester::isPrime);
        tester.setPalindromeTester(NumberTester::isPalindrome);

        tester.testFile();

        methodCalculators();
    }
    private static void methodCalculators()
    {
                Scanner scanner = new Scanner(System.in);
                AbstractCalculator calculator = null;

                while (true) {
                    System.out.println("Choose calculator:");
                    System.out.println("1 = Rational calculator");
                    System.out.println("2 = Vector calculator");
                    System.out.println("3 = Complex calculator");
                    System.out.println("4 = Exit program");
                    System.out.print("> ");
                    int choice = scanner.nextInt();

                    if (choice == 4) {
                        System.out.println("Exiting program...");
                        break;
                    }

                    switch (choice) {
                        case 1:
                            calculator = new RationalCalculator();
                            break;
                        case 2:
                            calculator = new VectorCalculator();
                            break;
                        case 3:
                            calculator = new ComplexCalculator();
                            break;
                        default:
                            System.out.println("Invalid choice, try again.");
                            continue;
                    }

                    System.out.print("Enter number x a> ");
                    double xA = scanner.nextDouble();
                    System.out.print("Enter number x b> ");
                    double xB = scanner.nextDouble();
                    Number x = new Number(xA, xB);

                    System.out.print("Enter number y a> ");
                    double yA = scanner.nextDouble();
                    System.out.print("Enter number y b> ");
                    double yB = scanner.nextDouble();
                    Number y = new Number(yA, yB);

                    System.out.println("Choose operation:");
                    System.out.println("1 = add");
                    System.out.println("2 = subtract");
                    System.out.println("3 = multiply");
                    System.out.println("4 = divide");
                    System.out.println("5 = enter numbers again");
                    System.out.print("> ");
                    int operation = scanner.nextInt();

                    Number result = null;

                    switch (operation) {
                        case 1:
                            result = calculator.add(x, y);
                            break;
                        case 2:
                            result = calculator.subtract(x, y);
                            break;
                        case 3:
                            result = calculator.multiply(x, y);
                            break;
                        case 4:
                            result = calculator.divide(x, y);
                            break;
                        case 5:
                            continue;
                        default:
                            System.out.println("Invalid operation, try again.");
                            continue;
                    }

                    System.out.println("=========================");
                    System.out.println("Solution:");
                    System.out.println(result);
                    System.out.println("=========================");
                }

                scanner.close();
            }
}

