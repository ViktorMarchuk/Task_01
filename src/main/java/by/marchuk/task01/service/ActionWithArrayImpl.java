package by.marchuk.task01.service;

public class ActionWithArrayImpl implements ActionWithArray{
    @Override
    public int findMaxNumber(int[] array){
        int maxNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(maxNumber < array[i]){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    @Override
    public int findMinNumber(int[] array){
        int minNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(minNumber > array[i] || minNumber == 0){
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    @Override
    public int[] changeElementsOfArray(int[] array, int changedNumber, int numberForChange){
        System.out.print("Array after changing: ");
        for(int i = 0; i < array.length; i++){
            if(array[i] == numberForChange){
                array[i] = changedNumber;
            }
        }
        return array;

    }


    @Override
    public double findAverageValue(int[] array){
        double averageValue = 0.0;
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            averageValue = sum / array.length;
        }
        return averageValue;
    }

    @Override
    public int findSumOfElements(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    @Override
    public int countOfNegativeNumbers(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public int countOfPositiveNumbers(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 0){
                count++;
            }
        }
        return count;
    }
}
