package by.marchuk.task01.validator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileValidatorImpl implements TextFileValidator{
    private static final Logger LOGGER = LogManager.getLogger();

    private static final String REGEX_FOR_FILE = "[0-9,-]*";


    @Override
    public boolean validateString(String line){
        if(line == null || line.isBlank()){
            LOGGER.error("Line " + line + " is empty");
        }
        boolean pattern = Pattern.matches(REGEX_FOR_FILE, line);
        return pattern;
    }
}
