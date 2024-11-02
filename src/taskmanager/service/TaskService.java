package taskmanager.service;

import taskmanager.model.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Optional<Task> getTaskById(String id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst();
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public boolean removeTask(String id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }
}