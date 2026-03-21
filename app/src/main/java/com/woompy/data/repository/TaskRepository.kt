class TaskRepository {
    private val tasks = mutableListOf<Task>()

    fun getAllTasks(): List<Task> {
        return tasks
    }
    
    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun updateTask(updatedTask: Task) {
        tasks.replaceAll { if (it.id == updatedTask.id) updatedTask else it }
    }
}