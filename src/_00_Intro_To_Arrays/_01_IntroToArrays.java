package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    		String[] arr = {"Hi", "Hello", "Hey", "Bye", "later"};
        // 2. print the third element in the array
    		System.out.println(arr[2]);
        // 3. set the third element to a different value
    		arr[2] = "now";
        // 4. print the third element again
    		System.out.println(arr[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    		
    		for (int i = 0; i < arr.length; i++) {
    			
    			arr[i] = "New";
    			
    		}

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    		
    		for (int i = 0; i < arr.length; i++) {
    			
    			System.out.println(arr[i]);
    			
    		}

        // 7. make an array of 50 integers
    		
    		int[] array = new int[50];

        // 8. use a for loop to make every value of the integer array a random
        //    number
    		
    		Random r = new Random();
    		
    		for (int i = 0; i < array.length; i++) {
    			
    			array[i] = r.nextInt(100) + 1;
    			
    		}

        // 9. without printing the entire array, print only the smallest number
        //    on the array
    		
    		int temp = array[0];
    		
    		for (int i = 1; i < array.length; i++) {
    			
    			if (array[i] < temp) {
    				temp = array[i];
    			}

    		}
    		
    		System.out.println("Smallest Number: " + temp);

        // 10 print the entire array to see if step 8 was correct
    		System.out.println();
    		for (int num : array) {
    			System.out.println(num);
    		}
    		System.out.println();
        // 11. print the largest number in the array.
    		
    		temp = array[0];
    		
    		for (int i = 1; i < array.length; i++) {
    			
    			if (array[i] > temp) {
    				temp = array[i];
    			}

    		}
    		
    		System.out.println("Biggest Number: " + temp);

        // 12. print only the last element in the array
    		System.out.println("Last element: " + array[array.length-1]);
    }
}
