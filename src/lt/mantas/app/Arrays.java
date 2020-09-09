package lt.mantas.app;

import java.util.Scanner;
import java.util.stream.IntStream;

//Masyvai
public class Arrays {
    public static void main (String[] args) {
        //-------------------Part-1------------------------------------------
        System.out.println("Round 1");
        String[] fruits = {"Apple", "Orange", "Pear", "Banana", "Cherry", "Strawberry", "Blueberry", "Pineapple", "Peach"};

        System.out.println("For loop: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }

        System.out.println("\nWhile loop: ");
        int i = 0;
        while (i < fruits.length){
            System.out.print(fruits[i] + " ");
            i++;
        }

        System.out.println("\nFor-Each loop");
        for (String fruit : fruits){
            System.out.print(fruit + " ");
        }
        //------------------Part-2----------------------------------------

        System.out.println("\n\nRound 2");
        Scanner scan = new Scanner((System.in));
        System.out.println("\nEnter array size: ");
        int size = scan.nextInt();


        System.out.println("For loop: ");
        for (int j = 0; j < size; j++) {
            System.out.print(fruits[j] + " ");
        }

        System.out.println("\nWhile loop: ");
        int j = 0;
        while (j < size){
            System.out.print(fruits[j] + " ");
            j++;
        }

        System.out.println("\nFor-Each loop");
        //making new array
        String[] fewFruits = new String[size];
        for (int k = 0; k < size; k++){
            fewFruits[k] = fruits[k];
        }
        //printing new array
        for (String fru : fewFruits){
            System.out.print(fru + " ");
        }
        //-------------------Part-3---------------------------------------

        System.out.println("\n\nRound 2");

        System.out.println("\nEnter array size: ");
        int size2 = scan.nextInt();
        int[] items = new int[size2];

        //scanning new array
        for (int n = 0; n < size2; n++){
            items[n] = scan.nextInt();
            // System.out.println(n);
        }

        System.out.println("For loop: ");
        for (int n = 0; n < items.length; n++) {
            System.out.print(items[n] + " ");
        }

        System.out.println("\nWhile loop: ");
        int n = 0;
        while (n < items.length){
            System.out.print(items[n] + " ");
            n++;
        }

        System.out.println("\nFor-Each loop");
        for (int item : items){
            System.out.print(item + " ");
        }
        //----------------Part-4----------------------------------------

        int sum = IntStream.of(items).sum();
        System.out.println("\nThe sum is: " + sum);

        //----------------Part-5----------------------------------------

        double average = sum / items.length;
        System.out.println("\nAverage is: " + average);

    }
}
