package ru.netology.sqr;

public class SqrService {
    public int calcSqr(int beginning, int end) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= beginning & i * i <= end) {
                result++;
            }
        }
        return result;
    }
}
