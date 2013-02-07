
package dip.lab1.student.solution1;

/**
 *
 * @author cgeiser
 */
public class DipPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        InputStrategy in = new ConsoleInput();
        InputStrategy in = new GuiInput();
//        OutputStrategy out = new ConsoleOutput();
        OutputStrategy out = new GuiOutput();
        MessageService msgSrvs = new MessageService();
        
        msgSrvs.outputMsg(in, out);
    }
}
