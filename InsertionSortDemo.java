package dev.wenbo.algorithm;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] test= {3,2,1,5,4,1};
        InsertionSort.insertionSort(test);
        for(int i:test)
            System.out.println(i);
    }
}
