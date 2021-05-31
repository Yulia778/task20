package com.metanit;

public class Main {

    public static void main(String[] args) {
        int elements[] = {1,3,5,8,10,12,14,84,34,56};
        getMax(elements);
        int maxElement=getMax(elements);
        System.out.println(maxElement);
    }public static int getMax(int[] array) {

    int maxElement=0;
     for (int i=0; i< array.length;i++){
         if (array[i]>maxElement){
             maxElement=array[i];
         }
     }return maxElement;

        }

    }

