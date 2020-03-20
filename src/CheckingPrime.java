import java.util.Scanner;

public class CheckingPrime {
    static boolean checkPrime(int number) {
        boolean status = false;
        if (number < 2) {
            System.out.println(number + " is not prime");
        } else {
            int i = 2;
            status = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    status = false;
                    break;
                }
                i++;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        if (checkPrime(number))
            System.out.println(number + " is a prime");
        else
            System.out.println(number + " is not a prime");

    }
}
