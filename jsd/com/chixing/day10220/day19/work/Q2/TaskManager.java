package chixing.day10220.day19.work.Q2;

import java.util.Map;

public class TaskManager {
    private Map<String, Task> taskManager;

    public void registerTask(Task task){
        taskManager.put(task.getName(), task);
    }
    public Task getTaskByName(String name){
        return taskManager.get(name);
    }

}
