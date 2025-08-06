package chixing.day1210.day08_abstract.homework.Q10;

public class MyStudent {
    private String name;
    private double score;
    private static double scoreSum=0;
    private static int studentNums=0;

    {
        studentNums++;
    }

    public MyStudent(String name, double score) {
        this.name = name;
        this.score = score;
        scoreSum+=score;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static double getAverageScore(){
        return scoreSum/studentNums;
    }
}
