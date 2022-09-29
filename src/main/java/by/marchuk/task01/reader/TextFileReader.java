package by.marchuk.task01.reader;

import by.marchuk.task01.exception.ResourceException;

import java.util.List;

public interface TextFileReader{
    List <String> readFromFile(String fileName) throws ResourceException;

}
