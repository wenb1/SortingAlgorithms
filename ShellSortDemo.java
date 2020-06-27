package dev.wenbo.algorithm;

public class ShellSortDemo {
    public static void main(String[] args) {
        int[] test= {3,2,1,5,4,1,5,6,8,7,55,44,1};
        ShellSort.shellSort(test);
        for(int i:test)
            System.out.println(i);
    }
}
