package Offer_45;

import java.util.List;
import java.util.ArrayList;

public class LastRemaining {

	public static void main(String[] args) {
        lastRemaining(5, 3);
	}

	public static void lastRemaining(int n, int m) {
		if (n < 1 || m < 1)
			return;
		int k = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		while (list.size() > 1) {
			k = k + m;
			k = (k % (list.size())) - 1;
			if(k < 0){
				System.out.println(list.get( list.size()-1));
				list.remove(list.size()-1);
				k = 0;
			}else{
				list.remove(k);
			}
		}

	}

}
