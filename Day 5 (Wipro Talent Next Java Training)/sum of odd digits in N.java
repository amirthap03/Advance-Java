import java.io.*;
import java.util.*;
// Read only region start class UserMainCode
{
public int OddDigitsSum(int input1){
    int sum = 0;
        while (input1 > 0) {
            int digit = input1 % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            input1 /= 10;
        }
        return sum;
    }
}