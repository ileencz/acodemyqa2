package homework;

public class Animal {
    private String animalBreed;
    private String animalColor;
    private String animalName;
    private int energyCount = 4;
    private boolean isSleeping = false;

    public Animal(String animalBreed, String animalColor, String animalName) {
        this.animalBreed = animalBreed;
        this.animalColor = animalColor;
        this.animalName = animalName;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void feed() {
        if (energyCount == 4) {
            System.out.println("I woke up.");
        } else {
            energyCount++;
            System.out.println("I want to eat!");
        }
    }

    public void walk() {
        if (energyCount == -1) {
            System.out.println("I seet at home all day.");
        } else {
            energyCount--;
            System.out.println("I want to walk!");
        }
    }
    public void play(){
        if(energyCount==-1){
            System.out.println("So bored today");
        } else {
            energyCount--;
            System.out.println("I want to play!");
        }
    }

    public void train(){
        if(energyCount==-1){
            System.out.println("Training was so energy.");
        } else {
            energyCount--;
            System.out.println("I'm tired after training!");
        }
    }

    public void sleep(){
        if(energyCount==-1){
            System.out.println("I play today so long.");
        } else {
            energyCount--;
            System.out.println("I ran out of energy!");
        }
    }

}
