package miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Upwork {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,0,-100,1,1,-55,-55,-1,4,5000};
//        int[] arr = {-55,-55,-1,-4,-5000};
//        int[] arr = {0,0,0,0,0,0};
//        int[] arr = {1,2,3};

        System.out.println("upw(arr) = " + upw(arr));
    }

    static int solution(int[] A){
        int baseN =1;
        Arrays.sort(A);
        System.out.println("Arrays.toString() = " + Arrays.toString(A));
        for(int i=0; i<A.length; i++){
            if (A[i] == baseN && A[i] > 0) {
                baseN++;
            }else if(A[i]<1){
             continue;
            }
            System.out.println(i);
        }
        return baseN;
    }


    static int upw(int A[]){
        Arrays.sort(A);
        List<Integer> list = new ArrayList<>();
        Arrays.stream(A).forEach(list::add);
        System.out.println(list);
        int base=1;

        for(int i=0; i<list.size(); i++){
            if(list.contains(base)){
                base++;
            }else{
                return base;
            }
        }
        System.out.println(base);
        return base;
    }

}
