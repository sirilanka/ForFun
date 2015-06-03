package handleData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class ReadLine {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readLine(new File("F:/coding.txt"));
	}
	
	/**读每行链接
	 * @param args
	 * @throws IOException 
	 * @return list
	 */
	public static List<String> readLine (File file) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));
		List<String> list = new ArrayList<String>();
		String line = null;
		 
		while((line = br.readLine()) !=null){
			if(!"".equals(line.trim()) ){
//				System.out.println(line.replaceAll(" +", " "));
				list.add(line.replaceAll(" +", " "));
			}
		}
		br.close();
		return list;
	}
}
