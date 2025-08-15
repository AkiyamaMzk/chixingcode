package chixing.day10220.day19.work.Q2;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chixing.dayNull.SimpleFileUtils;

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
        Task task = getTaskByName(name);
        System.out.println("执行任务:" + task.getName());
        new Thread(() -> {
            task.execute(); // 调用任务逻辑
            synchronized (this) { // 同步更新历史
                taskHistory.computeIfAbsent(name, k -> new ArrayList<>()).add(LocalDateTime.now());
            }
        }).start();
    }

    public void printHistory(String name) {
        for (Map.Entry<String, List<LocalDateTime>> entry : taskHistory.entrySet()) {
            {
                if (entry.getKey().equals(name)) {
                    System.out.println(entry.getKey());
                    for (LocalDateTime time : entry.getValue()) {
                        System.out.println(time);
                    }
                }
            }
        }
    }

    public void printAllHistory() {
        for (String name : taskManager.keySet()) {
            System.out.println(name + ":");
            printHistory(name);
        }

    }

    public void saveData() {
        File file = SimpleFileUtils.createFile("jsd\\com\\chixing\\day10220\\day19\\work\\Q2\\save",
                "savedata_" + LocalDate.now().toString() + ".json");
        for (Map.Entry<String, List<LocalDateTime>> entry : taskHistory.entrySet()) {
            {
                SimpleFileUtils.writeToFile(file, entry.getKey() + "\n", true);
                for (LocalDateTime time : entry.getValue()) {
                    SimpleFileUtils.writeToFile(file, time.toString() + "\n", true);
                }
            }
        }
        System.out.println("保存成功!");
    }

}
