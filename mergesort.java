import java.util.*;
import java.util.Scanner;
class sol{
    static int[] nums;
    public void mergesort(int [] nums,int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergesort(nums,l,m);
            mergesort(nums,m+1,r);
            merge(nums,l,m,r);
        }
        return;
    }
    public void merge(int [] nums, int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        
        int [] left=new int[n1];
        int [] right=new int[n2];
        
        for(int i=0;i<n1;i++)
            left[i]=nums[l+i];
        for(int i=0;i<n2;i++)
            right[i]=nums[m+1+i];
        
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]>right[j])
                nums[k++]=right[j++];
            else 
            nums[k++]=left[i++];
        }
        while(i<n1)
            nums[k++]=left[i++];
        while(j<n2)
            nums[k++]=right[j++];
        return;
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
        th.mergesort(nums,0,n-1);
        th.printArray(nums);
    }
}
