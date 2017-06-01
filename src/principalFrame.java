import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by robert on 5/30/17.
 */
public class principalFrame{


    JButton veiwBtn, editBtn, insertBtn, deleteBtn;

    public principalFrame(){

        JFrame frame = new JFrame("Data Base");
        frame.setLayout(new GridLayout(2,2));

        veiwBtn = new JButton();
        veiwBtn.setText("Veiw");
        veiwBtn.addActionListener(new listenerBotons());

        editBtn = new JButton();
        editBtn.setText("Edit");
        editBtn.addActionListener(new listenerBotons());

        insertBtn = new JButton();
        insertBtn.setText("Insert");
        insertBtn.addActionListener(new listenerBotons());

        deleteBtn = new JButton();
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new listenerBotons());

        frame.add(veiwBtn);
        frame.add(editBtn);
        frame.add(insertBtn);
        frame.add(deleteBtn);

        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.setLocation(300, 50);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public class listenerBotons implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

           if (e.getSource().equals(veiwBtn)) {
               new veiwFrame();
           }

           else if (e.getSource().equals(deleteBtn)){
               new deleteFrame();
           }

           else if(e.getSource().equals(editBtn)){
               new editFrame();
           }

           else if(e.getSource().equals(insertBtn)){
               new insertFrame();
           }
        }


    }
}
