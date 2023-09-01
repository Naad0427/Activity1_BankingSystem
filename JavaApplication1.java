/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Arrays;



public class JavaApplication1 {

  
    public static void main(String[] args) {
        
        int [] origArray = { 1,2,3,4,5};
        
        int elementToDelete = 4;
        
//        if(origArray == null || origAray.length == 0) {
//            System.out.println("Array is empty.");
//            
for (int i = 0; i < origArray.length; i++) {
    origArray[i -1] = origArray[i];
}

    int [] newArray = new int[origArray.length -1];
    System.arraycopy(origArray,0, newArray, 0, origArray.length -1); 
    
        System.out.println("Array after deleting:");
        
        for (int  num : newArray) {
            System.out.println(num + " ");

            
        }
        }
        
        
//        int[] origArray  = { 1,2,3,4,5};
//        
//        try (Scanner scn = new Scanner(System.in)) {
//            System.out.println("Insert Element:");
//            int elementToInsert = scn.nextInt();
//            if (origArray.length >= Integer.MAX_VALUE) {
//                System.out.println("Array is too large");
//            } else {
//                int [] newArray = Arrays.copyOf(origArray,origArray.length +1);
//                
//                newArray[newArray.length - 1] = elementToInsert;
//                
//                System.out.println("Orig Array:" + Arrays.toString(origArray));
//                
//                System.out.println("Element Inserted at the end:" + elementToInsert);
//                
//                System.out.println("Updated Array" + Arrays.toString(newArray));
//            }
//            
//       int[] origArray  = { 1,2,3,4,5};
//       
//       int elementToInsert = 6;
//       
//       int positionToInsert = 2;
//       
//      if(positionToInsert >0 && positionToInsert <= origArray.length) {
//          
//          int [] newArray = new int[origArray.length + 1];
//          
//          for (int i = 0; i < positionToInsert; i++) {
//              newArray[i] = origArray[i]; 
//          }
//          newArray[positionToInsert] = elementToInsert;
//
//          for (int i = positionToInsert; i < origArray.length; i++) 
//          {
//              newArray[i + 1] = origArray[i]; 
//          }
//          System.out.println("Orig Array:" + Arrays.toString(origArray));
//          
//          System.out.println("Element Inserted:" + elementToInsert);
//          
//          System.out.println("Updated Array:" + Arrays.toString(newArray));
//      }
//      else { 
//          System.out.println("Invalid position between 0 and" + origArray.length);
//
//
//
////              
////          }
////          
//        }
//          
//       
              
          }
      
       
       
       
        
//        Scanner scanner= new Scanner(System.in);
//        
//        System.out.println(" Enter the elements of the array:");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        
//        System.out.println("Enter the number:");
//        for (int i=0; i < size; i++) {
//            array[i] = scanner.nextInt();
//            
//        
//        }
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        
//        System.out.println("Original Array:");
//        printArray(array);
//        for (int i=0; i < size; i++) {
//            array[i] = scanner.nextInt();
//            
//        }
//        System.out.println("Original Array:");
//            printArray(array);
//            
//            scanner.close();
//    }
//                 public static void printArray(int arr[]) {
////        
//        for (int num : arr){
//            System.out.println(num + " ");
//        }
//            
        
        
        
    
    
//    public static void insertionSort(int arr[]) {
//        int n = arr.length;
//        for (int i =  1; i <n; i++){
//            int insert = arr[i];
//            int j = i - 1;
//            
//            while (j >= 0 && arr[j] > insert) {
//                arr [j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr [j + 1] = insert;
//                
//            }
//        }
//    
//    public static void printArray(int arr[]) {
//        
//        for (int num : arr){
//            System.out.println(num + " ");
//        }
//    }
//    }
    
    
         
////      int  []arr = { 20, 14, 4, 34, 69, 73, 12, 42};
////        
////        System.out.println("Original");
////        printArray(arr);
////        
////        selectionSort(arr);
////        
////        System.out.println("Sorted");
////        printArray(arr);
////        
////    }
////    
////    public static void selectionSort(int arr[]){
////        int n = arr.length;
////        for (int i = 0; i < n - 1; i++) {
////            int minIndex = 1;
////            for (int j = i + 1; j < n; j++) {
////                if (arr[j] < arr[minIndex]) {
////                    minIndex =j;
////                }
////            }
////            int m = arr[i];
////            arr[i] = arr[minIndex];
////            arr [minIndex] = m;
////            
////                }
////            }
////    public static void printArray(int arr[]) {
////        for (int num : arr) {
////            System.out.println(num + " ");
////        }
////    }
////}
//
//        
//    
//     /*  int [] arr = { 5, 16, 15, 21, 400, 400, 100, 31, 41, 51, 23, 7, 90, 75, 89};
//       
//       System.out.println("Original set of Array:");
//       printArray(arr);
//       
//       bubbleSort(arr);
//       
//       System.out.println("\n Sorted Array:");
//       printArray(arr);
//    }
//    
//    public static void bubbleSort(int arr[]){
//        int n = arr.length;
//        
//        for (int i = 0; i < n - 1; i++){
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr [ j + 1]) {
//                int m = arr[j];
//                arr [j] = arr[j + 1];
//                arr [j + 1] = m;
//            }
//            }
//        }
//    }
//    public static void printArray(int arr[]) {
//        for (int num : arr) {
//            System.out.println(num + " ");
//            
//                    
//        }
//    }
//}
//
//
