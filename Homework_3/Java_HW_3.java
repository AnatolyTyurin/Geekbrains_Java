package ru.geekbrains.lesson3;

import java.util.Arrays;

public class Java_HW_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changeArr(arr1)));

        int[] arr2 = new int[100];
        System.out.println(Arrays.toString(listNumbers(arr2)));

        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,8,1};
        System.out.println(Arrays.toString(multArr(arr3)));

        int[][] arr4 = new int[5][5];
        sqArr(arr4);

        System.out.println(Arrays.toString(lenArr(7, 4)));
    }

    public static int[] changeArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }
    public static int[] listNumbers(int[] arr2) {
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;}
        return arr2;
    }

    public static int[] multArr(int[] arr3) {
        for(int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        return arr3;
    }

    public static int [][] sqArr(int[][] arr4){
        for(int  i = 0; i < arr4.length; i++) {
            for(int j = 0; j < arr4[i].length; j++) {
                if(i == j || (i + j) == arr4.length - 1) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(arr4[i]));
        }
        return arr4;
    }

    public static int[] lenArr(int len, int initialValue) {
        int[] arr5 = new int[len];
        for(int i = 0; i < len; i++) {
            arr5[i] = initialValue;
        }
        return(arr5);
    }

}
