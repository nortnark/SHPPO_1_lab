import javax.swing.*;

class Task {
    // Объявление используемой переменной
    private String task = null;

    // Геттер для вывода значения приватной переменной
    public String getTask() {
        return task;
    }
    //Метод класса Task для создания новой задачи
    void makeNewTask() {
        task = JOptionPane.showInputDialog("Новая задача: ");
        if (task != null) {
            JOptionPane.showMessageDialog(null, "Задача добавлена.");
        }
    }
    //Метод класса Task для изменения существующей задачи
    void editTheTask() {
        String message = "Изменить задачу '" + task + "': ";
        task = JOptionPane.showInputDialog(message);
        JOptionPane.showMessageDialog(null, "Задача изменена.");
    }
    //Метод класса Task для удаления задачи
    void deleteTheTask() {
        JOptionPane.showMessageDialog(null, "Задача "+ task + " удалена.");
        task = "";
    }
}
