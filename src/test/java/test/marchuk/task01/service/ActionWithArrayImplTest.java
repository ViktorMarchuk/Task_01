package test.marchuk.task01.service;

import by.marchuk.task01.service.ActionWithArrayImpl;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ActionWithArrayImplTest{
    ActionWithArrayImpl action = new ActionWithArrayImpl();
    int[] array = {6, 3, 2, -1, 1};
    int numberForChange = 1;
    int changedNumber = 14;

    @Test
    public void testFindMaxNumber(){
        int actual = action.findMaxNumber(array);
        int expected = 0;
        int maxNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(maxNumber < array[i]){
                maxNumber = array[i];
                expected = maxNumber;
            }
        }
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMinNumber(){
        int actual = action.findMinNumber(array);
        int expected = 0;
        int minNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(minNumber > array[i] || minNumber == 0){
                minNumber = array[i];
                expected = minNumber;
            }
        }
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testChangeElementsOfArray(){
        int[] actual = action.changeElementsOfArray(array, 13, -1);
        int[] expected = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] == numberForChange){
                array[i] = changedNumber;
                changedNumber = array[i];
                expected = array;
            }
        }
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindAverageValue(){
        double actual = action.findAverageValue(array);
        double expected = 0;
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            expected = sum / array.length;
        }
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testFindSumOfElements(){
        int actualSum = action.findSumOfElements(array);
        int expectedSum = 0;
        for(int i = 0; i < array.length; i++){
            expectedSum += array[i];
        }
        Assert.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testCountOfNegativeNumbers(){
        int actualCount = action.countOfNegativeNumbers(array);
        int expectedCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                expectedCount++;
            }
        }
        Assert.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void testCountOfPositiveNumbers(){
        int actualCount = action.countOfPositiveNumbers(array);
        int expectedCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                expectedCount++;
            }
        }
        Assert.assertEquals(actualCount, expectedCount);
    }
}