import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Frame extends JFrame{
    int taskCount = 0;
    JLabel firstTask = new JLabel("1. ");
    JLabel secondTask = new JLabel("");
    JLabel thirdTask = new JLabel("");
    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Демонстрация контекстного меню");
        setLayout(new GridLayout(3,1));
        Font font = new Font("Serif", Font.PLAIN, 25);
        firstTask.setFont(font);
        secondTask.setFont(font);
        thirdTask.setFont(font);



        add(firstTask);
        add(secondTask);
        add(thirdTask);

        pack();
        setSize(600,300);
        setLocation(650,365);
        setVisible(true);
    }
}
