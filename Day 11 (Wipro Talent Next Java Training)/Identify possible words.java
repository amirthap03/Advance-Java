import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public String identifyPossibleWords(String input1,String input2){
		// Read only region end
		// Write code here...
		String  st  [] = input2.split(":");
        String str = "";
        for ( int i = 0; i < st.length; i++){

            if (st[i].length()!= input1.length())
              continue;
            String test = input1;
            int x = test.indexOf('_');
            char ch = st[i].charAt(x);
            test = test.replace('_',ch);
            test = test.toUpperCase();
            st[i] = st[i].toUpperCase();
            if (st[i].equals(test)){
                if(str ==""){
                    str = str+test;
                  }
                  else{
                      str= str+":"+ test;
                      }
                }
            }
            if (str =="")
              str = "ERROR-009";
            return str;
    }
}