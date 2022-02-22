package miscellaneous;

import java.util.Arrays;

public class CyclicRotationArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Arrays.toString(solution(arr,2)) = " + Arrays.toString(solution(arr, 1)));

    }

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] arr = A.clone();
        if (K == A.length) {
            return A;
        }

        for(int i=0; i<K; i++){
            int lastEl = arr[arr.length-1];
            for (int j = arr.length-2; j >=0 ; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = lastEl;
            System.out.println(Arrays.toString(arr));

        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(A));
        return arr;
    }

}

