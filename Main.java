import java.util.Scanner;

// Features: User Name, # of games played, Wins, & Losses
// Game Loop: Choose whether next number between 1-100 is high or low.  Number is displayed, game records if win or loss, cannot return the same number.

public class Main {
    static boolean gameLoop = true;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("High-Low: Building a simple terminal game to test Java\n");

        System.out.print("Enter First Name: "); // First Name Input
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: "); // Last Name Input
        String lastName = input.nextLine();

        User user = new User(firstName, lastName);
        System.out.println("\nYour Full Name: " + user.getFullName() + "\n");

        System.out.println("Player can type \"quit\" to close program.\n");

        while (gameLoop == true) { // Game play Loop
            System.out.println("\n---");
            System.out.println("Your Stats: \nGames Played: " + user.games + " | Games Won: " + user.wins + " | Winstreak: " + user.winstreak + " | Games Lost: " + user.losses);
            System.out.println("---");
            Number highLow = new Number(); // New input values
            boolean guessLoop = true;
            while (guessLoop == true) { // Player choice for guess loop
                System.out.println("(type [q] or [quit] at anytime to close)");
                System.out.println("\nNumber: " + highLow.current); // Shows what the number that was drawn
                // System.out.println("\nNext Number: " + highLow.next ); // TESTING - shows the next number that will be tested
                System.out.print("\nChoose  whether next number will be [h]igher or [l]ower: .");
                String userAction = input.nextLine().toLowerCase();
                if (userAction.equals("q") || userAction.equals("quit")) { // Quit Function
                    guessLoop = false;
                    gameLoop = false;
                    input.close();
                    System.out.println("Thanks for playing, goodbye!");
                }
                else if (userAction.equals("h")) { // Guess = new number is higher
                    if (highLow.current < highLow.next) {
                        System.out.println("Congrats! The next number was: " + highLow.next + "!");
                        user.wins += 1;
                        if (user.winstreak == 0) {
                            user.winstreak += 1;
                        } else{
                            user.winstreak += 1;
                        }
                        System.out.println("Your current winstreak: " + user.winstreak);
                    } else {
                        System.out.println("Too bad, the next number was: " + highLow.next + ".\nTry again!");
                        user.losses += 1;
                        user.winstreak = 0;
                    }
                    user.games += 1;
                    guessLoop = false; 
                }
                else if (userAction.equals("l")) { // Guess = new number is lower
                    if (highLow.current > highLow.next) {
                        System.out.println("Congrats! The next number was: " + highLow.next + "!");
                        user.wins += 1;
                        if (user.winstreak == 0) {
                            user.winstreak += 1;
                        } else{
                            user.winstreak += 1;
                        }
                        System.out.println("Your current winstreak: " + user.winstreak);
                    } else {
                        System.out.println("Too bad, the next number was: " + highLow.next + ".\nTry again!");
                        user.losses += 1;
                        user.winstreak = 0;
                    }
                    user.games += 1;
                    guessLoop = false; 
                }
                // else if (userAction.equals("s")) {
                //     System.out.println("\n---");
                //     System.out.println("Your Stats: \nGames Played: " + user.games + " | Games Won: " + user.wins + " | Winstreak: " + user.winstreak + " | Games Lost: " + user.losses);
                //     System.out.println("---");
                // }
                else {
                    System.out.println("Invalid input, try again.");
                };
            }
            
        }
    }
}