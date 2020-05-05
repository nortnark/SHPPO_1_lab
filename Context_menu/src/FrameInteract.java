import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
// Класс, реализующий взаимодействие классов Frame и PopupMenu
class FrameInteract{
    // Объявление используемых переменных и объектов
    int activeLabel;
    PopupMenu popupMenu = new PopupMenu();
    Frame frame = new Frame();

    //Конструктор класса
    public FrameInteract() {
        //Создание коллекциии для хранения меток и дальнейшего доступа к ним по индексу
        ArrayList<JLabel> taskList = new ArrayList<>();
        taskList.add(frame.firstTask);
        taskList.add(frame.secondTask);
        taskList.add(frame.thirdTask);

        // Обработка слушателя первой метки
        frame.firstTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                // Обработка нажатия ПКМ на метку
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    // Проверка, не является ли метка пустой
                    if (frame.firstTask.getText().equals("")) {
                        // Вызов меню пустого поля
                        popupMenu.showFrameMenu(frame, mouseEvent.getX(), mouseEvent.getY());
                    } else {
                        //Вызов меню задачи
                        popupMenu.showTaskMenu(frame, mouseEvent.getX(), mouseEvent.getY() );
                    }
                }
                // Запись номера метки для доступа по индексу при работе с PopupMenu
                activeLabel = 0;
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                // Покраска метки в розовый при наведении
                frame.firstTask.setForeground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                frame.firstTask.setForeground(Color.black);
            }
        });

        // Обработка слушателя второй метки
        frame.secondTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                // Обработка нажатия ПКМ на метку
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    // Проверка, не является ли метка пустой
                    if (frame.secondTask.getText().equals("")) {
                        // Вызов меню пустого поля
                        popupMenu.showFrameMenu(frame, mouseEvent.getX(), mouseEvent.getY());
                    } else {
                        //Вызов меню задачи
                        popupMenu.showTaskMenu(frame, mouseEvent.getX(), mouseEvent.getY() );
                    }
                }
                // Запись номера метки для доступа по индексу при работе с PopupMenu
                activeLabel = 1;
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                // Покраска метки в розовый при наведении
                frame.secondTask.setForeground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                frame.secondTask.setForeground(Color.BLACK);
            }
        });

        // Обработка слушателя третьей метки
        frame.thirdTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                // Обработка нажатия ПКМ на метку
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    // Проверка, не является ли метка пустой
                    if (frame.thirdTask.getText().equals("")) {
                        // Вызов меню пустого поля
                        popupMenu.showFrameMenu(frame, mouseEvent.getX(), mouseEvent.getY());
                    } else {
                        //Вызов меню задачи
                        popupMenu.showTaskMenu(frame, mouseEvent.getX(), mouseEvent.getY() );
                    }
                }
                // Запись номера метки для доступа по индексу при работе с PopupMenu
                activeLabel = 2;
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                // Покраска метки в розовый при наведении
                frame.thirdTask.setForeground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                frame.thirdTask.setForeground(Color.BLACK);
            }
        });

        // Обработа слушателя меню
        // Действия при нажатии 'Добавить задачу'
        popupMenu.menuNewOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // По индексу запрашивает метку, на которой было произведено нажатие,
                // вызывает метод класса PopupMenu и присваивает новое значение метке
                taskList.get(activeLabel).setText("     " + popupMenu.menuNewTask().getTask());
            }
        });
        // Действия при нажатии 'Изменить'
        popupMenu.menuEditOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // По индексу запрашивает метку, на которой было произведено нажатие,
                // вызывает метод класса PopupMenu и присваивает новое значение метке
                taskList.get(activeLabel).setText("     " + popupMenu.menuEditTask().getTask());
            }
        });
        // Действия при нажатии 'Удалить'
        popupMenu.menuDeleteOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // По индексу запрашивает метку, на которой было произведено нажатие,
                // вызывает метод класса PopupMenu и присваивает новое значение метке
                taskList.get(activeLabel).setText(popupMenu.menuDeleteTask().getTask());
            }
        });
    }
}
