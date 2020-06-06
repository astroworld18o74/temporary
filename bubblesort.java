import java.util.*;
import java.util.Scanner;
class sol{
    static int[] nums;
    public void bubblesort(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean x=true;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    nums[j+1]+=nums[j];
                    nums[j]=nums[j+1]-nums[j];
                    nums[j+1]-=nums[j];
                    x=false;
                }
            }
            if(x==true) return;
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
        th.bubblesort(nums);
        th.printArray(nums);
    }
}
