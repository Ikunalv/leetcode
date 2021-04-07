class Solution {
    
    public int rotatedDigits(int N) {
        HashSet<Integer> valid = new HashSet<>(Arrays.asList(0,1,8));
        HashSet<Integer> good = new HashSet<>(Arrays.asList(2,5,6,9));
        HashSet<Integer> invalid = new HashSet<>(Arrays.asList(3,4,7));
        int isGoodCount = 0;
        for(int i = 0; i <= N; i++)
        {
            if(isGoodNumber(i,valid,good,invalid))
                isGoodCount++;
        }
        return isGoodCount;
    }
    
    public boolean isGoodNumber(int num,HashSet<Integer> valid,HashSet<Integer> good, HashSet<Integer> invalid){ 
        if(num == 0)
            return false;
        boolean isPresent = false;
        boolean isGood = false;
        while(num!=0){
            int r = num % 10;
            if(invalid.contains(r))
                return false;
            if(good.contains(r))
            {
                isPresent = true;
                isGood = true;
                num = num / 10;
                continue;
            }
            if(valid.contains(r)){
                 if(isPresent == true)
                     isGood = true;
                else
                    isGood = false;
            }
            num = num / 10;
        }
        return isGood;
    }
}