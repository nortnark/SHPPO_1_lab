import javax.swing.*;
import java.awt.*;

class Frame extends JFrame{
    // Создаем метки
    JLabel firstTask = new JLabel("");
    JLabel secondTask = new JLabel("");
    JLabel thirdTask = new JLabel("");
    JLabel instruction = new JLabel("Нажмите ПКМ для взаимодействия.");

    public Frame() {
        // Закрытие при нажатии на кнопку "закрыть"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Заголовок фрейма
        setTitle("Демонстрация контекстного меню");
        // Слой для размещения элементов интерфейса
        setLayout(new GridLayout(4,1));

        // Установим шрифт меток
        Font font = new Font("Serif", Font.PLAIN, 25);
        instruction.setFont(font);
        firstTask.setFont(font);
        secondTask.setFont(font);
        thirdTask.setFont(font);

        // Добавление элементов на слой
        add(instruction);
        add(firstTask);
        add(secondTask);
        add(thirdTask);

        // Устанавливаем размеры окна, его положение на экране и видимость
        setSize(600,300);
        setLocation(650,365);
        setVisible(true);
    }
}
