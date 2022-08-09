// Find numbers with even number digits.
// Given an array of integers, return how many of them contain an even numbers of digits.
// Input: [12, 345, 6, 2, 7896]
// Output: 2


import java.util.*;

public class findNumbersWithEvenDigits {
    public static int countDigits(int num) {
        int digits = 1;
        while(num / 10 >= 1) {
            digits++;
            num = num / 10;
        }
        return digits;
    }

    public static int findEvenNumberDigits(int[] array) {
        int output = 0;
        int size = array.length;
        for(int i = 0; i < size; i++) {
            int digits = countDigits(array[i]);
            if(digits % 2 == 0) {
                output++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int result =  findEvenNumberDigits(array);
        System.out.println(result);
        sc.close();
    }
    
}
