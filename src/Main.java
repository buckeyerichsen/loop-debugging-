import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);



        int num, total = 0;

        String userInput = "";

        System.out.println("enter anything to  continue, enter done to stop");
        userInput = keyboard.nextLine();

        while (!userInput.equalsIgnoreCase("done")) {
            System.out.println(userInput);
            userInput = keyboard.nextLine();

        }


    }
}
