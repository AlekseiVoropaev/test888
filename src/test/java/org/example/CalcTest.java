package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @BeforeAll // выполняется до всех тестов
    public static void setup() {
        System.out.println("BeforeAll");
    }

    @BeforeEach // выполняется перед каждым тестом
    public  void setupEach(){
        System.out.println("Before Each");
    }

    @AfterAll //выполняется после всех тестов
    public static void afterAll(){
        System.out.println("After All");
    }

    @AfterEach // выполняется после каждого теста
    public  void afterEach(){
        System.out.println("After All");
    }


    @ParameterizedTest(name = " #{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3" , "-1, 2, 1", "0, 0, 0 "})
    @DisplayName("Проверка суммирования 3")
    @Tag("param")
    void summ3(int a,  int b , int expendedresult) {
        Calc calc = new Calc();
        int result = calc.summ(a,b);
        Assertions.assertEquals(expendedresult, result , "Не тот ответ");

    }
    @ParameterizedTest(name = " #{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, -1" , "-1, 2, -3", "0, 0, 0 "})
    @DisplayName("Проверка вычитания")
    @Tag("param")
    void sub(int a,  int b , int expendedresult) {
        Calc calc = new Calc();
        int result = calc.sub(a,b);
        Assertions.assertEquals(expendedresult, result , "Не тот ответ");
    }
}