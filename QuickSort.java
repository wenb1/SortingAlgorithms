package dev.wenbo.algorithm;

public class QuickSort {
    public static void quickSort(int[] array){
        sort(array, 0, array.length-1);
    }

    private static void sort(int[] array, int lo, int hi){
        if(lo>=hi)
            return;
        int j=partition(array, lo, hi);
        sort(array, lo, j-1);
        sort(array, j+1, hi);
    }

    private static int partition(int[] array, int lo, int hi){
        int i=lo, j=hi+1;
        int v=array[lo];
        while (true){
            while(array[++i]<v){
                if(i==hi)
                    break;
            }
            while(v<array[--j]){
                if(j==lo)
                    break;
            }
            if(i>=j)
                break;
            exch(array, i, j);
        }
        exch(array, lo, j);
        return j;
    }

    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
