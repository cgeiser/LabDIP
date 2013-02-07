package dip.lab1.student.solution1;

/**
 *
 * @author cgeiser
 */
public class ConsoleOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg) {
        System.out.println(msg);
    }
}
