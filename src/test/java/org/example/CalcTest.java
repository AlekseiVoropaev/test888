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

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("summ1")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7, result , "Не тот ответ");

    }
   // @RepeatedTest(7)
    @Test
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    void summ2() {
      Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
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
    @Tag("sub")
    void sub(int a,  int b , int expendedresult) {
        Calc calc = new Calc();
        int result = calc.sub(a,b);
        Assertions.assertEquals(expendedresult, result , "Не тот ответ");
    }

    }