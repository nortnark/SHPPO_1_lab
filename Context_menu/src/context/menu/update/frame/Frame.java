package context.menu.update.frame;

import context.menu.update.task.Task;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame{

    // Создаем метки
    public JLabel firstTask = new Task().getTask();
//    public JLabel secondTask = new Task().getTask();
//    public JLabel thirdTask = new Task().getTask();
    public JLabel instruction = new JLabel("Нажмите ПКМ для взаимодействия.");
    //==========================================================//

    public ArrayList<JLabel> taskList = new ArrayList<>();
    // ===========
    private static Frame instance = null;

    //========//

    private Frame() {

        //========================
        taskList.add(firstTask);
//        taskList.add(secondTask);
//        taskList.add(thirdTask);
        //========================

        // Закрытие при нажатии на кнопку "закрыть"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Заголовок фрейма
        setTitle("Демонстрация контекстного меню");
        // Слой для размещения элементов интерфейса
        setLayout(new GridLayout(2,1));

        // Установим шрифт меток
        Font font = new Font("Serif", Font.PLAIN, 25);
        instruction.setFont(font);
        firstTask.setFont(font);
//        secondTask.setFont(font);
//        thirdTask.setFont(font);

        // Добавление элементов на слой
        add(instruction);
        add(firstTask);
//        add(secondTask);
//        add(thirdTask);


        // Устанавливаем размеры окна, его положение на экране и видимость
        setSize(600,300);
        setLocation(650,365);
        setVisible(true);
    }
    //=======
    public static Frame getInstance(){
        if (instance == null) {
            instance = new Frame();
        }
        return instance;
    }
}