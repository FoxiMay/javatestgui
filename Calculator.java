import javax.swing.*;
public class Calculator{
    public static void main (String args[]){
        JFrame a = new
        JFrame("GUI");
        JButton b = new
        JButton("Button");
        JLabel c;
        c = new
        JLabel("MY JAVA PROGRAM");

        b.setBounds(0, 0, 85, 20);
        c.setBounds(0, 30, 200, 20);
        a.add(b);
        a.add(c);
        a.setSize(500, 500);
        a.setLayout(null);
        a.setVisible(true);

    }
}
