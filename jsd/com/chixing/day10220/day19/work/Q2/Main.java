package chixing.day10220.day19.work.Q2;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.registerTask(new SendInterviewTask());
        manager.registerTask(new GenerateReportTask());
        manager.registerTask(new SyncStockTask());

        manager.executeTask("SendInterviewTask");
        manager.executeTask("GenerateReportTask");
        manager.executeTask("SendInterviewTask");

        manager.printHistory("SendInterviewTask");
        manager.printAllHistory();
        manager.saveData();
    }
}
