import java.util.Scanner;

public class A1_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scanner.nextLine());
        int numOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 0; i < numOfStudents; i++) {

            int attendance = Integer.parseInt(scanner.nextLine());
            double currentBonus = ((1.0 * attendance / numOfLectures) * (5 + additionalBonus));

            if (maxBonus < currentBonus) {
                maxBonus = currentBonus;
                maxAttendance = attendance;
            }
        }

        System.out.printf("Max Bonus: %d.\n", (int) Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
/*Create a program that calculates bonus points for each student enrolled in a course. On the first line,
you are going to receive the number of the students. On the second line, you will receive the total number of
lectures in the course. The course has an additional bonus, which you will receive on the third line. On the following
lines, you will be receiving the count of attendances for each student.
The bonus is calculated with the following formula:
{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
Find the student with the maximum bonus and print them, along with his attendances, in the following format:
"Max Bonus: {max bonus points}."
"The student has attended {student attendances} lectures."
Round the bonus points at the end to the nearest larger number.
Input / Constrains
•	On the first line, you are going to receive the number of the students – an integer in the range [0…50]
•	On the second line, you will receive the number of the lectures – an integer number in the range [0...50].
•	On the third line, you will receive the additional bonus – an integer number in the range [0….100].
•	On the following lines, you will be receiving the attendance of each student.
•	There will never be students with equal bonuses.
Output
•	Print the maximum bonus points and the attendances of the given student, rounded to the nearest larger number,
scored by a student in this course in the format described above.
*/