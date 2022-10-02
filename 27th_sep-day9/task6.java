
import java.util.*;

public class task6 {

    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a number");
            number=sc.nextInt();
        }
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        System.out.println(length);

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, length);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}