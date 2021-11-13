package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int arr[] = {10, 20, 30, 40, 50};
//        System.out.println(arr.length);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//
//        int arr1[][] = {{50, 60}, {70, 80, 100, 200, 400}, {90, 100, 200}};
//
//        System.out.print("The length of the given array = ");
//        System.out.println(arr.length);
//        System.out.println("arr[0] length = " + arr1[0].length);
//        System.out.println("arr[1] length = " + arr1[1].length);
//        System.out.println("arr[2] length = " + arr1[2][1]);
//
//        for (int i = 0; i < arr1.length; i++) {
//            for(int j=0; j<arr1[i].length; j++) {
//                System.out.print(arr1[i][j] + " ");
//            }
//        }
//        int[] array={5, 10, 20, 30, 55};
//        display(array);
//        int sum = sumOfArrayElements(array);
//        System.out.println("\nSum of"
//                + " array elements: " + sum);
//
//
//        int[] a = {10,20,30,40};
//        m1(a);
//        for(int i=0; i < a.length; i++){
//            System.out.print(a[i]+"\t");
//        }
//
//        for(int i : a) {
//            System.out.print(i+"\t");
//        }
//
//        System.out.println(Arrays.toString(a));

        // create Scanner class object
//        Scanner scan = new Scanner(System.in);
//        // take number of elements in both array
//        System.out.print("Enter number of elements in first array: ");
//        int array1size = scan.nextInt();
//        System.out.print("Enter number of elements in second array: ");
//        int array2size = scan.nextInt();
//        // both array must have same number of elements
//        if(array1size != array2size) {
//            System.out.println("Both array must have "+
//                    "same number of elements");
//            return; // stop
//        }
//
//
//        // declare three array with given size
//        int array1[] = new int[array1size];
//        int array2[] = new int[array1size];
//        int array3[] = new int[array1size];
//
//        // take input for array1 elements
//        System.out.println("Enter first array elements: ");
//        for (int i=0; i<array1.length; i++) {
//            array1[i] = scan.nextInt();
//        }
//
//        // take input for array2 elements
//        System.out.println("Enter second array elements: ");
//        for (int i=0; i<array2.length; i++) {
//            array2[i] = scan.nextInt();
//        }
//
//        // loop to iterate through the array
//        for (int i=0; i<array3.length; i++) {
//            // add array elements
//            array3[i] = array1[i] + array2[i];
//        }
//
//        // display the third array
//        System.out.println("Resultant Array: "
//                + Arrays.toString(array3));

        // declare and initialize arrays
//        int arr1[] = {10,20,30,40,50};
//        int arr2[] = arr1;
//        int arr3[] = {10,20,30,40,50};
//        int arr4[] = {15,25,35,45,55};
//
//        if(arr1 == arr2)
//            System.out.println("arr1 & arr2 are same");
//        else
//            System.out.println("arr1 & arr2 are not same");
//
//        // compare arr1 and arr3
//        if(arr1 == arr3)
//            System.out.println("arr1 & arr3 are same");
//        else
//            System.out.println("arr1 & arr3 are not same");
//
//        // compare arr1 and arr4
//        if(arr1 == arr4)
//            System.out.println("arr1 & arr4 are same");
//        else
//            System.out.println("arr1 & arr4 are not same");
//
//        if(Arrays.equals(arr1, arr3))
//            System.out.println("arr1 & arr3 are same");
//        else
//            System.out.println("arr1 & arr3 are not same");

        // original array
       // int arr[] = {10, 20, 30, 40, 50};

// copy array using assignment operator
//        int newArr[] = arr;
//// display array (Before Modification)
//        System.out.println("Before Modification,");
//        System.out.println("Original Array = " + Arrays.toString(arr));
//        System.out.println("Copied Array = " + Arrays.toString(newArr));
//
//        arr[0] = 555;
//        arr[3] = 777;
//
//        // display array (After Modification)
//        System.out.println("\nAfter Modification,");
//        System.out.println("Original Array = " + Arrays.toString(arr));
//        System.out.println("Copied Array = " + Arrays.toString(newArr));


//        int newArr1[] = new int[arr.length];
//
//        // copy using loop
//        for (int i = 0; i < arr.length; i++) {
//            // copy elements
//            newArr1[i] = arr[i];
//        }
//
//        // display array (Before Modification)
//        System.out.println("Before Modification,");
//        System.out.println("Original Array = " + Arrays.toString(arr));
//        System.out.println("Copied Array = " + Arrays.toString(newArr1));
//
//        // modifying content of original array
//        arr[0] = 555;
//        arr[3] = 777;
//
//        // display array (After Modification)
//        System.out.println("\nAfter Modification,");
//        System.out.println("Original Array = " + Arrays.toString(arr));
//        System.out.println("Copied Array = " + Arrays.toString(newArr1));
//
//        int newArr2[] = new int[arr.length];
//        System.arraycopy(arr, 0, newArr2, 0, arr.length);
//        newArr2[0] = 999;
//        System.out.println("Original Array = " + Arrays.toString(arr));
//        System.out.println("Copied Array = " + Arrays.toString(newArr2));
//
//        int[] newArr3 = Arrays.copyOf(arr, arr.length);
//        System.out.println("Original Array = " + Arrays.toString(arr));
//        System.out.println("Copied Array = " + Arrays.toString(newArr3));
//
//        int[] newArr4 = Arrays.copyOfRange(arr, 0, arr.length);
//
//        int[] newArr5 = arr.clone();

        // array which should be merged
//        int src1[] = {10, 20, 30, 40, 50};
//        int src2[] = {9, 18, 27, };
//
//        int newArray[] = new int[src1.length + src2.length];

//        for(int i=0; i<src1.length; i++) {
//            newArray[i] = src1[i];
//        }
//        for(int i=0,j=src1.length;j<(src1.length + src2.length);j++, i++) {
//            newArray[j] = src2[i];
//        }
//
//        System.out.println("Array1 = " + Arrays.toString(src1));
//        System.out.println("Array2 = " + Arrays.toString(src2));
//        System.out.println("Merged Array = "
//                + Arrays.toString(newArray));

        // Copy first to new array from 0 to src1.length
//        System.arraycopy(src1, 0, newArray, 0, src1.length);
//
//        // copy second array to new array
//        System.arraycopy(src2, 0, newArray, src1.length, src2.length);
//
//        // display all array
//        System.out.println("Array1 = " + Arrays.toString(src1));
//        System.out.println("Array2 = " + Arrays.toString(src2));
//        System.out.println("Merged Array = "
//                + Arrays.toString(newArray));

        // array which should be merged
//        String src1[] = {"Java", "Python", "C++"};
//        String src2[] = {"HTML", "CSS", "JavaScript"};
//
//        // create new array
//        String newArray[] = new String[src1.length + src2.length];
//
//        // Copy first to new array from 0 to src1.length
//        System.arraycopy(src1, 0, newArray, 0, src1.length);
//
//        // copy second array to new array
//        System.arraycopy(src2, 0, newArray, src1.length, src2.length);
//
//        // display all array
//        System.out.println("Array1 = " + Arrays.toString(src1));
//        System.out.println("Array2 = " + Arrays.toString(src2));
//        System.out.println("Merged Array = "
//                + Arrays.toString(newArray));

        // array which should be merged
//        int src1[] = {10, 20, 30, 40, 50};
//        int src2[] = {9, 18, 27, 36, 45};
//
//        // create new array
//        int newArray[] = new int[src1.length + src2.length];
//
//        // Copy first to new array from 0 to src1.length
//        System.arraycopy(src1, 0, newArray, 0, src1.length);
//        // copy second array to new array
//        System.arraycopy(src2, 0, newArray, src1.length, src2.length);
//
//        // sort new array
//        Arrays.sort(newArray);
//        System.out.println("Array1 = " + Arrays.toString(src1));
//        System.out.println("Array2 = " + Arrays.toString(src2));
//        System.out.println("Merged Array = "
//                + Arrays.toString(newArray));

        int src2[] = {19, 18, 27, 136, 45};
        Arrays.sort(src2);
        System.out.println("Array2 sort = " + src2[src2.length - 2]);
        System.out.println("Array2 = " + largest(src2));
    }

    static int largest(int[] a) {
        int max =a[0]; // 19
        for(int item: a) {
            if(max < item) {
                System.out.println("loop = " + item);
                max = item;
            }
        }
        return max;
    }

    static void display(int[] a) {
        for(int i=0; i< a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }

    static int sumOfArrayElements(int[] a) {
        int sum =0;
        for(int i =0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    static void m1(int[] ia){
        ia[1] = 4;
        ia[2] = 5;
    }
}
