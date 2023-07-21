import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int sumOfPowerOfDigits(int input1){
		// Read only region end
		// Write code here...
		double sum = 0.0;
        String str = Integer.toString(input1);
        for (int i = 0; i < str.length() -1; i++) {
            int a = Character.getNumericValue(str.charAt(i));
            int b = Character.getNumericValue(str.charAt(i + 1));
            sum = sum + Math.pow(a,b);
        }
        return (int) sum + 1;
    }
}