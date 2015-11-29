/*
 * Switcher.java
 */
import java.util.Scanner;

public class Switcher {

	public static void main (String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a command: ");
        String text = input.nextLine();

        switch(text) {
            case "start":
                System.out.println("machine started.");
                break;

            case "help":
                System.out.println("use 'start', 'help', or 'stop'.");
                break;

            case "stop":
                System.out.println("machine stopped.");
                break;

            default:
                System.out.println("use 'start', 'help', or 'stop'.");
        }
	}
}
