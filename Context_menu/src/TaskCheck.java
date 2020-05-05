class TaskCheck {
    public static void main(String[] args) {
        Task newTask = new Task();
        newTask.makeNewTask();
        System.out.println(newTask.getTask());
        newTask.editTheTask();
        System.out.println(newTask.getTask());
        newTask.deleteTheTask();
        System.out.println(newTask.getTask());
    }
}
