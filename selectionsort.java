import java.util.*;
import java.util.Scanner;
class sol{
    static int[] nums;
    public void selectionsort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++)
                if(nums[j]<nums[min])
                    min=j;
            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        return;
    }
    public void stableSelectionSort(int[] a, int n) 
    { 
        // Iterate through array elements 
        for (int i = 0; i < n - 1; i++)  
        { 
  
            // Loop invariant : Elements till  
            // a[i - 1] are already sorted. 
  
            // Find minimum element from  
            // arr[i] to arr[n - 1]. 
            int min = i; 
            for (int j = i + 1; j < n; j++) 
                if (a[min] > a[j]) 
                    min = j; 
  
            // Move minimum element at current i. 
            int key = a[min]; 
            while (min > i)  
            { 
                a[min] = a[min - 1]; 
                min--; 
            } 
              
            a[i] = key; 
        } 
    } 
    public void printArray(int [] nums){
        for(int i : nums)
            System.out.print(i+" ");
        System.out.println("\n");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter array size: ");
        n=scan.nextInt();
        System.out.println("Enter elements: ");
        int i=0;
        nums=new int[n];
        while(i<n){
           nums[i]=scan.nextInt();
           i++;
        } 
        sol th=new sol();
        th.selectionsort(nums);
        th.printArray(nums);
    }
}
