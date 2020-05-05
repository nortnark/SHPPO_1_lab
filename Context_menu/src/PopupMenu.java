import javax.swing.*;

// Класс контекстного меню
class PopupMenu {
    // Объявление используемых объектов
    static JPopupMenu popupMenuTask;
    static JPopupMenu popupMenuFrame;
    static Task task;

    // Элементы контектсного меню
    JMenuItem menuNewOne = new JMenuItem("Добавить задачу");
    JMenuItem menuEditOne = new JMenuItem("Изменить");
    JMenuItem menuDeleteOne = new JMenuItem("Удалить");

    public PopupMenu(){
        // Создадим объекты классов Task и JPopupMenu
        task = new Task();
        popupMenuTask = new JPopupMenu();
        popupMenuFrame = new JPopupMenu();
        // Добавим элементы в контекстное меню
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
    // Метод, вызываемый при нажатии пункта 'Добавить задачу'
    public Task menuNewTask() {
        // Вызов метода класса Task
        task.makeNewTask();
        return task;
    }
    // Метод, вызываемый при нажатии пункта 'Изменить'
    public Task menuEditTask() {
        // Вызов метода класса Task
        task.editTheTask();
        return task;
    }
    // Метод, вызываемый при нажатии пункта 'Удалить'
    public Task menuDeleteTask() {
        // Вызов метода класса Task
        task.deleteTheTask();
        return task;
    }
}
