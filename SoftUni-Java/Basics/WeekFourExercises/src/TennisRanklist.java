import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int averagePoints = 0;
        double wins = 0.00, percentage = 0.00;

        for (int i = 0; i < tournaments; i++) {

            String finalist = scanner.nextLine();

            if ("W".equals(finalist)) {
                points += 2000;
                averagePoints += 2000;
                wins++;
            } else if ("F".equals(finalist)) {
                points += 1200;
                averagePoints += 1200;
            } else if ("SF".equals(finalist)) {
                points += 720;
                averagePoints += 720;
            }

        }

        averagePoints = averagePoints / tournaments;
        percentage = (wins / tournaments) * 100;

        System.out.printf("Final points: %d \n" +
                "Average points: %d\n%.2f%%",points, averagePoints, percentage);

    }
}
/*Григор Димитров е тенисист, чиято следваща цел е изкачването в световната ранглиста по тенис за мъже.
През годината Гришо участва в определен брой турнири, като за всеки турнир получава точки, които зависят от позицията, на която е завършил в турнира.
Има три варианта за завършване на турнир:
	W - ако е победител получава 2000 точки
	F - ако е финалист получава 1200 точки
	SF - ако е полуфиналист получава 720 точки
Напишете програма, която изчислява колко ще са точките на Григор след изиграване на всички турнири, като знаете с колко точки стартира сезона.
Също изчислете колко точки средно печели от всички изиграни турнири и колко процента от турнирите е спечелил.
Вход
От конзолата първо се четат два реда:
•	Брой турнири, в които е участвал – цяло число в интервала [1…20]
•	Начален брой точки в ранглистата - цяло число в интервала [1...4000]
За всеки турнир се прочита отделен ред:
•	Достигнат етап от турнира – текст – "W", "F" или "SF"
Изход
Отпечатват се три реда в следния формат:
•	"Final points: {брой точки след изиграните турнири}"
•	"Average points: {средно колко точки печели за турнир}"
•	"{процент спечелени турнири}%"
Средните точки да бъдат закръглени към най-близкото цяло число надолу, а процентът да се форматира до втората цифра след десетичния знак.
*/