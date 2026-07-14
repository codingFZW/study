public class ShareCandy {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num={1,0,2};
        System.out.println(sol.candy(num));
    }
}
class Solution {
    public int candy(int[] ratings) {
        int sum=ratings.length;
        int value=0;
        int a=0;
        int b=-1;
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]>ratings[i+1]){
                if(value>0){
                    b=value;
                    value=0;
                    a=0;
                }else{
                    a++;
                    if(a>=b&&b!=-1){
                        sum++;
                    }
                    sum+=a;
                    value=0;
                }
            }else if(ratings[i]==ratings[i+1]){
                value=0;
                b=-1;
                a=0;
            }else{
                value++;
                sum+=value;
            }
        }
        return sum;
    }
}