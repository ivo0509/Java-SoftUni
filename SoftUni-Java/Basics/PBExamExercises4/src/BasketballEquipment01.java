import java.util.Scanner;

public class BasketballEquipment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sneakersPrice = 0, outfitPrice = 0, ballPrice = 0, accessories = 0;
        double yearlyFee = Integer.parseInt(scanner.nextLine());

        sneakersPrice = yearlyFee - (yearlyFee * 0.4);
        outfitPrice = sneakersPrice - (sneakersPrice * 0.2);
        ballPrice = outfitPrice / 4;
        accessories = ballPrice / 5;

        System.out.printf("%.2f", yearlyFee + sneakersPrice + outfitPrice +
                ballPrice + accessories);
    }
}
/*Джеси решава, че иска да се занимава с баскетбол, но за да тренира е нужна екипировка.
Напишете програма, която изчислява какви разходи ще има Джеси, ако започне да тренира,
като знаете колко е таксата за тренировки по баскетбол за период от 1 година. Нужна екипировка:
•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
Вход
От конзолата се четe 1 ред:
•	Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]
Изход
Да се отпечата на конзолата колко ще са разходите на Джеси, ако започне да спортува баскетбол.
Сумата да бъде форматирана до втория знак след десетичния знак.
*/