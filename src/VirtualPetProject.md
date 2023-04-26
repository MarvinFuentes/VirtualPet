# WARM UP

* If the hunger level of a virtual pet is initially set to 50 and the pet 
eats 15 units of food, what is the new hunger level of the pet?

* If the thirst level of a virtual pet is initially set to 50 and the pet 
drinks 20 units of water, what is the new thirst level of the pet?

* If the happiness level of a virtual pet is initially set to 50 and the pet 
plays and gains 10 units of happiness, what is the new happiness level of the pet?

* If a virtual pet is considered sick when its hunger level is 100 or greater 
or its thirst level is 100 or greater, which of the following pets is sick?

a) Hunger level: 85, Thirst level: 95
b) Hunger level: 105, Thirst level: 85
c) Hunger level: 95, Thirst level: 105
d) Hunger level: 80, Thirst level: 80

* If a virtual pet is considered sad when its happiness level is 0 or less, 
which of the following pets is sad?

a) Happiness level: 50
b) Happiness level: -5
c) Happiness level: 75
d) Happiness level: 0


# Project Title: Virtual Pet Simulator
source: https://youtu.be/h3pMVCYM_EM
the VirtualPet class provides an interactive experience for users to simulate owning and taking care of a virtual pet, similar to popular virtual pet games such as Tamagotchi.


## Description: You will create a virtual pet simulator game using Java, where 
the player can adopt and take care of a digital pet. 
The pet will have different needs such as hunger, thirst, and happiness, and 
the player must fulfill these needs to keep the pet healthy and happy.

## Object-Oriented Concepts:

## Encapsulation: You will create a class called "VirtualPet" that 
encapsulates all the properties and behaviors of the pet. 
The pet's **name, age**, and hunger level will be private variables, 
and **the pet's actions such as eating, drinking, and playing will be 
encapsulated within methods.**


### 1. Copy this inside of VirtualPet class for now.
``` 
    private String name;
    
    private int age;
    
    private PetNeeds petNeeds; 
    //you will find PetNeeds has compile time error mark
```

## Abstraction: You will create an interface called "PetActions" that 
abstracts the behaviors that the pet can perform. The pet can implement 
this interface to perform different actions such as eating (void feed(); ), 
drinking (void drink();), 
and playing(void play(); ).  

### 2. Copy this:
```
public interface PetActions {
void feed();
void drink();
void play();
}
```
## interface
An interface in programming is like a set of instructions that tells a computer what a certain kind of object can do. It's like a menu at a restaurant that tells you what kinds of food you can order.

For example, let's say you have a toy car and a toy plane. Even though they're different toys, they might both have something in common - they can move. You could create an interface called "Moveable" that tells the computer that any object that implements this interface can move.

Now, when you create a class for your toy car and your toy plane, you can make them both implement the "Moveable" interface. This means that they both have to provide a way to move. For the toy car, you might provide a method that makes it roll forward, and for the toy plane, you might provide a method that makes it fly through the air.

By using an interface, you can make sure that any object that implements it can do certain things, even if they're different objects. It's like making sure that any item you order from a restaurant has certain ingredients or cooking methods, even if it's a different dish.

I hope that helps you understand what an interface is in programming!

## Composition: You will create a class called "PetNeeds" that represents the 
pet's needs such as hunger (int), thirst(int), and happiness(int). The 
"VirtualPet" class 
will 
have a "PetNeeds" object as a member variable, and the pet's actions will affect 
the values of the "PetNeeds" object.

### 3. Inside the PetNeeds class, create the following attributes:
```
    private int hunger;
    private int thirst;
    private int happiness;

```

### 4. Create a constructor for the PetNeeds class with no parameters. Inside the constructor, set the values of hunger, thirst, and happiness to 50.
``` 
    public PetNeeds() {
        hunger = 50;
        thirst = 50;
        happiness = 50;
}

```
### 5. Create the decreaseHunger method that takes an integer parameter amount. Inside the method, subtract amount from hunger and check if hunger is less than 0. If hunger is less than 0, set it to 0.

``` 
public void decreaseHunger(int amount) {
    hunger -= amount;
    if (hunger < 0) {
        hunger = 0;
    }
}


```
### 6. Create the decreaseThirst method that takes an integer parameter amount. Inside the method, subtract amount from thirst and check if thirst is less than 0. If thirst is less than 0, set it to 0.

``` 

    public void decreaseThirst(int amount) {
    thirst -= amount;
    if (thirst < 0) {
        thirst = 0;
    }
}

```
### 7. Create the increaseHappiness method that takes an integer parameter amount. Inside the method, add amount to happiness and check if happiness is greater than 100. If happiness is greater than 100, set it to 100.

``` 
public void increaseHappiness(int amount) {
    happiness += amount;
    if (happiness > 100) {
        happiness = 100;
    }
}
```

### 8. Create the getHunger method that returns the value of hunger

```
public int getHunger() {
    return hunger;
}

```
### 9. Create the getThirst method that returns the value of thirst.

``` 
public int getThirst() {
    return thirst;
}

```

### 10. Create the getHappiness method that returns the value of happiness.

``` 
public int getHappiness() {
    return happiness;
}


```
### 11.Create the setHunger method that takes an integer parameter hunger and initialize/set the value of this.hunger to hunger.

``` 

public void setHunger(int hunger) {
    this.hunger = hunger;
}

```

### 12. Create the setThirst method that takes an integer parameter thirst and sets the value of this.thirst to thirst.

``` 

public void setThirst(int thirst) {
    this.thirst = thirst;
}


```

### 13. Create the setHappiness method that takes an integer parameter happiness and sets the value of this.happiness to happiness.

``` 
public void setHappiness(int happiness) {
    this.happiness = happiness;


```
## Back to a VirtualPet class to complete. 

Inside the VirtualPet class, you have created instance variables: name(String), 
age(int), 
and petNeeds (PetNeeds). 

1. Create a **constructor** for the VirtualPet class that takes a String parameter 
name and an int parameter age. Inside the constructor, initialize the name and age instance variables with the corresponding parameters, and create a new PetNeeds object and assign it to the petNeeds instance variable.


2. Create the **feed** method. The feed method should decrease the pet's hunger 
level by a random amount between 10 and 20 using the decreaseHunger method from the PetNeeds object.


3. Create the **drink** method. The drink method should decrease the pet's thirst 
level by a random amount between 10 and 20 using the decreaseThirst method from the PetNeeds object.

  
4. Create the **play** method. The play method should increase the pet's happiness 
level by a random amount between 10 and 20 using the increaseHappiness method from the PetNeeds object.

  
5. Create the **isSick** method. The isSick method should return true if the pet's 
hunger level is greater than or equal to 100 or the pet's thirst level is greater than or equal to 100.

  
6. Create the **isSad** method. The isSad method should return true if the pet's 
happiness level is less than or equal to 0.

  
7. Create the **printStatus** method. The printStatus method should print the 
pet's name, age, hunger score level, thirst score level, and happiness 
   score level **out of 100**. Then, then add a new line to separate the output 
   from any other message that may be displayed.  

  
8. Create the **getRandomNumber** method that takes two int parameters min and max 
and returns a random integer between min and max (inclusive). This method will be used by the feed, drink, and play methods to generate random amounts.

 
9. Create the **getName** method that returns the value of the name instance 
  variable.

  
10. Create the **getAge** method that returns the value of the age instance 
    variable.

 
11. Create the **getPetNeeds** method that returns the PetNeeds object assigned to 
the petNeeds instance variable.


## Create VirtualPetSimulator class

1. Import necessary class(es)

```
import java.util.Scanner;
    
```    

2. create a main method.
3. Copy following statements

``` 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pet Simulator!");
        System.out.print("Enter your pet's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your pet's age: ");
        int age = scanner.nextInt();

```

4. Create a new VirtualPet object (**pet**) using the name and age entered by the 
   user:
5. Start a loop that will continue until the pet is either sick or sad:

``` 
       while (!pet.isSick() && !pet.isSad()) {
             
        }
```
6. Inside the loop, call the printStatus() method on the pet object to display the pet's current status:

7. Inside the loop, prompt the user to choose an action by printing a menu of 
   options:

```
            System.out.println("Choose an action:");
            System.out.println("1. Feed");
            System.out.println("2. Drink");
            System.out.println("3. Play");
            int choice = scanner.nextInt();

```

8. Inside the loop, copy following switch statement to handle the user's 
   choice:

```
            switch (choice) {
                case 1:
                    pet.feed();
                    System.out.println(pet.getName() + " ate some food.");
                    break;
                case 2:
                    pet.drink();
                    System.out.println(pet.getName() + " drank some water.");
                    break;
                case 3:
                    pet.play();
                    System.out.println(pet.getName() + " played with you.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

```

9. Inside the loop, add a delay of 2 seconds after each action is taken to 
   simulate time passing:
```
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    e.printStackTrace();
}

```
10. After the loop exits, check if the pet is sick or sad and print a message accordingly:

``` 
        if (pet.isSick()) {
            System.out.println(pet.getName() + " became sick and went to the vet.");
        } else {
            System.out.println(pet.getName() + " became sad and needs some love.");
        }

```

11. Close the Scanner object. Closing the Scanner object is considered a good practice to release the underlying system resources associated with it. When a Scanner object is created to read from the console using System.in, it opens a stream of input data from the console. If the Scanner object is not closed properly, this stream will remain open and may lead to resource leaks, which can cause the program to behave unexpectedly or even crash.

Therefore, to prevent resource leaks and ensure that the program runs smoothly, it is recommended to close the Scanner object once it is no longer needed. In the VirtualPetSimulator class, the Scanner object is closed at the end of the program, after the user has finished interacting with the virtual pet.


# Project Requirements:

The player can adopt a virtual pet by entering its name and age.

The pet will have three needs: hunger, thirst, and happiness. Each need will have a value between 0 and 100.

The player can feed the pet by choosing the "Feed" option. This will decrease the pet's hunger level by a random amount between 10 and 20.

The player can give the pet water by choosing the "Drink" option. This will decrease the pet's thirst level by a random amount between 10 and 20.

The player can play with the pet by choosing the "Play" option. This will increase the pet's happiness level by a random amount between 10 and 20.

If the pet's hunger or thirst level reaches 100, it will become sick and the game will end.

If the pet's happiness level reaches 0, it will become sad and the game will end.

The game will continue until the pet becomes sick or sad.

# Project Tips:

Use the Scanner class to get input from the player.

Use the Random class to generate random numbers for the pet's needs.

Use the Thread.sleep() method to simulate the passage of time in the game.

Display the pet's name, age, and needs on the screen after each action.

Use if statements to check if the pet is sick or sad after each action.

Use a while loop to keep the game running until the pet becomes sick or sad.

# Conclusion:

By completing this project, you will have learned about encapsulation, abstraction, and composition in object-oriented programming. You will also have a fun game that you can play with your friends and family.
