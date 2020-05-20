package context.menu.update.task;
import context.menu.update.frame.Frame;
import context.menu.update.popup.FramePopupMenu;
import context.menu.update.popup.Popup;
import context.menu.update.popup.PopupBuilder;
import context.menu.update.popup.TaskPopupMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Task {

    // Объявление используемой переменной
    //==================
    static JLabel task = new JLabel("");
    public static int index;
    static PopupBuilder builderFrame = new FramePopupMenu();
    static PopupBuilder builderTask =  new TaskPopupMenu();
    //==================

    //Метод класса Task для создания новой задачи
    public static String makeNewTask() {
        String check;
        check = JOptionPane.showInputDialog("Новая задача: ");
        if (check != null) {
            JOptionPane.showMessageDialog(null, "Задача добавлена.");
            task.setText("     " + check);
        }
        return task.getText();
    }

    //==================

    //Метод класса Task для изменения существующей задачи
    public static String editTheTask() {
        String check;
        String message = "Изменить задачу '" + task.getText() + "': ";
        check = JOptionPane.showInputDialog(message);
        if (check != null && !check.equals(task.getText())) {
            JOptionPane.showMessageDialog(null, "Задача изменена.");
            task.setText("     " + check);
        }
        return task.getText();
    }

    //==================

    //Метод класса Task для удаления задачи
    public static String deleteTheTask() {
        JOptionPane.showMessageDialog(null, "Задача "+ task.getText() + " удалена.");
        task.setText("");
        return task.getText();
    }

    //==================

    // Геттер для вывода значения приватной переменной
    public static JLabel getTask() {
        task.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) { }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                Popup menu;
                if (task.getText().equals("")) {
                    menu = null;
                    menu = builderFrame.buildPopup();
                } else {
                    menu = null;
                    menu = builderTask.buildPopup();
                }

                menu.show(Frame.getInstance(), mouseEvent.getX(), mouseEvent.getY());
                index = Frame.getInstance().taskList.indexOf(task);
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) { }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                task.setForeground(Color.pink);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                task.setForeground(Color.black);
            }
        });
        return task;
    }
}
