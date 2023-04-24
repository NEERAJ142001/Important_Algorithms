import java.util.Scanner;

class Binary_search {
    private boolean search(int arr[],int size,int element)
    {
       int start=0;
       int end=size-1;
       int mid=start+(end-start)/2;

       while(start<end)
       {
           if(arr[mid]==element)
               return true;
           else if(element>arr[mid])
               start=mid+1;
           else if(element<arr[mid])
               end=mid-1;

           mid=start+(end-start)/2;
       }
       return false;
    }
    public static void main(String args[])
    {Binary_search n=new Binary_search();
       Scanner sc=new Scanner(System.in);
        System.out.println("input size");
        int x=sc.nextInt();
        int arr[] = new int[x];
        System.out.println("input elements in ascending order");
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("input element to be searched");
        int xyz=sc.nextInt();
        boolean answer=n.search(arr,x,xyz);
        System.out.println(answer);
    }
}

