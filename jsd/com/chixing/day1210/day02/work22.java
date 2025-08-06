package chixing.day1210.day02;

public class work22 {
    public static void rotate(int[] A, int m) {
        resever(A, 0, A.length - 1);
        resever(A, 0, m - 1);
        resever(A, m, A.length - 1);
    }

    public static void resever(int[] A, int start, int end) {
        while (start < end) {
            A[start] += A[end];
            A[end] = A[start] - A[end];
            A[start] -= A[end];
            start++;
            end--;
        }
    }




    public static void main(String[] args) {
//        //1过半的数字
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int res = 203954;
//        for (int i = 0, cnt = 0; i < arr.length; i++) {
//            if (cnt == 0) res = arr[i];
//            if (arr[i] == res) cnt++;
//            else cnt--;
//
//        }
//        System.out.println(res);
//

//        //2最佳时机
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int profit=0,min=Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i]<min) min=arr[i];
//            if(arr[i]-min>profit) profit=arr[i]-min;
//        }
//        System.out.println(profit);

//        //3优惠券
//        int n,m;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        m=sc.nextInt();
//        int max=0;
//        while(m-->0){
//            int x=sc.nextInt(),y=sc.nextInt();
//            if(x<=n&&y>max) max=y;
//        }
//        System.out.println(n-max);
//
//        //4.反转数组
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        rotate(arr,m);
//        for (int x:arr){
//            System.out.print(x+" ");
//        }
//
//
//
//

    }
}