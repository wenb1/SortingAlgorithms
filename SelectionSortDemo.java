package dev.wenbo.algorithm;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] test= {3,2,1,5,4,1};
        SelectionSort.selectionSort(test);
        for(int i:test)
            System.out.println(i);
    }
}
