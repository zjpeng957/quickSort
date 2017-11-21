import java.io.*;
import java.util.Scanner;

public class sort {

    public static void main(String []args) throws IOException
    {
        int nums[];
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        nums=new int[n];
        for (int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }

        outPut(nums,n);
        quickSort(nums,0,n-1);
        outPut(nums,n);
    }

    public static void outPut(int list[],int n)
    {
        for (int i=0;i<n;i++) System.out.print(list[i]+" ");
        System.out.println();
    }
    public static void quickSort(int list[],int l,int r)
    {
        if(l<r)
        {
            int mid=partition(list,l,r);
            quickSort(list,l,mid);
            quickSort(list,mid+1,r);
        }
    }
    public static int partition(int list[],int l,int r)
    {
        int midN=list[l];

        while (l<r)
        {

            while (list[r]>=midN&&l<r) r--;
            list[l]=list[r];
            while (list[l]<=midN&&l<r) l++;
            list[r]=list[l];
        }
        list[l]=midN;


        return l;
    }
}

class item{
    private int key;
    private String str;
    public item(int n)
    {
        key=n;
        str=Integer.toString(n);
    }
    public int getKey()
    {
        return key;
    }
}
