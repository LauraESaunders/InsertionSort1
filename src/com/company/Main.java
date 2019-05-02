package com.company;
//aDDED COMMENT
public class Main {

    public static void main(String args[]) {
        //BSort();
        //BSort2();
        InsertionSort.InsSort();
    }

    public static void BSort() {
        int myArray[] = {1, 2, 3, 4};
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 1; j < myArray.length - i; j++) {
                if (myArray[j - 1] > myArray[j]) {
                    int temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    public static void BSort2() {
        int myArray[] = {1, 2, 3, 10, 8, 9};
        boolean swap = true;
        int i = 0;
        while (swap == true) {
            swap = false;
            for (int j = 1; j < myArray.length - i; j++) {
                if (myArray[j - 1] > myArray[j]) {
                    int temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                    swap = true;
                }
            }
            i++;
        }
        for (int item : myArray) {
            System.out.print(item + " ");
        }
    }

}

