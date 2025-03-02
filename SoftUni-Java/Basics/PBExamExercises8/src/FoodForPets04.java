import java.util.Scanner;

public class FoodForPets04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double totalCatFood = 0, totalDogFood = 0, biscuits = 0,
                totalPercent = 0, catPercent = 0, dogPercent = 0;

        for (int i = 1; i <= days; i++) {

            int dogFoodPerDay = Integer.parseInt(scanner.nextLine());
            int catFoodPerDay = Integer.parseInt(scanner.nextLine());
            totalDogFood += dogFoodPerDay;
            totalCatFood += catFoodPerDay;

            if (i % 3 == 0) {
                biscuits += (catFoodPerDay + dogFoodPerDay) * 0.1;
            }
        }

        totalPercent = ((totalCatFood + totalDogFood) / food) * 100;
        catPercent = (totalCatFood / (totalCatFood + totalDogFood)) * 100;
        dogPercent = (totalDogFood / (totalCatFood + totalDogFood)) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n" +
                "%.2f%% of the food has been eaten.\n" +
                "%.2f%% eaten from the dog.\n" +
                "%.2f%% eaten from the cat.\n", biscuits, totalPercent, dogPercent, catPercent);

    }
}
/*Ани има два домашни любимеца - куче и котка. Напишете програма, която изготвя статистика за храната на домашните
 любимци за определен брой дни. Всеки ден кучето и котката изяждат различно количество от общата им храна.
 На всеки трети ден получават награда - бисквитки. Количеството на бисквитките е 10% от общо изядената храна за деня.
Вашата програма трябва да отпечатва статистика за количеството бисквитки, които са изяли, колко процента
от първоначалното количество обща храна са изяли и колко процента от изядената храна
е изяло кучето и колко е изяла котката.
Вход
Първоначално се чете един ред:
•	Брой дни – цяло число в диапазона [1…30]
•	Общо количество храна – реално число в диапазона [0.00…10000.00]
След това за всеки ден се чете:
o	Количество изядена храна от кучето – цяло число в диапазона [10…500]
o	Количество изядена храна от котката – цяло число в диапазона [10…500]
Изход
На конзолата да се отпечатват четири реда:
•	"Total eaten biscuits: {количество изядени бисквитки}gr."
•	"{процент изядена храна}% of the food has been eaten."
•	"{процент изядена храна от кучето}% eaten from the dog."
•	"{процент изядена храна от котката}% eaten from the cat."
Количеството изядени бисквитки трябва да бъде закръглено до най – близкото цяло число, а процентът храна трябва да бъде форматиран до втората цифра след десетичния знак.
*/