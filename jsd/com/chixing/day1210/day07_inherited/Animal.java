package chixing.day1210.day07_inherited;

public class Animal {
    private String animalName;
    private double animalWeight;

    @Override
    public String toString() {
        return String.format("{"+
                "animalName='" + animalName + '\'' +
                ", animalWeight=" + "%.2f",animalWeight ) ;
    }

    public Animal() {
        System.out.println("1");
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(float animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Animal(String animalName, double animalWeight) {
        this.animalName = animalName;
        this.animalWeight = animalWeight;
    }

}
