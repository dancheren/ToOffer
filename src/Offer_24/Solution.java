package Offer_24;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length ==0)
            return false;
        boolean result = help(sequence,0,sequence.length-1);
        if(result)
            System.out.println("Yes");
        else
        System.out.println("No");

        return result;
    }
    public boolean help(int[] sequence,int start,int end){
        if(sequence == null || start > end)
            return false;
        int last = sequence[end];
        int i=start;
        for(;i<end;i++){
            if(sequence[i]>last)
                 break;
        }
        int j=i;
        for(;j<end;j++){
            if(sequence[j]<last)
                return false;
        }
        boolean left = true;
        if(i>start)
           left = help(sequence,start,i-1);
        boolean right = true;
        if(i<end)
            right = help(sequence,i,end-1);
        return (left && right);
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] sequence = {4,8,6,12,16,14,10};
		boolean result = s.VerifySquenceOfBST(sequence);
		System.out.println(result);
	}
}
