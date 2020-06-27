package dev.wenbo.algorithm;

public class BubbleSort {

    // array为待排序数组
    public static void bubbleSort(int[] array){
        int length=array.length;

        if(length<=1){
            return;
        }

        for(int i=0;i<length;i++){
            // 提前退出冒泡循环的标志位
            boolean flag=false;
            for(int j=0;j<length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) break;
        }
    }
}
