package by.marchuk.task01.service;

import java.util.Arrays;

public class SortingImpl implements Sorting{
    @Override
    public void bubbleSort(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
            for(int i: array){
            }
        }
        System.out.println("Array after bubble sorting " + Arrays.toString(array));
    }

    @Override
    public void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        for(int i: array){
        }
        System.out.println("Array after insertion sorting " + Arrays.toString(array));
    }

    @Override
    public void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int min = array[i];
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
        for(int i: array){
        }
        System.out.println("Array after select sorting " + Arrays.toString(array));
    }
}
