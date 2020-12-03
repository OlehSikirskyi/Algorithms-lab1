package com.company;

public class Ship {
    public static void main(String[] args) {
        int[] waterCapacity = {65, 60, 79, 48, 86, 85, 72, 39, 84, 42};
        String[] name = {"Sardine", "Hazardous", "Constitution", "Howett", "Henry Galley", "Whitley", "Gentian", "Scorcher", "The Hindustan", "Barcross"};
        int[] numberOfContainers = {1833, 3261, 2638, 1060, 1888, 3413, 1548, 2113, 373, 869};

        Ship ship = new Ship();
        //ship.MergeSort(numberOfContainers);

//        int[] arr = ship.Selection(waterCapacity);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }


//    int[] Selection(int[] waterCapacity) {
//        System.out.println("Selection");
//        long time = System.nanoTime();
//        int count = 0;
//        int count2 = 0;
//
//        for (int i = 0; i < waterCapacity.length; i++) {
//            int min = i;
//            for (int j = i + 1; j < waterCapacity.length; j++) {
//                if (waterCapacity[min] > waterCapacity[j]) {
//                    min = j;
//                    count++;
//                }
//            }
//
//            int temp = waterCapacity[i];
//
//            waterCapacity[i] = waterCapacity[min];
//            waterCapacity[min] = temp;
//        }
//        time = System.nanoTime() - time;
//        System.out.printf("Work time %,9.3f ms\n", time/1_000_000.0);
//        System.out.println(count);
//        System.out.println();
//        return waterCapacity;
//    }

//    void Merge(int[] targetArray, int[] firstArray, int[] secondArray) {
//        int firstArrayMinIndex = 0;
//        int secondArrayMinIndex = 0;
//        int targetArrayMinIndex = 0;
//
//
//        while (firstArrayMinIndex < firstArray.length && secondArrayMinIndex < secondArray.length) {
//            if (firstArray[firstArrayMinIndex] <= secondArray[secondArrayMinIndex]) {
//                targetArray[targetArrayMinIndex] = firstArray[firstArrayMinIndex];
//                firstArrayMinIndex++;
//            } else {
//                targetArray[targetArrayMinIndex] = secondArray[secondArrayMinIndex];
//                secondArrayMinIndex++;
//            }
//            targetArrayMinIndex++;
//        }
//        while (firstArrayMinIndex < firstArray.length) {
//            targetArray[targetArrayMinIndex] = firstArray[firstArrayMinIndex];
//            firstArrayMinIndex++;
//            targetArrayMinIndex++;
//        }
//        while (secondArrayMinIndex < secondArray.length) {
//            targetArray[targetArrayMinIndex] = secondArray[secondArrayMinIndex];
//            secondArrayMinIndex++;
//            targetArrayMinIndex++;
//        }
//    }

//    void MergeSort(int[] array) {

//        if (array.length < 2) {
//            return;
//        }

//        int mid = array.length / 2;
//        int[] left = new int[mid];
//        int[] right = new int[array.length - mid];
//
//        for (int i = 0; i < mid; i++) {
//            left[i] = array[i];
//        }
//
//        for (int i = mid; i < array.length; i++) {
//            right[i - mid] = array[i];
//        }
//
//        MergeSort(left);
//        MergeSort(right);
//        Merge(array, left, right);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }

}

