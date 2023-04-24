class linear_search {
    private boolean search(int arr[],int size,int element)
    {
        for(int i=0;i<size;i++)
        {
            if(element==arr[i])
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {linear_search n=new linear_search();
       Scanner sc=new Scanner(System.in);
        System.out.println("input size");
        int x=sc.nextInt();
        int arr[] = new int[x];
        System.out.println("input elements");
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
