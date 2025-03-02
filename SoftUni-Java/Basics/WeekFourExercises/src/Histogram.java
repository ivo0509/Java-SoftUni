import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1 += 1;
            } else if (number >= 200 && number < 400) {
                p2 += 1;
            } else if (number >= 400 && number < 600) {
                p3 += 1;
            } else if (number >= 600 && number < 800) {
                p4 += 1;
            } else {
                p5 +=1;
            }
        }

        p1 = (p1 / n) * 100;
        p2 = (p2 / n) * 100;
        p3 = (p3 / n) * 100;
        p4 = (p4 / n) * 100;
        p5 = (p5 / n) * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", p1, p2, p3, p4, p5);

    }
}
