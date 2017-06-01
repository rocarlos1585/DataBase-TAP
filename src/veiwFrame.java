import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by robert on 5/31/17.
 */
public class veiwFrame {

    JPanel jpVeiwBotons;
    JPanel jpVeiwData;

    public veiwFrame(){

        JFrame veiw = new JFrame("Veiw");
        veiw.setLayout(null);

        JPanelData();
        JPanelBotons();


        jpVeiwData.setBounds(0,0,800,500);
        jpVeiwBotons.setBounds(0,500,800,100);

        jpVeiwData.setBorder(BorderFactory.createBevelBorder(1));
        jpVeiwBotons.setBorder(BorderFactory.createBevelBorder(1));

        veiw.add(jpVeiwData);
        veiw.add(jpVeiwBotons);



        veiw.setFocusable(true);
        veiw.requestFocusInWindow();
        veiw.setLocation(300, 50);
        veiw.setResizable(true);
        veiw.setVisible(true);
        veiw.setSize(800,600);
        veiw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void JPanelData(){
        jpVeiwData = new JPanel(new FlowLayout());

    }


    public void JPanelBotons(){
        jpVeiwBotons = new JPanel(new FlowLayout());

        JButton acceptBoton = new JButton("Aceptar");
        acceptBoton.addActionListener(new listenerBotons());

        JButton cancelBoton = new JButton("Cancelar");
        cancelBoton.addActionListener(new listenerBotons());

        jpVeiwBotons.add(acceptBoton);
        jpVeiwBotons.add(cancelBoton);

        jpVeiwBotons.setVisible(true);
    }

    public class listenerBotons implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
