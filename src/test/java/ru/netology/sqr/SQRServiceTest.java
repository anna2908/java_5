package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200, 300, 3",  //внутри диапазона
            "100, 9801, 90", //весь диапазон
            "0, 99, 0",  //вне диапазона слева
            "9802, 10000, 0",  //вне диапазона справа
            "200, 200, -1",  //невалидные данные
            "300, 200, -1"   //невалидные данные
    })
    void calculateForInterval(int begin, int end, int expected) {
        SQRService service = new SQRService();

        int actual = service.calcNumeric(begin, end);
        Assertions.assertEquals(expected, actual);
    }
}