class Solution {
    public int largestAltitude(int[] gain) {
        int highestGain = 0,Gain=0;
        int n = gain.length;
        for(int i=0; i<n; i++){
            Gain+=gain[i];   
            if(Gain>0 && Gain > highestGain){
                highestGain=Gain;
            }
        }
            
        return highestGain;
    }
}