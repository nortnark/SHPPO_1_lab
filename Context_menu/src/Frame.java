import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Frame extends JFrame{
    int taskCount = 0;
    JLabel num1 = new JLabel("1.");
    JLabel num2 = new JLabel("2.");
    JLabel num3 = new JLabel("3.");
    JLabel firstTask = new JLabel("f");
    JLabel secondTask = new JLabel("d");
    JLabel thirdTask = new JLabel("d");

    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Демонстрация контекстного меню");
        setLayout(new GridLayout(3,2));
        Font font = new Font("Serif", Font.PLAIN, 25);

        num1.setFont(font);
        firstTask.setFont(font);
        firstTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                firstTask.setForeground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                firstTask.setForeground(Color.BLACK);
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        num2.setFont(font);
        secondTask.setFont(font);
        secondTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                firstTask.setForeground(Color.cyan);
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                firstTask.setForeground(Color.BLACK);
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        num3.setFont(font);
        thirdTask.setFont(font);
        thirdTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                firstTask.setForeground(Color.yellow);
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                firstTask.setForeground(Color.BLACK);
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        add(num1);
        add(firstTask,"wrap");
        add(num2);
        add(secondTask);
        add(num3);
        add(thirdTask);

        pack();
        setSize(600,300);
        setLocation(650,365);
        setVisible(true);
    }
}
