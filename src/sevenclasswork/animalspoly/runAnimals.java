package sevenclasswork.animalspoly;

public class runAnimals {
    public static void main(String args[]) {

        Bird bird1 = new Bird();
        bird1.setAnimalType("bird");
        Lion lion1 = new Lion();
        lion1.setAnimalType("snake");
        Snake snake1 = new Snake();
        snake1.setAnimalType("snake");


        Animal[] animals = {bird1, lion1, snake1};

        for (Animal a : animals) {
            System.out.println("The " + a.toString() + " said:");
            a.eat();
            a.move();
        }
    }
}
