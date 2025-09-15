package exam10;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


      soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);


    }

    private static void soundAnimal(Animal animal) {
        System.out.println("animal sound started");
        animal.sound();
        System.out.println("animal sound finished");
    }
}
