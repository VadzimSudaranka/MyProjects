import java.util.Random;
import java.util.Scanner;

public class simpleGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner (System.in);

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed){
            System.out.println("Write a number: ");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess){
                System.out.println("Your number is too small, try another one");

            }else if(userNumber > numberToGuess){
                System.out.println("Your number is too big, try another one ");

            }else{
                System.out.println("Gratulations!!!:))");
                wasNumberGuessed = true;
            }
        }


    }
}
