package handleData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 
 
 
public class WordCount {
    public static void main(String[] args) throws IOException{
    	String pathIn = "F:/text/表现症状_药物.txt";
    	count(new File(pathIn));
    }
    
    /**对指定txt文件进行词频统计，并按照降序输入
     * @param file  pathOut
     * @throws IOException 
     */
    public static void count(File file) throws IOException{
    
    	List<String> list1 = new ArrayList<String>();
    	BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));
		List<String> list = new ArrayList<String>();
		String line = null;
		int i = 0;
		while((line = br.readLine()) !=null){
			i++;
			list.add(line);
		}
		br.close();
		
		StringBuffer buf = new StringBuffer(); 
		for(int m=0,j=list.size();m<j;m++){
			buf= buf.append(list.get(m)+" ");
			
		}
		String wordsinput = buf.toString().replaceAll(" +", " ");; 
//		System.out.println(buf);
		
//        String wordsinput =  "大连飞上海 三亚凤凰机场 三亚珠江花园酒店 上海 大东海 大连到三亚 天涯海角 海南特产 蜈支洲岛 三亚";
        HashMap<String, Integer> wordMap = new  HashMap<String, Integer>();
        String[] words = wordsinput.split("、");
        for(int j = 0; j < words.length ; j++){
            if(!wordMap.containsKey(words[j])){
                wordMap.put(words[j], 1);
            }else{
                int val = wordMap.get(words[j]);
                wordMap.put(words[j],val + 1);
            }
        }
        if (wordMap.containsKey("美茹岛")){
        	int val = wordMap.get("美茹岛");
//        	System.out.println(val);
        }
//     
        List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>( 
                wordMap.entrySet()); 
        Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() { 
            public int compare(Map.Entry<String, Integer> o1, 
                    Map.Entry<String, Integer> o2) { 
                return ( o2.getValue()-o1.getValue()); 
            } 
        });
        for (int j = 0; j < infoIds.size(); j++) { 
            Entry<String,Integer> ent=infoIds.get(j); 
            System.out.println(ent.getKey()+" "+ent.getValue());
            list1.add(ent.getKey()+" "+ent.getValue());
               
        } 
        String fileName = file.getName().replace(".txt", "-词频.txt");
        System.out.println(fileName);
       String filePath = "C:/Users/Administrator.WIN7U-20131120F/Desktop/协和合作/统计后/"+fileName;
       System.out.println(filePath);
        WriteToTxt.writeArray(filePath, list1, "utf-8");
    }
 
}
