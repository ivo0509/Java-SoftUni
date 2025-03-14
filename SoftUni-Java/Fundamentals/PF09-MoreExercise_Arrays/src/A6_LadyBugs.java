import java.util.Arrays;
import java.util.Scanner;

public class A6_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int[] ladyBugsField = new int[length];
        int[] initialBugsIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input;

        for (int i = 0; i < initialBugsIndexes.length; i++) {

            if (initialBugsIndexes[i] >= 0 && initialBugsIndexes[i] < ladyBugsField.length) {
                ladyBugsField[initialBugsIndexes[i]] = 1;
            }
        }

        while (!(input = scanner.nextLine()).equals("end")) {

            String[] command = input.split(" ");
            int indexFrom = Integer.parseInt(command[0]);
            String direction = command[1];
            int indexTo = Integer.parseInt(command[2]);
            //int flyDistance = Math.abs(indexFrom - indexTo);

            if (indexFrom < 0 || indexFrom >= ladyBugsField.length || ladyBugsField[indexFrom] == 0) {
                continue;
            }

            ladyBugsField[indexFrom] = 0;
            int currentIndex = indexTo;

            if (direction.equals("right")) {
                while (indexFrom + currentIndex < ladyBugsField.length && indexFrom + currentIndex >= 0) {
                    if (ladyBugsField[indexFrom + currentIndex] == 0) {
                        ladyBugsField[indexFrom + currentIndex] = 1;
                        break;
                    } else {
                        currentIndex += indexTo;
                    }
                }
            } else if (direction.equals("left")) {
                while (indexFrom - currentIndex >= 0 && indexFrom - currentIndex < ladyBugsField.length) {
                    if (ladyBugsField[indexFrom - currentIndex] == 0) {
                        ladyBugsField[indexFrom - currentIndex] = 1;
                        break;
                    } else {
                        currentIndex += indexTo;
                    }
                }
            }
        }

        for (int nums : ladyBugsField) {
            System.out.print(nums + " ");
        }
    }
}
/*You are given a field size and the indexes of ladybugs inside the field. After that, on every new line,
until the "end" command is given, a ladybug changes its position to its left or right by a given fly length.
A command to a ladybug looks like this: "0 right 1". This means that the little insect placed on index 0 should
fly one index to its right. If the ladybug lands on a fellow ladybug, it continues to fly in the same direction
by the same fly length. If the ladybug flies out of the field, it is gone.
For example, imagine you are given a field with size 3 and ladybugs on indexes 0 and 1. If the ladybug on index 0
needs to fly to its right by the length of 1 (0 right 1) it will attempt to land on index 1, but as there is
another ladybug there, it will continue further to the right by an additional length of 1, landing on index 2.
After that, if the same ladybug needs to fly to its right by the length of 1 (2 right 1), it will land somewhere
outside the field, so it flies away.
If you are given a ladybug index that does not have a ladybug there, nothing happens. If you are given a ladybug
index that is outside the field, nothing happens.
Your job is to create the program, simulating the ladybugs flying around doing nothing. In the end, print all cells
in the field separated by blank spaces. For each cell that has a ladybug on it print '1' and for each empty cell
print '0'. For the example above, the output should be '0 1 0'.
Input:
•	On the first line, you will receive an integer - the size of the field.
•	On the second line, you will receive the initial indexes of all ladybugs separated by a blank space.
The given indexes may or may not be inside the field range.
•	On the next lines, until you get the "end" command you will receive commands in the format:
"{ladybug index} {direction} {fly length}".
Output:
•	Print the all cells within the field in format: "{cell} {cell} … {cell}"
o	If a cell has a ladybug in it, print '1'.
o	If a cell is empty, print '0' .
Constraints
•	The size of the field will be in the range [0 … 1000].
•	The ladybug indexes will be in the range [-2,147,483,647 … 2,147,483,647].
•	The number of commands will be in the range [0 … 100].
•	The fly length will be in the range [-2,147,483,647 … 2,147,483,647].*/