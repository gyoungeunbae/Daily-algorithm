package leetcode;

import java.util.Scanner;

class Solution {
    public static int numberOfSteps (int num) {
        int steps = 0;        
        while (num > 0) {
            if (num%2 != 0) {
                num = num-1;
                steps++;
            } else {
                steps++;
                num = num/2;   
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int result = numberOfSteps(input);
        System.out.println(result);
    }

}
