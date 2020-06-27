package dev.wenbo.algorithm;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int length=array.length;

        if(length<=1)
            return;

        for(int i=1;i<length;i++){
            int value=array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>value){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=value;
        }
    }
}
