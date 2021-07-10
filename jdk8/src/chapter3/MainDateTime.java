package chapter3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainDateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("当前日期：" + today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("当前时间：" + time.format(formatter));
        System.out.println("当前年份：" + today.getYear());
        System.out.println("当前月份：" + today.getMonth());
        System.out.println("当前月份数字：" + today.getMonthValue());
        System.out.println("当前几号：" + today.getDayOfMonth());
        System.out.println("当前周几：" + today.getDayOfWeek());
        System.out.println("当前周几数字：" + today.getDayOfWeek().getValue());

        System.out.println("==============加减年份,月份==============");
        LocalDate localYear = today.plusYears(1);
        LocalDate localMonth = today.plusMonths(1);
        System.out.println("当前年份+1：" + localYear.getYear());
        System.out.println("当前月份+1：" + localMonth.getMonthValue());

        System.out.println("==============日期比较==============");
        System.out.println("isAfter:" + today.isAfter(localYear));
        System.out.println("isBefore:" + today.isBefore(localYear));

        System.out.println("==============构造日期==============");
        LocalDateTime of = LocalDateTime.of(2022, 8, 23, 12, 23, 34);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("构造日期:"+of.format(dateTimeFormatter));

    }
}
