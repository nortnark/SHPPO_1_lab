package context.menu.update.popup;

public class FramePopupMenu extends PopupBuilder{

    public FramePopupMenu() {
        popupMenu = new Popup();
    }
    @Override
    public Popup buildPopup() {
        popupMenu.addCreator();
        return popupMenu;
    }
}
