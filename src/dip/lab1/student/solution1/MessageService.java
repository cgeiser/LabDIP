package dip.lab1.student.solution1;

/**
 *
 * @author cgeiser
 */
public class MessageService {
    
    public void outputMsg(InputStrategy in, OutputStrategy out) {
        out.outputMsg(in.getInput());
    }
}
