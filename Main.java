public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] h={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(sol.trap(h));
    }

}
class Solution {
    public int trap(int[] height) {
        int maxOne=0;
        int maxvalue=0;
        int sumwater=0;
        int sumvalue=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>=height[maxOne]){
                sumwater+=height[maxOne]*(i-maxOne)-sumvalue;
                maxOne=i;
                sumvalue=0;
            }
            sumvalue+=height[i];
        }
        maxvalue=height[maxOne];
        maxOne=height.length-1;
        sumvalue=0;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>=height[maxOne]){
                sumwater+=height[maxOne]*(maxOne-i)-sumvalue;
                maxOne=i;
                sumvalue=0;
                if(maxvalue==height[i]){
                    break;
                }
            }
            sumvalue+=height[i];
        }
        return sumwater;
    }
}