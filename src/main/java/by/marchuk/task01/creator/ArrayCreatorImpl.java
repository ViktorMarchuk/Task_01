package by.marchuk.task01.creator;

import by.marchuk.task01.entity.CustomArray;

public class ArrayCreatorImpl implements ArrayCreator{


    @Override
    public CustomArray createArray(int[] array){
        return new CustomArray(array);
    }

    public void arr(int[] arr, CustomArray[] customArray){
        for(int i = 0; i < customArray.length; i++){
            System.out.println(customArray + " ");
        }
    }
}