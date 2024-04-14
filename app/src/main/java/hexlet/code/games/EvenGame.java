package hexlet.code.games;


import java.util.Scanner;

public class EvenGame {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");


        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

       var isAnswright = true;
       var attempts  = 0;

       while (isAnswright && attempts < 3) {
           var numb = (int) (Math.random() * 10);
           System.out.println("Question: " + numb);
           System.out.println("Your answer: ");


           var playerAnsw = scanner.next();
           if (numb % 2 == 0 && playerAnsw.equalsIgnoreCase("yes")) {
               System.out.println("Correct!");
               attempts++;
           }
           if (numb % 2 == 0 && playerAnsw.equalsIgnoreCase("no")) {
               System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                       "Let's try again, " + name);
               isAnswright = false;
           }
           if (numb % 2 != 0 && playerAnsw.equalsIgnoreCase("no")) {
               System.out.println("Correct!");
               attempts++;
           }
           if (numb % 2 != 0 && playerAnsw.equalsIgnoreCase("yes")) {
               System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                       "Let's try again, " + name);
               isAnswright = false;
           }

       }
    }

}
