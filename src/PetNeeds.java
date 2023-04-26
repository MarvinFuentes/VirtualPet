public class PetNeeds implements PetActions {
    private int hunger;
    private int thirst;
    private int happiness;

    public PetNeeds(){
        hunger = 50;
        thirst = 50;
        happiness = 50;
    }

    public void decreaseHunger(int amount){
        hunger -= amount;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void decreaseThirst (int amount){
        thirst -= amount;
        if(thirst < 0){
            thirst = 0;
        }
    }

    public void increaseHappiness(int amount){
        happiness += amount;
        if(happiness > 100){
            happiness = 100;
        }
    }

    public int getHunger(){
        return hunger;
    }

    public int getThirst(){
        return thirst;
    }

    public int getHappiness(){
        return happiness;
    }

    public void setHunger(int hunger){
        this.hunger = hunger;
    }

    public void setThirst(int thirst){
        this.thirst = thirst;
    }

    public void setHappiness(int happiness){
        this.happiness = happiness;
    }

    private int getRandomNumber (int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }


    @Override
    public void feed() {
        decreaseHunger(getRandomNumber(10,20));
    }

    @Override
    public void drink() {
        decreaseThirst(getRandomNumber(10,20));
    }

    @Override
    public void play() {
        increaseHappiness(getRandomNumber(10,20));
    }
}
