package by.marchuk.task01.entity;

import java.util.Arrays;

public class CustomArray{
    private int[] array;

    public CustomArray(){

    }

    public CustomArray(int... array){
        this.array = array;
    }

    public int[] getArray(){
        return array.clone();
    }

    public void setArray(int[] array){
        this.array = array;
    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(array);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        CustomArray that = (CustomArray)obj;
        return Arrays.equals(array, that.array);
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("CustomArray :");
        sb.append(array);
        return sb.toString();
    }
}
