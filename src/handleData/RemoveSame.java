package handleData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class RemoveSame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//去重
	 public static int StringToInt(String str ) {
		String[] goPlace = null;
		List<String> userList = new ArrayList<String>();
		Collections.addAll(userList, goPlace);
		HashSet hs = new HashSet(userList);  
	      
		 Iterator i = hs.iterator();  
	        while(i.hasNext()){  
	               Object temp = i.next();  
	               str = str+"|"+temp.toString();
	        }   
	    System.out.println("【文中提到的地方：】"+str);
		return 0;
	 }
	 
	//string TO int
	 public static int StringToInt(String str, int def) {
        int intRet = def;
        try {
            if (str == null || str.trim().equals(""))
                str = def + "";
            intRet = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return intRet;
    }
}
