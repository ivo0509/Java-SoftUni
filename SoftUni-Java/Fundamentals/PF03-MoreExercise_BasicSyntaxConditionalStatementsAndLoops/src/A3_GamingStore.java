import java.util.Scanner;

public class A3_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double remainingBudget = budget;
        String input = scanner.nextLine();
        double totalPrice = 0, pricePerGame = 0;
        boolean outOfMoney = false;

        while (!input.equals("Game Time")) {

            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    pricePerGame = 39.99;
                    break;
                case "CS: OG":
                    pricePerGame = 15.99;
                    break;
                case "Zplinter Zell":
                    pricePerGame = 19.99;
                    break;
                case "Honored 2":
                    pricePerGame = 59.99;
                    break;
                case "RoverWatch":
                    pricePerGame = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }

            if (remainingBudget - pricePerGame == 0) {
                remainingBudget -= pricePerGame;
                totalPrice += pricePerGame;
                System.out.printf("Bought %s\n", input);
                outOfMoney = true;
                break;
            } else if (remainingBudget > pricePerGame) {
                remainingBudget -= pricePerGame;
                totalPrice += pricePerGame;
                System.out.printf("Bought %s\n", input);
            } else {
                System.out.println("Too Expensive");
            }

            input = scanner.nextLine();
        }

        if (outOfMoney) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalPrice, budget - totalPrice);
        }
    }
}
/*Write a program that helps you buy the games. The valid games are the following games in this table:
OutFall 4 $39.99
CS: OG $15.99
Zplinter Zell $19.99
Honored 2 $59.99
RoverWatch $29.99
RoverWatch Origins Edition $39.99
On the first line, you will receive your current balance – a floating-point number in the range [0.00…5000.00].
Until you receive the command "Game Time", you have to keep buying games. When a game is bought, the user's
balance decreases by the price of the game.
Additionally, the program should obey the following conditions:
· If a game the user is trying to buy is not present in the table above, print "Not Found" and read the next line.
· If at any point, the user has $0 left, print "Out of money!" and end the program.
· Alternatively, if the user is trying to buy a game that they can't afford, print "Too Expensive" and read the next line.
When you receive "Game Time", print the user's remaining money and total spent on games, rounded to the 2nd decimal place.*/