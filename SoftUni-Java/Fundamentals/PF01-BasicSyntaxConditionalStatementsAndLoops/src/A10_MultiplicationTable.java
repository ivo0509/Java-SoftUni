import java.util.Scanner;

public class A10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }
}
/*You will receive an integer as input from the console.
Print the 10 times table for this integer. See the examples
below for more information.*/