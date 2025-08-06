package chixing.day1210.day07_inherited;

import java.util.Objects;

public class Dog extends Animal{
    private String dogType;

    public Dog() {}

    public Dog(String animalName, double animalWeight, String dogType) {
        super(animalName, animalWeight);
        this.dogType = dogType;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    @Override
    public String toString() {
        return super.toString() +
                ""+
                ", dogType='" + dogType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogType, dog.dogType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogType);
    }
}
