class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal=0;
        int bobTotal=0;
        int diff;
        for(int i = 0;i<aliceSizes.length;i++){
            aliceTotal=aliceTotal + aliceSizes[i];
        }
        for(int i = 0;i<bobSizes.length;i++){
            bobTotal=bobTotal + bobSizes[i];
        }
            diff =(bobTotal - aliceTotal)/2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {

                if (bobSizes[j] - aliceSizes[i] == diff) {
                    return new int[] {aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[] {};
    }
}