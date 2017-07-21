package Offer_55;

import java.util.ArrayList;  
import java.util.*;  
public class Solution2 {
    
    HashMap<Character,Integer> hashMap = new LinkedHashMap<Character,Integer>();
    List<Character> list = new ArrayList<Character>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(hashMap.containsKey(ch)){
            hashMap.put(ch,hashMap.get(ch)+1);
        }else{
            hashMap.put(ch,1);
        }
        list.add(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(int i=0;i<list.size();i++){
            if(hashMap.get(list.get(i)) == 1){
                return list.get(i);
            }
        }
        return '#';
    }
    
    public static void main(String[] args){
        
        
    }
}
