package honeyMoon;

import java.io.File;

public class ReadFile {

	/**
	 * @param args
	 */
	
	 public static void main(String[] args) {
	  String path="D:/测试数据/travals";
//	  C:\Users\Administrator.WIN7U-20131120F\Desktop\协和合作\分表数据
	  File file=new File(path);
	  File[] tempList = file.listFiles();
	  System.out.println("该目录下对象个数："+tempList.length);
	  for (int i = 0; i < tempList.length; i++) {
	   if (tempList[i].isFile()&&tempList[i].getName().contains("三亚")) {
	    System.out.println("文     件："+tempList[i]);
//	    System.out.println("文     件："+tempList[i].getName());
	   }
	   if (tempList[i].isDirectory()) {
	    System.out.println("文件夹："+tempList[i]);
	   }
	  }
	 }
	
}
