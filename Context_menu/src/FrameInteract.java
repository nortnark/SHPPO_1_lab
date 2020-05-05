import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class FrameInteract{
    JLabel[] taskList = new JLabel[3];
    PopupMenu popupMenu = new PopupMenu();
    Frame frame = new Frame();
    public FrameInteract() {

        frame.firstTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (frame.firstTask.getText() == "") {
                        popupMenu.showFrameMenu(frame, mouseEvent.getX(), mouseEvent.getY());
                    } else {
                        popupMenu.showTaskMenu(frame, mouseEvent.getX(), mouseEvent.getY() );
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                frame.firstTask.setForeground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                frame.firstTask.setForeground(Color.black);
            }
        });
        frame.secondTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (frame.secondTask.getText() == "") {
                        popupMenu.showFrameMenu(frame, mouseEvent.getX(), mouseEvent.getY());
                    } else {
                        popupMenu.showTaskMenu(frame, mouseEvent.getX(), mouseEvent.getY() );
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                frame.secondTask.setForeground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                frame.secondTask.setForeground(Color.BLACK);
            }
        });
        frame.thirdTask.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                    if (frame.thirdTask.getText() == "") {
                        popupMenu.showFrameMenu(frame, mouseEvent.getX(), mouseEvent.getY());
                    } else {
                        popupMenu.showTaskMenu(frame, mouseEvent.getX(), mouseEvent.getY() );
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                frame.thirdTask.setForeground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                frame.thirdTask.setForeground(Color.BLACK);
            }
        });
        //addActionListener
        popupMenu.menuNewOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.firstTask.setText(popupMenu.menuNewTask().getTask());
            }
        });
    }
}
