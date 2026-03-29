package March;
class Solution {

    private boolean isPossible(int [] piles , int h , int maxBanana){
        int banana=1;

        for(int i=0 ; i<piles.length ; i++){
            if(piles[i]+banana<=maxBanana){
                banana++;
            }
        }
    return false;    
    }


    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int start=1;
        int end=piles[piles.length-1]-piles[0];

        int ans=0;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(isPossible(piles , h , mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    return ans;    
    }
}