package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * create by zhangquankang on 2020/5/30
 */
public class Lambda {
    public static void main(String[] args) {
        String plants[] = new String[] {
                "Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"
        };
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted by length:");
        Arrays.sort(plants,(first,second) -> first.length() - second.length());
        System.out.println(Arrays.toString(plants));

        Timer t = new Timer(1000,event -> System.out.println("The time is " + new Date()));

        // Timer t = new Timer(1000,System.out::println);

        t.start();
        JOptionPane.showMessageDialog(null,"Quit Program?");
        System.exit(0);
    }

}
