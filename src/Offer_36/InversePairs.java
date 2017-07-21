package Offer_36;
/*
 * �������е������
 *   �������е������������ǰ��һ�����ִ��ں���һ�����֣����������������һ������ԡ�
 *   ����˼·��  ���Կռ任ȡʱ����㷨��
 *      �Ȱ�����ָ�������飬��ͳ���������ڵ�����Ը�����Ȼ����ͳ������������֮�������Ը�����
 *      ��ͳ����������������Թ����У���Ҫ��������������򣬴��������������һ��Ԫ�ظ��ұ��������ĩβԪ�ؿ�ʼ�Ƚϣ�
 *      ������ĩβ���ֱ��ұ�ĩβ����Ҫ����ô���ĩβ���ֻ���ұ��������ֶ�����Ϊ�ұ������Ѿ��ź���
 *      ��ʱ�����ĩλ���ִ��뵽��ʱ�����ĩβ���������������ĩβָ����ǰ�ƶ�һλ���ٴθ��ұ�ĩβ���ֽ��бȽϣ�
 *      ������ĩλ����С���ұ�ĩλ���֣���˵������������ԣ��ұ�ĩβָ����ǰ�ƶ������ұ�ĩλ���ִ��뵽��ʱ�����С�ֱ���������ֱȽ����.
 *      ʱ�临�Ӷ�Ϊnlogn���ȳ���ⷨ n^2��
 */

public class InversePairs {

	public int inversePairs(int[] array, int len) {
		if(array == null)
			return 0;
		int[] temp = new int[len];     //�Կռ任ȡʱ����㷨
		System.arraycopy(array, 0, temp, 0, len);    //������array���Ƶ���ʱ����temp��
		int count = iPairs(array,temp,0,len -1);
		return count;
	}
     /**
      * 
      * @param array   �����ҵ�����
      * @param temp    �洢�ȽϺ�����ֵ���ʱ����
      * @param start   �Ƚϵĳ�ʼλ��
      * @param end     �Ƚϵ�ĩβλ��
      * @return        �������е�������
      */
	private int iPairs(int[] array, int[] temp, int start, int end) {
		if(start == end)
			return 0;
		int mid = (start + end) / 2;    //������ָ��������
		int left = iPairs(array,temp,start,mid);     //�����������ݹ���зָ�
		int right = iPairs(array,temp,mid+1,end);    //���ұ�������ݹ���зָ�
		//�鲢
        int i = mid;
        int j = end;
        int pos = end;
        int counts = 0;
        while(i>=start && j>=mid+1){
        	if(array[i] > array[j]){
        		counts += j-mid;      //ͳ���������Ŀ
        		temp[pos--] = array[i--];   //�ƶ�ָ��
        	}else{
        		temp[pos--] = array[j--];    //�ƶ�ָ��
        	}
        }

        while(i>=start){
        	temp[pos--] = array[i--];     //�����ʣ������ִ�ŵ���ʱ������
        }
        while(j>=mid+1){
        	temp[pos--] = array[j--];     //���ұ�ʣ������ִ�ŵ���ʱ������
        }
        
		return counts+ left + right;     //���������������е�������Լ��������������������Ŀ
	}
	
	
	

	
	/*
	public static int iPairs(int[] array) {
        if (array == null)
            throw new IllegalArgumentException();
        // ������������
        int length = array.length;
        int[] copy = new int[length];
        System.arraycopy(array, 0, copy, 0, length);
        int numberOfInversePairs = iPairs(array, copy, 0, length - 1);
        return numberOfInversePairs;
    }

    /**
     * @author Thanos
     * @param array δ�鲢���� 
     * @param copy ���ڴ洢�鲢�����ݵ�����
     * @param begin ��ʼλ��
     * @param end ����λ��
     * @return ������
     *
    public static int iPairs(int[] array, int[] copy, int begin, int end) {
        if(begin == end)
            return 0;
        int mid = (begin + end) / 2;
        // �ݹ����
        int left = iPairs(copy, array, begin, mid);
        int right = iPairs(copy, array, mid + 1, end);
        // �鲢
        int i = mid, j = end, pos = end;
        int count = 0; // ��¼�����������������
        
        while(i >= begin && j >= mid + 1)
        {
            if(array[i] > array[j]) {
                copy[pos--] = array[i--];
                count += j - mid;
            } else
                copy[pos--] = array[j--];
        }
        
        while(i >= begin)
            copy[pos--] = array[i--];
        while(j >= mid + 1)
            copy[pos--] = array[j--];
        
        return left + right + count;
    }
    */
}
