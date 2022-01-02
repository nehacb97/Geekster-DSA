public class MaxMinArray {
    public static void main(String[] args) {
      int arr[] = {54, 24, 4, 0, 2, 45, 55, 9, -7, 68};	
      int max = maxUsingRecursion(arr, arr[0], 0);
      int min = minUsingRecursion(arr, arr[0], 0);
      System.out.println("Maximum number = " 
           + max + " Minimum number = " + min);		
    }
  
    private static int maxUsingRecursion(int[] arr, int num, int size){	
    
      if(size == arr.length){
        return arr[size-1];	
      }
      return Math.max(num, maxUsingRecursion(arr, arr[size], ++size));
    }
  
    private static int minUsingRecursion(int[] arr, int num, int size){
    
      if(size == arr.length)
        return arr[size-1];
      return Math.min(num, minUsingRecursion(arr, arr[size], ++size));
    }
  }