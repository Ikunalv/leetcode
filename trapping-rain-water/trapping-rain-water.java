class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        int[] lMax = new int[height.length];
        int[] rMax = new int[height.length];
        int r = height[height.length-1], l = height[0];
        int maxWaterCount=0;
        //Computing the lMax array
        for (int i = 0; i < lMax.length; i++) {
            lMax[i] = l;
            if (l < height[i]) {
                l = height[i];
            }
        }
        //Computing the rMax array
        for(int i = rMax.length-1; i>=0;i--){
            rMax[i] = r;
            if(r < height[i]){
                r = height[i];
            }
        }
        //Computing the maxWaterCount
        for(int i = 0; i < height.length; i++){
            int water = (Math.min(lMax[i],rMax[i]) - height[i]);
            if(water>0)
                maxWaterCount+=water;
        }
        //System.out.println("height: "+Arrays.toString(height));
        //System.out.println("lMax: "+Arrays.toString(lMax));
        //System.out.println("rMax"+Arrays.toString(rMax));
        return maxWaterCount;
    }
}