class FrameCheck {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Task task1 = new Task();
        task1.makeNewTask();
        frame.firstTask.setText(task1.getTask());
        task1.editTheTask();
        frame.firstTask.setText(task1.getTask());
        task1.deleteTheTask();
        frame.firstTask.setText(task1.getTask());
    }
}