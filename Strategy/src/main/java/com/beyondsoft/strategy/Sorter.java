package com.beyondsoft.strategy;

/**
 * 选择排序算法
 */
/*
public class Sorter {

    public static void sort(Comparable[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minPos =i;
            for(int j=i+1;j<arr.length;j++){
                minPos=arr[j].compareTo(arr[minPos]) ==-1 ?  j : minPos;
            }
            swap(arr,i,minPos);
            //System.out.println("--"+arr[minPos]);
        }
    }

    static void swap(Comparable[] arr, int i,int j){
        Comparable temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

}
*/


public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparetor) {
        for(int i=0;i<arr.length-1;i++){
            int minPos =i;
            for(int j=i+1;j<arr.length;j++){
                minPos=comparetor.compare(arr[j],arr[minPos]) ==-1 ?  j : minPos;
            }
            swap(arr,i,minPos);
            //System.out.println("--"+arr[minPos]);
        }
    }

    void swap(T[] arr, int i, int j){
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

}


