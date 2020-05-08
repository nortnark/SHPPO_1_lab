import javax.swing.*;

class Task {
    // Объявление используемой переменной
    private String task = "";

    // Геттер для вывода значения приватной переменной
    public String getTask() {
        return task;
    }
    //Метод класса Task для создания новой задачи
    void makeNewTask() {
        String check;
        check = JOptionPane.showInputDialog("Новая задача: ");
        if (check != null) {
            JOptionPane.showMessageDialog(null, "Задача добавлена.");
            task = check;
        }
    }
    //Метод класса Task для изменения существующей задачи
    void editTheTask() {
        String check;
        String message = "Изменить задачу '" + task + "': ";
        check = JOptionPane.showInputDialog(message);
        if (check != null && !check.equals(task)) {
            JOptionPane.showMessageDialog(null, "Задача изменена.");
            task = check;
        }
    }
    //Метод класса Task для удаления задачи
    void deleteTheTask() {
        JOptionPane.showMessageDialog(null, "Задача "+ task + " удалена.");
        task = "";
    }
}
