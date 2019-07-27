package sevenclasswork.animalspoly;

public abstract class Animal {
    protected String animalType;

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void eat() {

    }

    public void move() {

    }

    public String toString() {
        return this.animalType;
    }

}
