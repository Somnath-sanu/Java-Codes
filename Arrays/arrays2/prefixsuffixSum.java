package Arrays.arrays2;

public class prefixsuffixSum {
    static int totalSum(int[]a){
        int total = 0 ; 
        for(int i = 0 ; i < a.length; i++){
            total += a[i];
        }

        return total;
    }

    static boolean equalSumPartition(int[]a){
        int total = totalSum(a);
        int prefSum = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            prefSum += a[i];
            int suffixSum= total  - prefSum;
            if(prefSum == suffixSum) return true;
            
        }

        return false;
    }
    public static void main(String[] args) {
        int[]a = {15,5,6,4,8,2};
        int[]b = {1,3,2,4,5};
        System.out.println(equalSumPartition(a));
    }
}
