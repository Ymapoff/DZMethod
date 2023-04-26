package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void CountAllSale() {
        StatsService service = new StatsService(); // сумма всех продаж+
        int[] AllSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expentedSale = 180;
        int actualSale = service.allSale(AllSale);

        Assertions.assertEquals(expentedSale, actualSale);
    }

    @Test
    public void CountAverageSum() {
        StatsService service = new StatsService();  // средняя сумма продаж+
        int[] averageSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expentedSum = 15;
        int actualSum = service.averageSum(averageSum);

        Assertions.assertEquals(expentedSum, actualSum);

    }

    @Test
    public void CountMaxMonthSales() {
        StatsService service = new StatsService();  // макс продаж
        long[] MaxMonthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expentedMax = 8;
        long actualMax = service.maxMonthSales(MaxMonthSales);

        Assertions.assertEquals(expentedMax, actualMax);

    }

    @Test
    public void CountMinMonthSales() {
        StatsService service = new StatsService();  // мин продаж+
        long[] MinMonthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expentedMin = 9;
        long actualMin = service.minMonthSales(MinMonthSales);

        Assertions.assertEquals(expentedMin, actualMin);

    }

    @Test
    public void CountMonthBelowAverage() {
        StatsService service = new StatsService();  // ниже среднего+
        int[] monthBelowAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expentedLow = 5;
        int actualLow = service.monthBelowAverage(monthBelowAverage);

        Assertions.assertEquals(expentedLow, actualLow);
    }

    @Test
    public void CountMonthAboveAverage() {
        StatsService service = new StatsService();  // выше среднего+
        int[] monthAboveAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expentedAdobe = 5;
        int actualAdobe = service.monthAboveAverage(monthAboveAverage);

        Assertions.assertEquals(expentedAdobe, actualAdobe);
    }
}