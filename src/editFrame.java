import javax.swing.*;

/**
 * Created by robert on 5/31/17.
 */
public class editFrame {

    public editFrame(){

        JFrame edit = new JFrame("Edit");






        edit.setFocusable(true);
        edit.requestFocusInWindow();
        edit.setLocation(300, 50);
        edit.setResizable(true);
        edit.setVisible(true);
        edit.setSize(800,600);
        edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
