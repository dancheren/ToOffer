package test1_StringBuffer;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		// char c;
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// System.out.println("请输入，以q结束：");
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
	    // 构建FileOutputStream对象,文件不存在会自动新建
	    
	    OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
	    // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
	    
	    writer.append("中文输入");
	    // 写入到缓冲区
	    
	    writer.append("\r\n");
	    //换行
	    
	    writer.append("English");
	    // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
	    
	    writer.close();
	    //关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
	    
	    fop.close();
	    // 关闭输出流,释放系统资源
	 
	    FileInputStream fip = new FileInputStream(f);
	    // 构建FileInputStream对象
	    
	    InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
	    // 构建InputStreamReader对象,编码与写入相同
	 
	    StringBuffer sb = new StringBuffer();
	    while (reader.ready()) {
	      sb.append((char) reader.read());
	      // 转成char加到StringBuffer对象中
	    }
	    System.out.println(sb.toString());
	    reader.close();
	    // 关闭读取流
	    
	    fip.close();
	    // 关闭输入流,释放系统资源
	    
	    
	     //FileWriter、FileReader
	    File file = new File("Hello1.txt");
	      // 创建文件
	      file.createNewFile();
	      // creates a FileWriter Object
	      FileWriter writers = new FileWriter(file); 
	      // 向文件写入内容
	      writers.write("This\n is\n an\n example\n"); 
	      writers.flush();
	      writers.close();
	      // 创建 FileReader 对象
	      FileReader fr = new FileReader(file); 
	      char [] a = new char[50];
	      fr.read(a); // 读取数组中的内容
	      for(char c : a)
	          System.out.print(c); // 一个一个打印字符
	      fr.close();
	      
	      
	      //mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。
	      //失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
	      String str = "g:/home/usr/tmp";
	      File d = new File(str);
	      d.mkdirs();
	}
}
