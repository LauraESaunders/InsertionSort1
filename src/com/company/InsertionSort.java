package com.company;

public class InsertionSort {
    public static void InsSort() {
        int myNumbers[] = {5,4,3,2,1};

        for (int i = 1; i < myNumbers.length; i++){
            int key = myNumbers[i];
            int j = i - 1;
            while (j >= 0 && myNumbers[j] > key) {
                myNumbers[j + 1] = myNumbers[j];
                j--;
            }
            myNumbers[j + 1] = key;
        }
        for (int i : myNumbers) {
            System.out.print(i + " ");
        }
    }
}