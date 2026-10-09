package Array;

public class reverseArray {
    public static void main(String[] args) {

        int[] arr2 = new int[5];
        arr2[0] = 40;
        arr2[1] = 30;
        arr2[2] = 50;
        arr2[3] = 10;
        arr2[4] = 44;

        int start = 0;
        int end = arr2.length - 1;
        while (start < end) {
            int temp = arr2[start];
            arr2[start] = arr2[end];
            arr2[end] = temp;

            start++;
            end--;

        }

        for (int num : arr2) {
            System.out.println(num);
        }
    }

}
