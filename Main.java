import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice :");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGrocery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("\t 0 - to print choice options.");
        System.out.println("\t 1 - to print the list of grocery item.");
        System.out.println("\t 2 - toadd an item to the list.");
        System.out.println("\t 3 - to modify an item int the list");
        System.out.println("\t 4 - to remove an item from list.");
        System.out.println("\t 5 - to search for an item in the list.");
        System.out.println("\t 6 - to quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item :");
        groceryList.addGrocery(scan.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number :");
        String itemNo = scan.nextLine();
        System.out.print("Enter replacement item :");
        String newItem = scan.nextLine();
        groceryList.modifyGrocery(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item name :");
        String itemNo = scan.nextLine();
        groceryList.removeGrocery(itemNo);
    }

    public static void searchForItem(){
        System.out.println("item search for :");
        String searchItem = scan.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found item "+ searchItem + " in our grocery list");
        } else{
            System.out.println(searchItem + " is not in our shopping list.");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGrocerylist());
    }
}