import javax.swing.*;

class Task {
    private String task;

    public String getTask() {
        return task;
    }

    void makeNewTask() {
        task = JOptionPane.showInputDialog("Новая задача: ");
        JOptionPane.showMessageDialog(null, "Задача добавлена.");
    }
    void editTheTask() {
        String message = "Изменить задачу '" + task + "': ";
        task = JOptionPane.showInputDialog(message);
        JOptionPane.showMessageDialog(null, "Задача изменена.");
    }
    void deleteTheTask() {
        JOptionPane.showMessageDialog(null, "Задача "+ task + " удалена.");
        task = null;
    }
}
