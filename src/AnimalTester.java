import java.util.ArrayList;

public class AnimalTester {
    public static void main(String[] args) {
        //make dog objects
        Dog dog = new Dog("Bailey", "Boerboel", "Arf-arf!", 80.2, "Brown");
        Fish fish = new Fish("Goldfish", "cold", "red");

        //dog1 data
        System.out.println("Name: "+ dog.getName());
        System.out.println("Breed: "+ dog.getBreed());
        System.out.println("Noise: "+ dog.bark());
        System.out.println("Weight: "+ dog.getWeight());

        //fish data
        System.out.println("Name: "+ fish.getBreed());
        System.out.println("Water type: "+ fish.getWaterType());
        System.out.println("Color: "+ fish.getColor());
    }
}
