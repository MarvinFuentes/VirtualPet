/**
 * @Class: VirtualPetSimulator
 * @Aurthor: Marvin Fuentes
 * @Course: ITEC 2140 Section 4
 * @Written: April 25, 2023
 * This class has the main method for the other class which is called by creating
 * an instance on line 21. The program uses a scanner to input the name of the pet
 * also the age of the pet. The program will then prompt the user with 3 different
 * options if they want to feed, drink, or play with their pet, and then it will
 * display the level of all the status. If the user enters a letter or number the
 * program will prompt the user with an invalid input message.
 */
import java.util.Scanner;

public class VirtualPetSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to Virtual Pet Simulator!");
        System.out.print("Enter your pet's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your pet's age: ");
        int age = scanner.nextInt();

        VirtualPet pet = new VirtualPet(name, age);

        while(!pet.isSick() && !pet.isSad()){
            pet.printStatus();
            System.out.println("Choose an action:");
            System.out.println("1. Feed");
            System.out.println("2. Drink");
            System.out.println("3. Play");
            int choice = scanner.nextInt();
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
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (pet.isSick()) {
            System.out.println(pet.getName() + " became sick and went to the vet.");
        } else {
            System.out.println(pet.getName() + " became sad and needs some love.");
        }
        scanner.close();

    }

}
