package honeyMoon;

import handleData.ReadLine;
import handleData.WriteToTxt;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HMtext {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String path="D:/测试数据/travals";
		 List<String> text = new ArrayList<String>();
//		  C:\Users\Administrator.WIN7U-20131120F\Desktop\协和合作\分表数据
		  File file=new File(path);
		  File[] tempFile = file.listFiles();
		  System.out.println("该目录下对象个数："+tempFile.length);
		  for (int i = 0; i < tempFile.length; i++) {
		   //合并包含三亚的txt合并到一个
			 if (tempFile[i].isFile()&&tempFile[i].getName().contains("三亚")) {
		    System.out.println("文     件："+tempFile[i]);
//		    System.out.println("文     件："+tempList[i].getName());
		    List<String> temp = ReadLine.readLine(tempFile[i]);
		    text.addAll(temp);
		   }
		   if (tempFile[i].isDirectory()) {
		    System.out.println("文件夹："+tempFile[i]);
		   }
		  }
		  //合并后的文件写入txt
		  String pathWrite = "D:/测试数据/写入文件夹/三亚.txt";
		  WriteToTxt.writeArray(pathWrite, text, "utf-8");
		  
		  

	}

}
