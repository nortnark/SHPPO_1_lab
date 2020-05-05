import javafx.scene.input.MouseButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class PopupMenu implements MouseListener {
    static Frame frame;
    static JPopupMenu popupMenu;
    public PopupMenu(){
        frame = new Frame();
        popupMenu = new JPopupMenu();
        //addItemListener
        frame.firstTask.addMouseListener(this);
        frame.secondTask.addMouseListener(this);
        frame.thirdTask.addMouseListener(this);
        // Элементы меню
        JMenuItem menuNewOne = new JMenuItem("Добавить задачу");
        JMenuItem menuEditOne = new JMenuItem("Изменить");
        JMenuItem menuDeleteOne = new JMenuItem("Удалить");
        JMenuItem menuDeleteAll = new JMenuItem("Удалить все");

    }
    @Override
    public void mouseEntered(MouseEvent m) {

    }
    @Override
    public void mouseExited(MouseEvent m) {

    }
    @Override
    public void mouseClicked(MouseEvent m){
    }
    @Override
    public void mousePressed(MouseEvent m){
//        frame.firstTask.setForeground(Color.red);
//        frame.secondTask.setForeground(Color.cyan);
//        frame.thirdTask.setForeground(Color.yellow);
    }
    @Override
    public void mouseReleased(MouseEvent m){
//        frame.firstTask.setForeground(Color.black);
//        frame.secondTask.setForeground(Color.black);
//        frame.thirdTask.setForeground(Color.black);
    }
}
