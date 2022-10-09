//Q4) Create a two dimensional array of integers and display:
//
//        sum of all elements of each column
//        sum of all elements of each row

import java.util.Scanner;

public class Question4 {
    public static void sumOfRows(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = 0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.println("Sum of row no : "+sum);
        }
    }

    public static void sumOfCols(int[][] arr){
        for(int i = 0; i<arr[0].length; i++){
            int sum = 0;
            for(int j = 0; j<arr.length; j++){
                sum += arr[j][i];
            }
            System.out.println("Sum of cols no : "+sum);
        }
    }

    public static void main(String[] args){
        int[][] arr2d = {
                {1,11,1,1,0},
                {2,2,2,0,9},
                {4,4,0,4,9},
                {2,1,20,1,0}
        };

        sumOfCols(arr2d);
        sumOfRows(arr2d);
    }
}
