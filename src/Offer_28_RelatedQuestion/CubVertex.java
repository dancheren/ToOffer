package Offer_28_RelatedQuestion;


/*
 * ��ָoffer�ϵ�ȫ���������Ŀ��

	    ����һ������8�����ֵ����飬�ж���ô�п��ܰ���8�����ֱַ�ŵ��������8�������ϣ�ʹ����������������Ե����ϵ�4������ĺ���ȡ�
	
	    ˼·���൱�����8�����ֵ�ȫ���У��ж���û��һ�����з�����Ŀ����������������������϶���ĺ���ȡ� 
 */
public class CubVertex {
	public boolean cubVertex(int[] arr, int start,int end) {
		if (arr.length != 8 || arr == null) {
			return false;
		}
		boolean result = false;
		if (start == end) {
			if (arr[0] + arr[1] + arr[2] + arr[3] == arr[4] + arr[5] + arr[6] + arr[7]
					&& arr[0] + arr[2] + arr[4] + arr[6] == arr[1] + arr[3] + arr[5] + arr[7]
					&& arr[0] + arr[1] + arr[4] + arr[5] == arr[2] + arr[3] + arr[6] + arr[7]) {
				for (int i = 0; i < arr.length; i++) {
					
					System.out.print(arr[i] +" ");
					
				}
				System.out.println("");
				result = true;
				//return true;
			}
		} else {
			for (int i = start; i <= end; i++) {
				int temp = arr[i];
				arr[i] = arr[start];
				arr[start] = temp;
				result = cubVertex(arr, start+1, end);
				if (result){
					break;
				}
				temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
			}
		}
		return result;
	}
}
