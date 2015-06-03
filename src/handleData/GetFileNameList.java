package handleData;

import java.io.File;
import java.io.IOException;

public class GetFileNameList {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="F:/text/hotweibo_content";
//		  C:\Users\Administrator.WIN7U-20131120F\Desktop\协和合作\分表数据
		  getFileList(path);
	}
	 
	/**获取指定文件夹下面所有的文件的名称和路径
	 * @param filename
	 * @return File[]
	 * @throws IOException 
	 */
	public static File[] getFileList(String path) throws IOException{
		
		File file=new File(path);
		  File[] tempList = file.listFiles();
		  System.out.println("该目录下对象个数："+tempList.length);
		  for (int i = 0; i < tempList.length; i++) {
		   if (tempList[i].isFile()) {
		    System.out.println("文     件："+tempList[i]);
		    WordCount.count(tempList[i]);
		   }
		   if (tempList[i].isDirectory()) {
		    System.out.println("文件夹："+tempList[i].getAbsolutePath());
		    getFileList(tempList[i].getAbsolutePath());
		   }
		  }
		 
		
		
		return tempList;
		
	}
}
