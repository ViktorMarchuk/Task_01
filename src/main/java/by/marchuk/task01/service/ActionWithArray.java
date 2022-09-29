package by.marchuk.task01.service;

public interface ActionWithArray{
    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

    int[] changeElementsOfArray(int[] array, int changedNumber, int numberForChange);

    double findAverageValue(int[] array);

    int findSumOfElements(int[] array);

    int countOfNegativeNumbers(int[] array);

    int countOfPositiveNumbers(int[] array);
}
