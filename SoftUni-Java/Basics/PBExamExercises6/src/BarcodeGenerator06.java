import java.util.Scanner;

public class BarcodeGenerator06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int f4 = n % 10;
        int f3 = (n / 10) % 10;
        int f2 = (n / 100) % 10;
        int f1 = (n / 1000) % 10;

        int h4 = m % 10;
        int h3 = (m / 10) % 10;
        int h2 = (m / 100) % 10;
        int h1 = (m / 1000) % 10;

        for (int i = f1; i <= h1; i++)
        {
            for (int j = f2; j <= h2; j++)
            {
                for (int l = f3; l <= h3; l++)
                {
                    for (int w = f4; w <= h4; w++)
                    {
                        if (i % 2 != 0 && j % 2 != 0 && l % 2 != 0 && w % 2 != 0)
                        {
                            System.out.print("" +i+j+l+w+" ");
                        }
                    }
                }
            }
        }

    }
}
/*Техниката в магазин за коледни украси се разваля. Артикулите, които съдържат четни числа в своя баркод
не могат да бъдат маркирани от касиерите. Вашата задача е, да напишете програма, която генерира всички баркодове,
които НЕ съдържат четни цифри в себе си.
Вход:
•	Две четирицифрени числа, които показват обхвата на баркодовете, които трябва да промените.
•	Първи ред – четирицифрено число – началото на обхвата. Цяло число в интервала [1000…9999]
•	Втори ред – четирицифрено число – края на обхвата. Цяло число в интервала [1000…9999]
Изход:
На конзолата трябва да се отпечатат всички "баркодове", които НЕ съдържат четна цифра в себе си, разделени с интервал.
*/