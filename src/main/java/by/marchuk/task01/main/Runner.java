package by.marchuk.task01.main;


import by.marchuk.task01.creator.ArrayCreatorImpl;
import by.marchuk.task01.entity.CustomArray;
import by.marchuk.task01.parser.LineParserImpl;
import by.marchuk.task01.reader.TextFileReaderImpl;
import by.marchuk.task01.service.ActionWithArrayImpl;
import by.marchuk.task01.service.SortingImpl;
import by.marchuk.task01.view.ArrayView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Runner{
    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args){
        TextFileReaderImpl textFileReader = new TextFileReaderImpl();
        LineParserImpl lineParser = new LineParserImpl();
        CustomArray array = new CustomArray();
        ArrayCreatorImpl creator = new ArrayCreatorImpl();
        ActionWithArrayImpl action = new ActionWithArrayImpl();
        String fileName = "resources\\date.txt";
        List <String> list = textFileReader.readFromFile(fileName);
        int[] arrayAfterParse = lineParser.parseLine(list);
        CustomArray arrayForView = creator.createArray(arrayAfterParse);
        ArrayView view = new ArrayView();
        SortingImpl sorting = new SortingImpl();
        view.showArray(arrayForView.getArray());

        System.out.println("Max number is " + action.findMaxNumber(arrayAfterParse));
        System.out.println("Min number is " + action.findMinNumber(arrayAfterParse));
        System.out.println("Average value is " + action.findAverageValue(arrayAfterParse));
        System.out.println("Array's sum of elements is " + action.findSumOfElements(arrayAfterParse));
        System.out.println("Amount of negative elements is " + action.countOfNegativeNumbers(arrayAfterParse));
        System.out.println("Amount of positive elements " + action.countOfPositiveNumbers(arrayAfterParse));
        System.out.println(Arrays.toString(action.changeElementsOfArray(arrayAfterParse, 10, -1)));

        sorting.bubbleSort(arrayAfterParse);
        sorting.insertionSort(arrayAfterParse);
        sorting.selectionSort(arrayAfterParse);
    }
}
/*
Array :-1 5 3 2
Max number is 5
Min number is -1
Average value is 2.25
Array's sum of elements is 9
Amount of negative elements is 1
Amount of positive elements 3
Array after changing: [10, 5, 3, 2]
Array after bubble sorting [2, 3, 5, 10]
Array after insertion sorting [2, 3, 5, 10]
Array after select sorting [2, 3, 5, 10]
 */