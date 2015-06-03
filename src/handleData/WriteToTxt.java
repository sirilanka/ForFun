package handleData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteToTxt {
	/**
	 * @author  徐伟
	 * 功能：list写入.接着之前的写入
	 * @param list path encoding
	 * @return 
	 */
	 public static void writeArray(String path,List<String> content, String encoding)  
	 	throws IOException {  
		 File file = new File(path);  
		
		 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(  
		         new FileOutputStream(file,true), encoding));  
		 for(int i=0;i<content.size();i++){
			 writer.write(content.get(i)); 
			 writer.newLine();
		 }
		   
		 writer.close();  
	 }  
	
	 public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
		 List<String> list = new ArrayList<String>();
		 list.add("我试试能不能写哈");
			String path="C:/Users/Administrator.WIN7U-20131120F/Desktop/协和合作/分表数据/你好.txt";
//			  C:\Users\Administrator.WIN7U-20131120F\Desktop\协和合作\分表数据
			writeArray(path,list,"utf-8");
		}
}
