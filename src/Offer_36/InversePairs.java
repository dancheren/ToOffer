package Offer_36;
/*
 * 求数组中的逆序对
 *   在数组中的两个数字如果前面一个数字大于后面一个数字，则这两个数字组成一个逆序对。
 *   解题思路：  （以空间换取时间的算法）
 *      先把数组分割成子数组，先统计子数组内的逆序对个数，然后在统计相邻子数组之间的逆序对个数。
 *      在统计相邻子数组逆序对过程中，需要对子数组进行排序，从左边子数组的左后一个元素跟右边子数组的末尾元素开始比较，
 *      如果左边末尾数字比右边末尾数字要大，那么左边末尾数字会比右边所有数字都大，因为右边数组已经排好序，
 *      此时把左边末位数字存入到临时数组的末尾处，将左边子数组末尾指针向前移动一位，再次跟右边末尾数字进行比较；
 *      如果左边末位数字小于右边末位数字，则说明不存在逆序对，右边末尾指针向前移动，将右边末位数字存入到临时数组中。直到所有数字比较完成.
 *      时间复杂度为nlogn，比常规解法 n^2快
 */

public class InversePairs {

	public int inversePairs(int[] array, int len) {
		if(array == null)
			return 0;
		int[] temp = new int[len];     //以空间换取时间的算法
		System.arraycopy(array, 0, temp, 0, len);    //将数组array复制到临时数组temp中
		int count = iPairs(array,temp,0,len -1);
		return count;
	}
     /**
      * 
      * @param array   待查找的数组
      * @param temp    存储比较后的数字的临时数组
      * @param start   比较的初始位置
      * @param end     比较的末尾位置
      * @return        返回所有的逆序数
      */
	private int iPairs(int[] array, int[] temp, int start, int end) {
		if(start == end)
			return 0;
		int mid = (start + end) / 2;    //将数组分割成子数组
		int left = iPairs(array,temp,start,mid);     //对左边子数组递归进行分割
		int right = iPairs(array,temp,mid+1,end);    //对右边子数组递归进行分割
		//归并
        int i = mid;
        int j = end;
        int pos = end;
        int counts = 0;
        while(i>=start && j>=mid+1){
        	if(array[i] > array[j]){
        		counts += j-mid;      //统计逆序对数目
        		temp[pos--] = array[i--];   //移动指针
        	}else{
        		temp[pos--] = array[j--];    //移动指针
        	}
        }

        while(i>=start){
        	temp[pos--] = array[i--];     //将左边剩余的数字存放到临时数组中
        }
        while(j>=mid+1){
        	temp[pos--] = array[j--];     //将右边剩余的数字存放到临时数组中
        }
        
		return counts+ left + right;     //返回左右子数组中的逆序对以及相邻子数组间的逆序对数目
	}
	
	
	

	
	/*
	public static int iPairs(int[] array) {
        if (array == null)
            throw new IllegalArgumentException();
        // 创建辅助数组
        int length = array.length;
        int[] copy = new int[length];
        System.arraycopy(array, 0, copy, 0, length);
        int numberOfInversePairs = iPairs(array, copy, 0, length - 1);
        return numberOfInversePairs;
    }

    /**
     * @author Thanos
     * @param array 未归并数组 
     * @param copy 用于存储归并后数据的数组
     * @param begin 起始位置
     * @param end 结束位置
     * @return 逆序数
     *
    public static int iPairs(int[] array, int[] copy, int begin, int end) {
        if(begin == end)
            return 0;
        int mid = (begin + end) / 2;
        // 递归调用
        int left = iPairs(copy, array, begin, mid);
        int right = iPairs(copy, array, mid + 1, end);
        // 归并
        int i = mid, j = end, pos = end;
        int count = 0; // 记录相邻子数组间逆序数
        
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
