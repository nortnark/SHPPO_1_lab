
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PopupMenu {
    static JPopupMenu popupMenuTask;
    static JPopupMenu popupMenuFrame;
    static Task task;
    JLabel labelTry = new JLabel();
    // Элементы меню
    JMenuItem menuNewOne = new JMenuItem("Добавить задачу");
    JMenuItem menuEditOne = new JMenuItem("Изменить");
    JMenuItem menuDeleteOne = new JMenuItem("Удалить");

    public PopupMenu(){
        task = new Task();
        popupMenuTask = new JPopupMenu();
        popupMenuFrame = new JPopupMenu();


//        JMenuItem menuDeleteAll = new JMenuItem("Удалить все");

        popupMenuTask.add(menuEditOne);
        popupMenuTask.add(menuDeleteOne);
        popupMenuFrame.add(menuNewOne);


    }
    // Вывод контекстного меню для задачи
    public void showTaskMenu(Frame frame, int x, int y) {
        popupMenuTask.show(frame, x, y);
    }
    // Вывод контекстного меню для пустого поля
    public void showFrameMenu(Frame frame, int x, int y){
        popupMenuFrame.show(frame,x,y);
    }
    public Task menuNewTask() {
        task.makeNewTask();
        return task;
    }
}
