package dev.wenbo.algorithm;

public class MergeSort {
    public static void mergeSort(int[] array){
        sort(array, 0, array.length-1);
    }

    private static void sort(int[] array, int lo, int hi){

        if(lo>=hi)
            return;

        int mid=(lo+hi)/2;
        sort(array, lo, mid);
        sort(array, mid+1, hi);
        merge(array, lo, mid, hi);
    }

    private static void merge(int[] array, int lo, int mid, int hi){
        int[] aux=new int[array.length];
        int i=lo, j=mid+1;

        for(int k=lo;k<=hi;k++){
            aux[k]=array[k];
        }

        for(int k=lo;k<=hi;k++){
            if(i>mid)
                array[k]=aux[j++];
            else if(j>hi)
                array[k]=aux[i++];
            else if(aux[j]<aux[i])
                array[k]=aux[j++];
            else
                array[k]=aux[i++];
        }
    }
}
