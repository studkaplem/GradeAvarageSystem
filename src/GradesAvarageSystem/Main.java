package GradesAvarageSystem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*int [] array = new int[6];
        randomFill(array);
        printArray(array);
        bubbleSort(array);
        printArray(array);

        System.out.println(array[array.length/2]);*/

        /*DecimalFormat df = new DecimalFormat();


        Student emre = new Student("Emre");
        emre.add("Mathematik",2);
        emre.add("Englisch", 3);
        emre.add("BWR",1);
        emre.add("Geschichte",1);

        System.out.println(emre.getName()+" hat Durchschnitt: "+emre.getAvarage());*/

        int [] array = new int[6];
        randomFill(array);
        printArray(array);
        insertionSort(array);
        printArray(array);



    }




    // erzeugt automat. Zahlen zw. 1 und 100 für Array
    public static void randomFill(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
    }

    public static void printArray(int[] arr){
        if (arr.length == 0){
            System.out.println("[ ]");
            return;
        }

        // printet das Array
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1]+"]");
    }

    // bubblesort alg.
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int k = 0; k < arr.length - 1; k++){ // sonst ArrayIndexOutOfBoundsException
                if (arr[k] > arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
    }

    // insertionsort alg.
    public static void insertionSort(int[]array){

        for (int i = 1; i < array.length; i++){
            int valueToSort = array[i];
            int k = i;

            while (k > 0 && array[k-1] > valueToSort){
                array[k] = array[k-1];
                k--;
            }
            array[k] = valueToSort;
        }
    }



}
