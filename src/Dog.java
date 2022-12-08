public class Dog extends Animal{
    //instance fields
    private String name;
    private String barkNoise = "Woof!";
    private double weight;

    //constructors
    public Dog (String name, String breed, double weight, String color) {
        super(breed, color);
        this.setName(name);
        this.setBreed(breed);
        this.setWeight(weight);
    }
    public Dog (String name, String breed, String noise, double weight, String color) {
        super(breed, color);
        this.setName(name);
        barkNoise = noise;
        this.setWeight(weight);
    }

    //bark methods
    public String bark(){
        return barkNoise;
    }

    public String bark(String barkNoise){
        return barkNoise;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
