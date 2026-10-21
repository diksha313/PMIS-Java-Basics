class Solution {
    public int distributeCandies(int[] candyType) {
       Set<Integer> uniqueTypes = new HashSet<>(); 
        for (int i = 0; i < candyType.length; i++) {
        uniqueTypes.add(candyType[i]);
        }
        int maxCandies=candyType.length/2;
        if(maxCandies>uniqueTypes.size()){
            return uniqueTypes.size();
        }else{
            return maxCandies;
        }
    }
}