import java.util.Scanner;

public class AddBags02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalLuggagePrice = 0;
        double price = Double.parseDouble(scanner.nextLine());
        double kgOfLuggage = Double.parseDouble(scanner.nextLine());
        int dayBeforeDeparture = Integer.parseInt(scanner.nextLine());
        int numOfLuggage = Integer.parseInt(scanner.nextLine());

        if (kgOfLuggage < 10) {
            totalLuggagePrice = price * 0.2;
        } else if (kgOfLuggage >= 10 && kgOfLuggage <= 20) {
            totalLuggagePrice = price * 0.5;
        } else {
            totalLuggagePrice = price;
        }

        if (dayBeforeDeparture < 7) {
            totalLuggagePrice = totalLuggagePrice + (totalLuggagePrice * 0.4);
        } else if (dayBeforeDeparture >= 7 && dayBeforeDeparture <= 30) {
            totalLuggagePrice = totalLuggagePrice + (totalLuggagePrice * 0.15);
        } else {
            totalLuggagePrice = totalLuggagePrice + (totalLuggagePrice * 0.1);
        }

        totalLuggagePrice = totalLuggagePrice * numOfLuggage;

        System.out.printf("The total price of bags is: %.2f lv.", totalLuggagePrice);
    }
}
/*Мими има закупени самолетни билети, но в последствие решава да си добави багаж към тях.
Таксите за багаж се изчисляват въз основа на теглото на чекирания багаж:
•	до 10кг – 20% от цената на багаж над 20кг
•	между 10кг и 20кг вкл. – 50% от цената на багаж над 20кг.
•	над 20кг – таксата се чете от конзолата
В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
•	повече от 30 дни - цената на багажа се оскъпява с 10%
•	между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
•	по-малко от 7 дни - цената на багажа се оскъпява с 40%
Напишете програма, която пресмята колко ще трябва да заплати Мими, спрямо горните условия.
Вход:
От конзолата се четат 4 реда:
1.	Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
2.	Килограми на багажа – реално число в диапазона [1.0…32.0]
3.	Дни до пътуването – цяло число в диапазона [1…60]
4.	Брой багажи – цяло число в диапазона [1…10]
Изход
Да се отпечата на конзолата сумата, която ще трябва да заплати Мими за багажите, в следния формат:
•	" The total price of bags is: {цената на багажите} lv. "
Сумата да бъде форматирана до втората цифра след десетичния знак.
*/