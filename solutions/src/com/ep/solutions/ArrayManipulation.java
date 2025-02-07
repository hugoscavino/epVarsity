package com.ep.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            // Input array size
        System.out.println("Enter the number of elements in the array");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // input array elements
        System.out.println("Enter " + size + " integers");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // TODO: Calculate the sum of the array elements

        // TODO: Calculate the average of the array elements

        // TODO: Find the maximum value in the array

        // TODO: Find the minimum value in the array

        // TODO: Search for a specific value in the array

        // TODO Sort the array in ascending order

        // TODO: Reverse the array

        // Display Results

        System.out.println("Original array: " + Arrays.toString(numbers));

        // TODO: Display the sum, average, max, min, sorted array and reversed

        // Close the scanner
        scanner.close();
    }
}
