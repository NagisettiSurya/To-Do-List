import java.util.*;

public class ToDoListApp {
    static List<String> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add Task\n2. View Tasks\n3. Remove Task\n0. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
            }
        } while (choice != 0);

        System.out.println("Thanks for using To-Do List!");
    }

    static void addTask() {
        System.out.print("Enter task: ");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks!");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    static void removeTask() {
        viewTasks();
        System.out.print("Remove task number: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n <= 0 || n > tasks.size()) {
            System.out.println("Invalid number.");
            return;
        }
        tasks.remove(n - 1);
        System.out.println("Task removed.");
    }
}
