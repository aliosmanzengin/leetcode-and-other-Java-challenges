package Easy;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};
        System.out.println("maximumWealth(arr) = " + maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        int []customersSum=new int[accounts.length];
        for(int i=0; i<accounts.length;i++){
            for (int w: accounts[i]) {
                customersSum[i] +=w;
            }
        }
        richest = customersSum[0];
        for (int i = 1; i < customersSum.length; i++) {
            if ( customersSum[i] > richest) {
                richest=customersSum[i];
            }
        }
        return richest;
    }
}
