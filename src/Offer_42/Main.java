package Offer_42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	//static ArrayList<List<Integer>> l = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			sum(1,m,n,list);
//            for(List<Integer> la : l){
//                int size = la.size();
//                for(int i=0;i<size;i++){
//                    System.out.print(la.get(i)+ " ") ;
//                    System.out.println("");
//                }
//            }
		}
	}
	
	public static void sum(int start,int m,int n,List<Integer> list){
		if(start < 0)
			return ;
		if(m == 0){
//			l.add(list);
            int size = list.size();
			for(int i=0;i < size-1;i++){    //注意输出格式，牛客网中不允许输出最后有空格
				System.out.print(list.get(i)+" ");
			}
            System.out.print(list.get(size-1));
			System.out.println("");
		}else{
			for(int i=start;i<=m && i<=n;i++){
				list.add(i);
				sum(i+1,m-i,n,list);
				list.remove(list.size()-1);
			}
		}
	}

}
