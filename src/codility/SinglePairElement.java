package codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
 */
public class SinglePairElement {
    public static void main(String[] args) {
        int []arr ={2,2,3,2,2,2,3,2,2,2,2,2,5};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        System.out.println("Arrays.toString(A) = " + Arrays.toString(A));
        for (int i = 0; i < A.length-1; i+=2) {
            if (!(A[i] == A[i+1])) {
                return A[i];
            }
        }

//        for (int i = 0; i < A.length-1; i++) {
//            for (int j = A.length-1; j > i; j--) {
//                if ((A[i] == A[j]) && (A[i]>0)) {
//                    System.out.println("i="+A[i] + " J="+A[j]);
//                    A[i] = -1;
//                    A[j] = -1;
//                }
//            }
//        }
//
//        System.out.println("Arrays.toString(A) = " + Arrays.toString(A));
//        for (int j : A) {
//            if (j > 0) {
//                return j;
//            }
//        }
        return A[A.length-1];
    }


}
