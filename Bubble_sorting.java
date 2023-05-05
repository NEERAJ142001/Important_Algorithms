import java.util.*;
public class lb_17_bubble_sorting {
    /*
    in bubble sorting,it compares with next number and swap it
    in every round it set the highest number it the right size of array one by one(last)
    time complexity  worst=O(n^2) and best =O(n)
    space complexity O(1)
    stable algorithms
    inplace sorting= used constant space for sorting
    */

    private void bubble(int arr[],int size) {
        int temp;

        //size=9 0 to 8
        for (int i = 0; i < size - 1; i++){// 1 to size
            boolean swap=false;
            // 0 to 8 because jis comparison with j+1;
            for (int j = 0; j < size-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    switching the values
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 1st round set the highest value on the right size ,goes on
                    swap=true;
                }
            }
            if(swap==false)
                break;
        }
    }
        private void print(int arr[],int size)
        {
            System.out.println("Your sorted array list is:");
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+ " ");
            }
        }
    public static void main(String[] args) {
        lb_17_bubble_sorting m=new lb_17_bubble_sorting();
        Scanner sc=new Scanner(System.in);

        System.out.println("input length of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your numbers");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        m.bubble(arr,n);
        m.print(arr,n);
    }

}
