import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComLineAdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and you'll get a boxing combo! :");
        int num = getUserInput(sc);
        ArrayList<String> moves = new ArrayList<>(List.of("Jab", "Cross", "Hook", "Uppercut", "Body Jab",
                "Body UpperCut", "Body Hook", "Body Cross", "Slip", "Duck", "Weave", "Bob", "Block", "Parry", "Roll"));
        ArrayList<String> combo = null;
        for (int i = 0; i < num; i++) {
            int rand = (int) (Math.random() * moves.size());
            assert false;
            combo.add(moves.get(rand));
        }
    }

    public static int getUserInput(Scanner sc) {
        String input = sc.nextLine();
        if(input.matches("[0-9]+") && !input.isEmpty()) {
            return Integer.parseInt(input);
        } else {
            System.out.println("Please enter a valid number!");
            return getUserInput(sc);
        }
    }
}