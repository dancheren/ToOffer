package Offer_34;

public class UglyNumber {
	
	/*
	 * ��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7��
	 *  ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
	 *  ���ݳ����Ķ��壬����Ӧ������һ����������2��3����5�Ľ����1���⣩��������ǿ��Դ���һ�����飬������������ź���ĳ�����
	 *  �����ÿһ��������ǰ��ĳ�������2��3����5�õ��ġ�����˼·�Ĺؼ���������ȷ����������ĳ������ź���ġ�
	 *  ���Ǽ����������Ѿ������ɸ��������ź������������С����ǰ����е�����������M������������������һ��������
	 *  �ó����϶���ǰ��ĳһ����������2��3����5�Ľ�����������ȿ��ǰ����е�ÿ����������2���ڳ���2��ʱ���ܵõ����ɸ����С�ڻ����M�ġ�
	 *  ���������ǰ���˳�����ɵģ�С�ڻ��ߵ���M�϶��Ѿ����������ˣ����ǲ����ٴο��ǣ����ǻ���õ����ɸ�����M�Ľ����
	 *  ������ֻ��Ҫ��һ������M�Ľ������Ϊ����ϣ�������ǰ���С����˳�����ɵģ���������Ľ�������Ժ���˵��
	 *  ���ǰѵõ��ĵ�һ������2�����M�Ľ������ΪM2��ͬ�����ǰ����е�ÿһ����������3��5���ܵõ���һ������M�Ľ��M3��M5��
	 *  ��ô��һ������Ӧ����M2��M3��M5����������С�ߡ���ʵ���ﲻ�ð�֮ǰ���еĳ���������2����3����5��������M2��
	 *  ֻ��Ҫ�ҵ��ȵ�ǰ�����������С�Ǹ�������������еĳ��������У��ҵ���һ��������������2���У���������Ͳ����ң�
	 *  Ҳ���ǲ��ó���2��M3��M5��ͬ���ĵ���.
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
		        result[begin]=mins(result[m2]*2,result[m3]*3,result[m5]*5);//���ڵ�ǰ����������С��  
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
