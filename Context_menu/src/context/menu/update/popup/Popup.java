package context.menu.update.popup;

import javax.swing.*;

public class Popup {

    static JPopupMenu popupMenu = new JPopupMenu();

    IPopupItem newItem;

    public void addCreator() {
        newItem = new PopupItemCreate();
        JMenuItem item = newItem.addItem();
        popupMenu.add(item);
    }
    public void addEditor() {
        newItem = new PopupItemEdit();
        JMenuItem item = newItem.addItem();
        popupMenu.add(item);
    }
    public void addCleaner() {
        newItem = new PopupItemDelete();
        JMenuItem item = newItem.addItem();
        popupMenu.add(item);
    }
    public void show(JFrame frame, int x, int y){
        popupMenu.show(frame, x + 20, y + 120);
    }
}
