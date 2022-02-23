package miscellaneous;

public class UpworkReal {
    public static void main(String[] args) {
        System.out.println("solution(\"Sat\", 23) = " + solution("Mon", -31));
        int[] arr ={10000,9999,9998,10001};
        System.out.println("solution1(arr) = " + solution1(arr));
    }

    static int solution1(int[] A) {
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

    public static String solution(String S, int K) {
        String[] arr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        switch (S) {
            case "Mon":
                K += 0;
                break;
            case "Tue":
                K += 1;
                break;
            case "Wed":
                K += 2;
                break;
            case "Thu":
                K += 3;
                break;
            case "Fri":
                K += 4;
                break;
            case "Sat":
                K += 5;
                break;
            case "Sun":
                K += 6;
                break;
            default:
                K = 0;

        }
        K = K % 7;
        if (K < 0) {
            K = K +7;
        }
        System.out.println(K);
        return arr[K];
    }
}
/*
   String[] arr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        switch (S) {
            case "Mon":
                K += 0;
                break;
            case "Tue":
                K += 1;
                break;
            case "Wed":
                K += 2;
                break;
            case "Thu":
                K += 3;
                break;
            case "Fri":
                K += 4;
                break;
            case "Sat":
                K += 5;
                break;
            case "Sun":
                K += 6;
                break;
            default:
                K = 0;

        }
        K = K % 7;
        if (K < 0) {
            K = K +7;
        }
        return arr[K];

        ('Wed',2)
('Mon',-31)
('Sun',-20)
('Sun',9999)
('Thu',9999)

class Solution {
    int solution(int[] A) {
        int ans = 0;
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
    [-1, 1, -2, 2]
[-10000, 1, -200, 20000]
[-10,-10,-10,-10]
[-10000, 0, -200, 20000]
[-10000, -12000, -12001, 20000]
[2000,20001,1999,999,3000,-1,0]
[10000,9999,9998,10001]
}

 */
