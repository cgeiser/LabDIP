package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author cgeiser
 */
public class GuiInput extends JOptionPane implements InputStrategy {

    @Override
    public String getInput() {
        
        return JOptionPane.showInputDialog(null,
                "Enter your text to copy:", "GUI Text Input",
                JOptionPane.PLAIN_MESSAGE);
    }
    
    
    
    
}
