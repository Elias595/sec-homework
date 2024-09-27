public class Main {
    public static void main(String[] args) {
        NumberTester tester = new NumberTester("numbers.txt");

        tester.setOddEvenTester(number -> number % 2 == 0);
        tester.setPrimeTester(NumberTester::isPrime);
        tester.setPalindromeTester(NumberTester::isPalindrome);

        tester.testFile();
    }
}

