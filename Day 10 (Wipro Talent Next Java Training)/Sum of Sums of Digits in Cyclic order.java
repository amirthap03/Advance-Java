import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int sumOfSumsOfDigits(int input1){
		// Read only region end
		// Write code here...
		String str = Integer.toString(input1);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int num = Character.getNumericValue(str.charAt(j));
                sum += num;
            }
        }

        return sum;
    }
}