package context.menu.update.popup;

public class TaskPopupMenu extends PopupBuilder{

    public TaskPopupMenu() {
        popupMenu = new Popup();
    }

    @Override
    public Popup buildPopup() {
        popupMenu.addEditor();
        popupMenu.addDeleter();
        return popupMenu;
    }
}
