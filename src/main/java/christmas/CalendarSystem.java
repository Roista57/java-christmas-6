package christmas;

import org.assertj.core.api.LocalDateAssert;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CalendarSystem {
    private final int day;
    private static final int YEAR = 2023;
    private static final int MONTH = 12;
    public CalendarSystem(int day){
        this.day = day;
    }

    public int getDayOfWeek(){
        LocalDate date = LocalDate.of(YEAR, MONTH, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.getValue();
    }
}
