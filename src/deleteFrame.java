import javax.swing.*;

/**
 * Created by robert on 5/31/17.
 */
public class deleteFrame {

    public deleteFrame(){

        JFrame delete = new JFrame("Delete");





        delete.setFocusable(true);
        delete.requestFocusInWindow();
        delete.setLocation(300, 50);
        delete.setResizable(true);
        delete.setVisible(true);
        delete.setSize(800,600);
        delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
