package InnerClass;

import javax.swing.*;

/**
 * create by zhangquankang on 2020/5/30
 */
public class InnerClass {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

}
