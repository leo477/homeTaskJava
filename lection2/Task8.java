package lection2;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];
        for (int i=0; i< array.length; i++) {
            array[i]= random.nextInt(10)+1;
            System.out.println("a [ " + i + " ] = " + array[i]);
        }

        System.out.println("\nChanged Array ");
        for (int i=0; i< array.length; i++)
            if (i%2!=0)
                array[i]=0;
        for (int i=0; i< array.length; i++)
            System.out.println("a [ " + i + " ] = " + array[i]);
        System.out.println("\nArray [-15;15]");
        int[] array1 = new int[12];

        for (int i=0; i< array1.length; i++) {
            array1[i]=random.nextInt(31)-15;
            System.out.println("a [ " + i + " ] = " + array1[i]);
        }
        int max=array1[0];
        int maxI=0;
        for (int i=1; i< array1.length; i++)
            if (array1[i]>max){
                max=array1[i];
                maxI=i;
            }
        System.out.println("MaxElement is a [ " + maxI + " ] = " + max);

        int[] arr = new int[4];
        for (int i=0; i< arr.length; i++) {
            arr[i]=random.nextInt(90)+10;
            System.out.print(arr[i] + " ");
        }
        boolean flag=false;
        for (int i=1; i< arr.length; i++) {
            if(arr[i-1]>arr[i]){
                flag=true;
                break;
            }
        }
        if (flag==false){
            System.out.println(" - Последовательность строго растущая");
        } else {
            System.out.println(" - Последовательность не растущая");
        }
    }
}