package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    private static final int NUM_ELEMENTS = 1000;
    private static final int NUM_GETS = 1000000;

    public static void main(String[] args) {
        System.out.println("Testing ArrayList:");

        ArrayList<Student> studentList = new ArrayList<>();

        // Time how long it takes to add elements to the list
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            Student student = new Student();
            studentList.add(student);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to add " + NUM_ELEMENTS + " elements: " + (endTime - startTime) + " ms");

        // Time how long it takes to sort the list
        startTime = System.currentTimeMillis();
        Collections.sort(studentList);
        endTime = System.currentTimeMillis();
        System.out.println("Time to sort list: " + (endTime - startTime) + " ms");

        // Time how long it takes to shuffle the list
        startTime = System.currentTimeMillis();
        Collections.shuffle(studentList);
        endTime = System.currentTimeMillis();
        System.out.println("Time to shuffle list: " + (endTime - startTime) + " ms");

        // Time how long it takes to get a random element from the list 1,000,000 times
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_GETS; i++) {
            int index = (int) (Math.random() * studentList.size());
            Student student = studentList.get(index);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to get " + NUM_GETS + " random elements: " + (endTime - startTime) + " ms");

        // Time how long it takes to get each element from the list sequentially
        startTime = System.currentTimeMillis();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to get " + studentList.size() + " sequential elements: " + (endTime - startTime) + " ms");


        System.out.println("\nTesting LinkedList:");

        LinkedList<Student> studentLinkedList = new LinkedList<>();

        // Time how long it takes to add elements to the list
        long startTimeLL = System.currentTimeMillis();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            Student student = new Student();
            studentLinkedList.add(student);
        }
        long endTimeLL = System.currentTimeMillis();
        System.out.println("Time to add " + NUM_ELEMENTS + " elements: " + (endTimeLL - startTimeLL) + " ms");

        // Time how long it takes to sort the list
        startTimeLL = System.currentTimeMillis();
        Collections.sort(studentLinkedList);
        endTimeLL = System.currentTimeMillis();
        System.out.println("Time to sort list: " + (endTimeLL - startTimeLL) + " ms");

        // Time how long it takes to shuffle the list
        startTimeLL = System.currentTimeMillis();
        Collections.shuffle(studentLinkedList);
        endTimeLL = System.currentTimeMillis();
        System.out.println("Time to shuffle list: " + (endTimeLL - startTimeLL) + " ms");

        // Time how long it takes to get a random element from the list 1,000,000 times
        startTimeLL = System.currentTimeMillis();
        for (int i = 0; i < NUM_GETS; i++) {
            int index = (int) (Math.random() * studentLinkedList.size());
            Student student = studentLinkedList.get(index);
              // Do nothing with the student object
    }
    endTimeLL = System.currentTimeMillis();
    System.out.println("Time to get " + NUM_GETS + " random elements: " + (endTimeLL - startTimeLL) + " ms");

    // Time how long it takes to get each element from the list sequentially
    startTimeLL = System.currentTimeMillis();
    for (int i = 0; i < studentLinkedList.size(); i++) {
        Student student = studentLinkedList.get(i);
    }
    endTimeLL = System.currentTimeMillis();
    System.out.println("Time to get " + studentLinkedList.size() + " sequential elements: " + (endTimeLL - startTimeLL) + " ms");
}
}