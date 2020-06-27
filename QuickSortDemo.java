package dev.wenbo.algorithm;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] test= {3,2,1,5,4,1};
        QuickSort.quickSort(test);
        for(int i:test)
            System.out.println(i);
    }
}
