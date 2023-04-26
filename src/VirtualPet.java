import java.util.Scanner;
public class VirtualPet {

    private String name;
    private int age;
    private PetNeeds petNeeds;
    //you will find PetNeeds has compiled time error mark

    public VirtualPet ( String name, int age){
        this.name = name;
        this.age = age;
        this.petNeeds = new PetNeeds();
    }

    public void feed(){
        int decreaseAmount = getRandomNumber(10,20);
        petNeeds.decreaseHunger(decreaseAmount);
    }

    public void drink(){
        int decreaseAmount = getRandomNumber(10,20);
        petNeeds.decreaseThirst(decreaseAmount);
    }

    public void play(){
        int increaseAmount = getRandomNumber(10,20);
        petNeeds.increaseHappiness(increaseAmount);
    }

    public boolean isSick(){
        return petNeeds.getHunger() >= 100 || petNeeds.getThirst() >= 100;
    }

    public boolean isSad() {
        return petNeeds.getHappiness() <= 0;
    }

    public void printStatus() {
        System.out.println(name + " - Age " + age);
        System.out.println("hunger: " + petNeeds.getHunger() + "/100");
        System.out.println("Thirst: " + petNeeds.getThirst() + "/100");
        System.out.println("Happiness: " + petNeeds.getHappiness() + "/100");
        System.out.println();
    }

    private int getRandomNumber (int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

}
