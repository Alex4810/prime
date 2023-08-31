import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        getAndSetInput();
    }
    public static int input = 0;
    public static void getAndSetInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number to calculate with: \n");
        input = scan.nextInt();
        if(input < 0) {
            input = input * (-1);
            System.out.println("-" + input + " is a negative number. Proceeding calculation with " + input);
        }
        else if(input ==1 || input==0)   {
            System.out.println(input +" is too small to be a prime number. Therefore, there are no prime numbers less than" +input);
            return;
        }
        else    {
            if(isPrime(input))    {
                System.out.println(input + " is prime.");
            }
            else    {
                System.out.println(input + " is not prime.");
            }
        }
    }
    public static boolean isPrime(int num)   {
        if(num == 2)    {
            return true;
        }
        else if(num ==1)    {
            return false;
        }
        else {
            for (int i = 2; i <= (Math.sqrt(num) + 1) + 1; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}