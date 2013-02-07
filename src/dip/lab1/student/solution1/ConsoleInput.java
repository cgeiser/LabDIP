package dip.lab1.student.solution1;

import java.util.Scanner;

/**
 *
 * @author cgeiser
 */
public class ConsoleInput implements InputStrategy {

    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        String text;
        
        do {
            System.out.println("Enter the text to copy:");
            text = keyboard.nextLine();
        }
        while (text.length() == 0 || text == null);
        
        return text;
    }
    
}
