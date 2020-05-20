package context.menu.update.popup;

import context.menu.update.frame.Frame;
import context.menu.update.task.Task;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopupItemDelete implements IPopupItem{
    static JMenuItem menuDeleteOne = new JMenuItem("Удалить задачу");

    @Override
    public JMenuItem addItem() {
        //         Обработа слушателя меню
        //         Действия при нажатии 'Добавить задачу'
        menuDeleteOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // По индексу запрашивает метку, на которой было произведено нажатие,
                // вызывает метод класса PopupMenu и присваивает новое значение метке
                JLabel label = Frame.getInstance().taskList.get(Task.index);
                String text = Task.deleteTheTask();
                label.setText(text);
            }
        });
        return menuDeleteOne;
    }
}
