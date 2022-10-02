import java.util.Scanner;
class task2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        int x = sc.nextInt();


        for (int i = 0; i <= x; i++) {

            for (int j = i; j < x; j++) {

                System.out.print(" ");

            }

            for (int k = 1; k < 2 * i; k++) {

                if (k % 2 != 0)

                    System.out.print("*");

                else {

                    System.out.print(i - 1);

                }

            }

            System.out.println("");

        }

        for (int i = x - 1; i >= 0; i--) {

            for (int j = i; j < x; j++) {

                System.out.print(" ");

            }

            for (int k = 2 * i; k > 1; k--) {

                if (k == 1 || k % 2 == 0 || k % 2 == 0 && i == x - 1)

                    System.out.print("*");

                else {

                    System.out.print(i - 1);

                }


            }

            System.out.println("");
            sc.close();

        }

    }

}
