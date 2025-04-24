package com.ep.solutions;

import java.util.*;

public class ArrayManipulation {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "red", "green");
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
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // TODO: Calculate the average of the array elements
        int average = sum / numbers.length;

        // TODO: Find the maximum value in the array
        int max = Arrays.stream(numbers).max().getAsInt();
        int maxOldSchool = -1;
        for (int number : numbers) {
            if (number > maxOldSchool) {
                maxOldSchool = number;
            }
        }


        // TODO: Find the minimum value in the array
        int min = Arrays.stream(numbers).min().getAsInt();

        // TODO: Search for a specific value in the array
        int searchValue = 42;

        OptionalInt searchResult = Arrays.stream(numbers).filter(n -> n == searchValue).findFirst();

        // TODO Sort the array in ascending order

        int[] sortedResults = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedResults);

        Integer[] arrOfObjects = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arrOfObjects[i] = numbers[i];
        }
        Arrays.sort(arrOfObjects, Collections.reverseOrder());

        // TODO: Reverse the array

        // Display Results

        System.out.println("Original array: " + Arrays.toString(numbers));

        // TODO: Display the sum, average, max, min, sorted array and reversed
        System.out.println("Array Sum : " + sum);
        System.out.println("Array Average : " + average);
        System.out.println("Array Max : " + max);
        System.out.println("Array Max Old School : " + maxOldSchool);
        System.out.println("Array Min : " + min);
        System.out.println("Array Found : " + searchValue + " : " + searchResult.isPresent());
        System.out.println("Sorted Array : " + Arrays.toString(sortedResults));
        System.out.println("Rev Sorted Array : " + Arrays.toString(arrOfObjects));

        // Close the scanner
        scanner.close();
    }
}
