package test1_StringBuffer;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		// char c;
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// System.out.println("�����룬��q������");
		// c = (char) br.read();
		// while(c != 'q'){
		// System.out.println(c);
		// c = (char) br.read();
		//
		// }
		
		/*
		try{
		char[] chars = { '3', '2', '6', '8', '0' };
		FileOutputStream fo = new FileOutputStream("f:/t.txt");
		int size1 = chars.length;
		for (int i = 0; i < size1; i++) {
			fo.write(chars[i]);
		}
		fo.close();
		FileInputStream fi = new FileInputStream("f:/t.txt");
		int size2 = fi.available();
		for(int i=0;i<size2;i++){
			System.out.println((char)fi.read()+" ");
		}
		fi.close();
	  }catch(IOException e){
		  System.out.println("Exception");
	  }
	  */
		
		
		File f = new File("a.txt");
	    FileOutputStream fop = new FileOutputStream(f);
	    // ����FileOutputStream����,�ļ������ڻ��Զ��½�
	    
	    OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
	    // ����OutputStreamWriter����,��������ָ������,Ĭ��Ϊ����ϵͳĬ�ϱ���,windows����gbk
	    
	    writer.append("��������");
	    // д�뵽������
	    
	    writer.append("\r\n");
	    //����
	    
	    writer.append("English");
	    // ˢ�»����,д�뵽�ļ�,��������Ѿ�û��д���������,ֱ��closeҲ��д��
	    
	    writer.close();
	    //�ر�д����,ͬʱ��ѻ���������д���ļ�,���������ע�͵�
	    
	    fop.close();
	    // �ر������,�ͷ�ϵͳ��Դ
	 
	    FileInputStream fip = new FileInputStream(f);
	    // ����FileInputStream����
	    
	    InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
	    // ����InputStreamReader����,������д����ͬ
	 
	    StringBuffer sb = new StringBuffer();
	    while (reader.ready()) {
	      sb.append((char) reader.read());
	      // ת��char�ӵ�StringBuffer������
	    }
	    System.out.println(sb.toString());
	    reader.close();
	    // �رն�ȡ��
	    
	    fip.close();
	    // �ر�������,�ͷ�ϵͳ��Դ
	    
	    
	     //FileWriter��FileReader
	    File file = new File("Hello1.txt");
	      // �����ļ�
	      file.createNewFile();
	      // creates a FileWriter Object
	      FileWriter writers = new FileWriter(file); 
	      // ���ļ�д������
	      writers.write("This\n is\n an\n example\n"); 
	      writers.flush();
	      writers.close();
	      // ���� FileReader ����
	      FileReader fr = new FileReader(file); 
	      char [] a = new char[50];
	      fr.read(a); // ��ȡ�����е�����
	      for(char c : a)
	          System.out.print(c); // һ��һ����ӡ�ַ�
	      fr.close();
	      
	      
	      //mkdir( )��������һ���ļ��У��ɹ��򷵻�true��ʧ���򷵻�false��
	      //ʧ�ܱ���File����ָ����·���Ѿ����ڣ�������������·���������ڣ����ļ��в��ܱ�������
	      String str = "g:/home/usr/tmp";
	      File d = new File(str);
	      d.mkdirs();
	}
}
