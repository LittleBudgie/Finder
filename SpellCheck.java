import java.util.Scanner;

public class SpellCheck {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi there! This program can check your paragraphs \nfor any words that you do not want to have, kind of like a Command/Control F!");
        System.out.println("First enter the sentence(s) you want checked: ");
        String sentences = scan.nextLine();
        System.out.print("Great work! Now insert the phrase you want to check for: ");
        String find = scan.nextLine();
        System.out.println("Checking...");
        if (sentences.indexOf(find) != -1) {
            System.out.println("Sorry, you do have " + find + " in your sentence(s).");
        }
        else {
            System.out.println("Great job! We didn't catch a single " + find + " in your sentence!");
        }
    }
}
