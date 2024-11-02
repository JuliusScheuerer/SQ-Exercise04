/*
 * SPDX-FileCopyrightText: 2024 [Julius Scheuerer]
 * SPDX-License-Identifier: MIT
 */

package taskmanager;

import taskmanager.model.Task;
import taskmanager.service.TaskService;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();

        // Create and add some sample tasks
        Task task1 = new Task(
                "Complete Java Project",
                "Finish the task management system implementation",
                LocalDateTime.now().plusDays(7)
        );
        taskService.addTask(task1);

        // Display all tasks
        System.out.println("All Tasks:");
        taskService.getAllTasks().forEach(System.out::println);
    }
}