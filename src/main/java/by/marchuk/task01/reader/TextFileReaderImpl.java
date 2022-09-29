package by.marchuk.task01.reader;


import by.marchuk.task01.exception.ResourceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReaderImpl implements TextFileReader{
    private final static Logger LOGGER = LogManager.getLogger();


    @Override
    public List <String> readFromFile(String fileName){
        List <String> array = new ArrayList <>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                array.add(line);
            }
        }catch(FileNotFoundException e){
            LOGGER.error("Not found file " + fileName);
            new ResourceException("Not found file " + fileName);
        }catch(IOException e){
            LOGGER.error("I/O exception");
            new ResourceException("I/O exception");
        }
        return array;
    }
}
