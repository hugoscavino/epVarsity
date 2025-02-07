package com.ep.lab;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Explanation of the Starter Code
 *  1. Input Array Size and Elements:
 *  The code prompts the user to enter the number of elements and then inputs the
 *  elements into the array.
 *
 * 2. TODO Comments:
 * Each TODO comment indicates where students should implement specific functionality:
 * Calculate Sum: Iterate through the array to compute the sum of all elements
 * Calculate Average: Compute the average by dividing the sum by the  number of elements.
 * Find Maximum Value: Traverse the array to find the maximum value
 * Find Minimum Value: Traverse the array to find the minimum value.
 * Search for a Value: Implement a search to check if a specific value exists in the array.
 * Sort the Array: Use Arrays.sort() to sort the array in ascending order.
 * Reverse the Array: Manually reverse the array or use an alternative method.
 * Display Results: Print the computed values and the transformed arrays
 */
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
