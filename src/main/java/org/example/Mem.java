package org.example;

public class Mem{
    int a;
    int b;
    int c;

    public int sumAllNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public int sum(int x){
        int result = 0;
        for (int i = 0; i <= x; i++)
            result += i;
        return result;
    }


}