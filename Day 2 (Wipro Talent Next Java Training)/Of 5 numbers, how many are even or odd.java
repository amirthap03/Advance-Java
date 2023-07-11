import java.io.*;
import java.util.*;
class UserMainCode{
    public static int countEvenNumbers(int input1, int input2, int int count = 0;
        
        if (input6.equals("even")) {
            if (input1 % 2 == 0) count++;
            if (input2 % 2 == 0) count++;
            if (input3 % 2 == 0) count++;
            if (input4 % 2 == 0) count++;
            if (input5 % 2 == 0) count++;
        } else if (input6.equals("odd")) {
            if (input1 % 2 != 0) count++;
            if (input2 % 2 != 0) count++;
            if (input3 % 2 != 0) count++;
            if (input4 % 2 != 0) count++;
            if (input5 % 2 != 0) count++;
        }
        
        return count;
    }
}