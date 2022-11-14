package ru.netology.sqr;

public class SQRService {
    public int calcNumeric(int begin, int end) {
        int kol = 0;

        if (begin >= end) {
            kol = -1;
        } else {
            for (int i = 10; i < 100; i++) {
                if ((Math.pow(i, 2) >= begin) && (Math.pow(i, 2) <= end)) {
                    kol++;
                }
            }
        }
        return kol;
    }
}
