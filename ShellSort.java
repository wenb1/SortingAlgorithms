package dev.wenbo.algorithm;

public class ShellSort {
    public static void shellSort(int[] array){
        int length=array.length;
        int h=1;

        if(length<=1)
            return;

        while(h<length/3)
            h=h*3+1;

        while(h>=1){
            for(int i=h;i<length;i++){
                int value=array[i];
                int j=i-h;
                for(;j>=0;j=j-h){
                    if(array[j]>value){
                        array[j+h]=array[j];
                    }else
                        break;
                }
                array[j+h]=value;
            }
            h=h/3;
        }
    }
}
