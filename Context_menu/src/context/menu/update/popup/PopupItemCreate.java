package context.menu.update.popup;

import context.menu.update.frame.Frame;
import context.menu.update.task.Task;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PopupItemCreate implements IPopupItem {

    static JMenuItem menuNewOne = new JMenuItem("Добавить задачу");

    @Override
    public JMenuItem addItem() {
        //         Обработа слушателя меню
//         Действия при нажатии 'Добавить задачу'
        menuNewOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel label = Frame.getInstance().taskList.get(Task.index);
                String text = Task.makeNewTask();
                label.setText(text);
            }
        });
        return menuNewOne;
    }
}
