import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String fileName;


    public NumberTester(String fileName) {
        this.fileName = "numbers.txt";
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int numberOfTests = Integer.parseInt(reader.readLine());
            for(int i = 0; i < numberOfTests;i++) {
                String[]parts = reader.readLine().split(" ");
                int testCases = Integer.parseInt(parts[0]);
                int number = Integer.parseInt(parts[1]);
                switch (testCases) {
                    case 1:    if(oddTester.testNumber(number)) {
                        System.out.println("EVEN");
                    }else
                    {
                        System.out.println("ODD");
                    }
                    break;
                    case 2: if(primeTester.testNumber(number)){
                        System.out.println("PRIME");
                    }else
                    {
                        System.out.println("NO PRIME");
                    }
                    break;
                    case 3: if(palindromeTester.testNumber(number)){
                        System.out.println("PALINDROME");
                    }else
                    {
                        System.out.println("NO PALINDROME");
                    }
                    break;
                    default:
                        System.out.println("UNKNOWN TEST");
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isPrime(int number) {
        if(number <= 1){return false;}
        for(int i = 2; i < Math.sqrt(number);i++)
        {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        return str.equals(new StringBuilder(str).reverse().toString());

    }
}
