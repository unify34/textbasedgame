import java.util.Scanner;

public class AdventureGame {
    static boolean hasKey = false;
    static boolean hasFlashlight = false;
    static boolean hasBattery = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the adventure game!");

        while (true) {
            System.out.println("You are in the living room. What would you like to do?");
            System.out.println("1. Go to the kitchen");
            System.out.println("2. Go to the bedroom");
            System.out.println("3. Check inventory");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    kitchen();
                    break;
                case 2:
                    bedroom();
                    break;
                case 3:
                    inventory();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    static void kitchen() {
        Scanner input = new Scanner(System.in);
        System.out.println("You are in the kitchen. What would you like to do?");
        System.out.println("1. Look for items");
        System.out.println("2. Go back to the living room");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You found a key!");
                hasKey = true;
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    static void bedroom() {
        Scanner input = new Scanner(System.in);
        System.out.println("You are in the bedroom. What would you like to do?");
        System.out.println("1. Look for items");
        System.out.println("2. Go back to the living room");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You found a flashlight!");
                hasFlashlight = true;
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    static void inventory() {
        System.out.println("Inventory:");
        if (hasKey) {
            System.out.println("- Key");
        }
        if (hasFlashlight) {
            System.out.println("- Flashlight");
        }
        if (hasBattery) {
            System.out.println("- Battery");
        }
    }
}
