class Solution {
    public int kthGrammar(int N, int K) {
        if( N == 1 && K == 1)
            return 0;
        int middle = (int)Math.pow(2,N-1) / 2;
        if(K<=middle)
            return kthGrammar(N-1,K);
        else
            return (kthGrammar(N-1,K - middle)^1);
            
    }
}