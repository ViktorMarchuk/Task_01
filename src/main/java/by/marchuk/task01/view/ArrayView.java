package by.marchuk.task01.view;

public class ArrayView{
    public void showArray(int[] array){
        System.out.print("Array :");
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
