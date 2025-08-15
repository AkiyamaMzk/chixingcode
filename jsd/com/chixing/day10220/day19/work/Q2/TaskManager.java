package chixing.day10220.day19.work.Q2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {
    private Map<String, Task> taskManager = new HashMap<>();
    private Map<String, List<LocalDateTime>> taskHistory = new HashMap<>();

    public void registerTask(Task task) {
        taskManager.put(task.getName(), task);
        System.out.println("添加了" + task.getName());
    }

    public Task getTaskByName(String name) {
        return taskManager.get(name);
    }

    public void executeTask(String name) {
        System.out.println("执行任务:" + getTaskByName(name).getName());
        getTaskByName(name).execute();
        if (!taskHistory.containsKey(name))
            taskHistory.put(name, new ArrayList<>());
        taskHistory.get(name).add(LocalDateTime.now());
    }

    public void printHistory(String name) {
        for (Map.Entry<String, List<LocalDateTime>> entry : taskHistory.entrySet()) {
            System.out.println(entry.getKey());
            for (LocalDateTime time : entry.getValue()) {
                System.out.println(time);
            }
        }
    }

    public void printAllHistory() {
        for (String name : taskManager.keySet()) {
            System.out.println(name + ":");
            printHistory(name);
        }

    }

}
