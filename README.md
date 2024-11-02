# Task Manager

A lightweight Java application for managing and tracking tasks with basic CRUD operations.

## Purpose

Task Manager is a simple yet efficient task management system designed to demonstrate clean code practices and proper Java project structure. It allows users to:
- Create and store tasks with titles, descriptions, and due dates
- Track task completion status
- Retrieve and display task information
- Remove tasks when no longer needed

## Install

### Prerequisites
- Java JDK 11 or higher
- Git

### Setup
1. Clone the repository
```bash
git clone https://github.com/JuliusScheuerer/SQ-Exercise04.git
```

2. Navigate to project directory
```bash
cd TaskManager
```

3. Compile the source files
```bash
javac src/taskmanager/*.java src/taskmanager/*/*.java
```

## Usage

The application provides a simple interface to manage tasks. Here's a basic example:

```java
// Create a new task service
TaskService taskService = new TaskService();

// Add a new task
Task task = new Task("Complete Documentation", 
                    "Finish the project documentation", 
                    LocalDateTime.now().plusDays(1));
taskService.addTask(task);

// Retrieve all tasks
List<Task> allTasks = taskService.getAllTasks();

// Mark task as completed
task.setCompleted(true);
```

## Contributing

While this project is primarily for educational purposes, contributions are welcome:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Citation Hint

If you use this project as part of your academic work, please cite it as:

```
TaskManager - A Java-based Task Management System
[Julius Scheuerer]
University of Cologne, 2024
https://github.com/JuliusScheuerer/SQ-Exercise04
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
