package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author cgeiser
 */
public class GuiOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
