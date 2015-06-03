package handleData;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToWordCloudJson {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List list = ReadLine.readLine(new File("F:/text/honeyMoon/国家词频.txt"));
//		getNum("哈哈,13888889999");
//		System.out.println(getStr("哈哈,13888889999"));
		System.out.println(toCloudJson(list));
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static String  toCloudJson(List list){
		String json ="[";
		String num = "";
		String word = "";
		Iterator  iterator = list.iterator();
		while (iterator.hasNext()) {
			String str =  iterator.next().toString();
			word = getStr(str);
			num = getNum(str);
			json = json + "{text:\""+word+"\",weight:"+num+"},";
		}
		json = json+"];";
		return json;
		
	}
	
	/**提取字符串中的数字
	 * @param str
	 * @return num
	 */
	public static String  getNum(String str){
		String num = null;
		String phoneString = "哈哈,13888889999";
        // 提取数字
        // 1
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(str);
         num = matcher.replaceAll("");
//        System.out.println( num);
//        // 2
//        Pattern.compile("[^0-9]").matcher(str).replaceAll("");
		
		return num;
		
	}
	
	/**去掉字符串中的数字
	 * @param str
	 * @return num
	 */
	public static String  getStr(String str){
		String word = null;
		String phoneString = "哈哈,13888889999";
        // 提取数字
		Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(str);
       word = matcher.replaceAll("").trim();
		
		return word;
		
	}
	
}
