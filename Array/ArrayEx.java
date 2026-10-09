package Array;

public class ArrayEx {
    public static void main(String[] args){
        
        //int[] num = {10,20,30};

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr.length);

        for(int i=0; i<=4; i++){
            System.out.println(arr[i]);
        }
    }
}
