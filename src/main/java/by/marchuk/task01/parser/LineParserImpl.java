package by.marchuk.task01.parser;

import by.marchuk.task01.validator.TextFileValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LineParserImpl implements LineParser{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String REGEX = ",";

    @Override
    public int[] parseLine(List <String> list){
        List <Integer> array = new ArrayList <>();
        TextFileValidatorImpl validator = new TextFileValidatorImpl();
        for(int i = 0; i < list.size(); i++){
            if(validator.validateString(list.get(i))){
                String[] arrayString = list.get(i).split(REGEX);
                for(String element: arrayString){
                    array.add(Integer.parseInt(element));
                }
            }
        }
        int[] arrayInt = new int[array.size()];
        for(int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = array.get(i);
        }
        return arrayInt;
    }
}
