package Offer_53;
/*
��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ���
��'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� �ڱ����У�ƥ����ָ�ַ�����������
��ƥ������ģʽ�����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
������
�ݹ�ʵ��
ÿ�ηֱ���str ��pattern��ȡһ���ַ�����ƥ�䣬���ƥ�䣬��ƥ����һ���ַ������򣬷��ز�ƥ�䡣
��ƥ��ݹ麯�� match(str, pattern)��
���ģʽƥ���ַ�����һ���ַ��ǡ�*��:
	���pttern��ǰ�ַ���str�ĵ�ǰ�ַ�ƥ�䣬�����������ֿ������
	��1��pttern��ǰ�ַ���ƥ�� str �е� 0 ���ַ���match(str, pattern+2)
	��2��pttern��ǰ�ַ���ƥ�� str �е� 1 ���ַ���match(str+1, pattern+2)
	��3��pttern��ǰ�ַ���ƥ�� str �е� �� ���ַ���match(str+1, pattern)
	���pttern��ǰ�ַ��ͺ�str�ĵ�ǰ�ַ���ƥ��
	   pttern��ǰ�ַ���ƥ�� str �е� 0 ���ַ���(str, pattern+2)
���ģʽƥ���ַ�����һ���ַ����ǡ�*�����������ַ�ƥ�䡣
           ���� ��.�� ������Ƚϼ򵥣���.�� ��һ���ַ�ƥ�� match(str+1, pattern+1)
������Ҫע����ǣ����ַ������� �� ��.*�� ��ƥ���

*/
public class Match {

	public static void main(String[] args) {
       char[] str1 = {};
       char[] str2 = {'.','*'};
       System.out.println(match(str1,str2));
	}

	  public static boolean match(char[] str, char[] pattern)  
	    {  
	              if(str==null||pattern==null) return false;  
	          
	        return matchCore(str,0,pattern,0);  
	    }  
	      
	    public static boolean matchCore(char[] str,int s, char[] pattern,int p) {  
	        if(str.length<=s&&pattern.length<=p)  
	            return true;//��ƥ������  
	        if(str.length>s&&pattern.length<=p)  
	            return false;//ģʽ���ˣ��ַ�������  
	        //ģʽ��a*aû������ƥ�䴮�ɽ����ɲ�����  
	          
	        if(p+1<pattern.length&&pattern[p+1]=='*'){//��ǰpattern����һ����*��ʱ  
	              
	            //�ַ�������  
	            if(s>=str.length) return matchCore(str, s, pattern, p+2);  
	            else{  
	              
	            if(pattern[p]==str[s]||pattern[p]=='.'){  
	                //��ǰλ��ƥ����ɣ��ƶ�����һ��ģʽ��  
	                return matchCore(str,s+1, pattern,p+2)  
	                        ||matchCore(str,s+1, pattern,p)  
	                        ||matchCore(str,s, pattern,p+2);  
	            }else  
	                return matchCore(str, s, pattern, p+2);  
	            }  
	        }  
	        //��ǰpattern����һ������*ʱ��  
	        if(s>=str.length) return false;  
	        else{  
	        if(str[s]==pattern[p]||pattern[p]=='.')  
	            return matchCore(str, s+1, pattern, p+1);  
	        }  
	        return false;  
	    }  
	
	
}
