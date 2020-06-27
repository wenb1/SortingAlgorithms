package dev.wenbo.algorithm;

public class SelectionSort {
    public static void selectionSort(int[] array){
        int length=array.length;

        if(length<=1)
            return;

        for(int i=0;i<length;i++){
            int min=i;
            for(int j=i+1;j<length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
}
