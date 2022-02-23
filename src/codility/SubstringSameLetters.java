package codility;

public class SubstringSameLetters {
    public static void main(String[] args) {
        String s = "abcdabcdabcd";
        System.out.println("solution(s) = " + solution(s));
    }

    public static String solution(String S){
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < S.length()-1; i++) {
            for (int j = S.length()-1; j >j; j--) {
                if (S.charAt(i) == S.charAt(j)) {
                    sb.delete(i,j);
                }
            }

        }
        System.out.println(sb);
        return sb.toString();
    }
}
