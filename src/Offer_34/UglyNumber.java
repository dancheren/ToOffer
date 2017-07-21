package Offer_34;

public class UglyNumber {
	
	/*
	 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
	 *  习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
	 *  根据丑数的定义，丑数应该是另一个丑数乘以2、3或者5的结果（1除外）。因此我们可以创建一个数组，里面的数字是排好序的丑数。
	 *  里面的每一个丑数是前面的丑数乘以2、3或者5得到的。这种思路的关键在于怎样确保数组里面的丑数是排好序的。
	 *  我们假设数组中已经有若干个丑数，排好序后存在数组中。我们把现有的最大丑数记做M。现在我们来生成下一个丑数，
	 *  该丑数肯定是前面某一个丑数乘以2、3或者5的结果。我们首先考虑把已有的每个丑数乘以2。在乘以2的时候，能得到若干个结果小于或等于M的。
	 *  由于我们是按照顺序生成的，小于或者等于M肯定已经在数组中了，我们不需再次考虑；我们还会得到若干个大于M的结果，
	 *  但我们只需要第一个大于M的结果，因为我们希望丑数是按从小到大顺序生成的，其他更大的结果我们以后再说。
	 *  我们把得到的第一个乘以2后大于M的结果，记为M2。同样我们把已有的每一个丑数乘以3和5，能得到第一个大于M的结果M3和M5。
	 *  那么下一个丑数应该是M2、M3和M5三个数的最小者。其实这里不用把之前所有的丑数都乘以2或者3或者5，例如找M2，
	 *  只需要找到比当前最大丑数大的最小那个数，因此在已有的丑数数组中，找到第一个数的两倍大于2就行，后面的数就不用找，
	 *  也就是不用乘以2；M3和M5是同样的道理.
	 */

	public int getUglyNumber(int index) {
		if (index <= 0)
			return 0;
		int[] pUgly = new int[index];
		pUgly[0] = 1;
		int nextIndex = 1;
		int pUgly2 = 0;
		int pUgly3 = 0;
		int pUgly5 = 0;

		while (nextIndex < index) {
			pUgly[nextIndex] = mins(pUgly[pUgly2] * 2, pUgly[pUgly3] * 3, pUgly[pUgly5] * 5);
			while( pUgly[pUgly2] * 2 <= pUgly[nextIndex]){
				pUgly2++;
			}
			while( pUgly[pUgly3] * 3 <= pUgly[nextIndex]){
				pUgly3++;
			}while( pUgly[pUgly5] * 5 <= pUgly[nextIndex]){
				pUgly5++;
			}
			nextIndex++;
		}
		int ugly = pUgly[nextIndex-1];
		return ugly;
	}
   
	/*
	public int GetUglyNumber_Solution(int index) {  
		   if(index<=0) return 0;  
		    int[] result=new int[index];  
		    result[0]=1;  
		    int begin=1,m2=0,m3=0,m5=0;  
		    while(begin<index){  
		        result[begin]=mins(result[m2]*2,result[m3]*3,result[m5]*5);//大于当前最大丑数的最小数  
		        while((result[m2]*2<=result[begin])){  
		            m2++;  
		        }  
		        while((result[m3]*3<=result[begin])){  
		            m3++;  
		        }  
		        while((result[m5]*5<=result[begin])){  
		            m5++;  
		        }  
		        begin++;  
		    }  
		       return result[index-1];  
		   }  
		   
		   */
	private int mins(int i, int j, int k) {
		int min = (i < j) ? i : j;
		min = (min < k) ? min : k;
		return min;
	}
	
	

	

}
