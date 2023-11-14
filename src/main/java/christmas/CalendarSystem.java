package christmas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class CalendarSystem {
    private final int day;
    private static final int DEFAULT = 0;
    private static final int YEAR = 2023;
    private static final int MONTH = 12;
    private static final int STAR_DAY = 1000;
    private static final int START = 1;
    private static final int END = 25;
    private static final int ADD_DISCOUNT = 100;

    public CalendarSystem(int day){
        this.day = day;
    }

    private int getDayOfWeek(){
        LocalDate date = LocalDate.of(YEAR, MONTH, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.getValue();
    }

    public void event(ArrayList<Menu> menus){
        int dayOfWeek = getDayOfWeek();
        if (dayOfWeek == 6 || dayOfWeek == 7){

        }
    }

    public int discount(ArrayList<Menu> menus, int type){
        int totalDiscountPrice = DEFAULT;
        int discount = DEFAULT;
        if (type == Util.EventDiscount.WEEKDAYS.getTypeNumber()){
            for (Menu menu : menus){
                discount += discountPrice(menu, Util.EventDiscount.WEEKDAYS);
            }
        }
        if (type == Util.EventDiscount.WEEKENDS.getTypeNumber()){
            for (Menu menu : menus){
                discount += discountPrice(menu, Util.EventDiscount.WEEKENDS);
            }
        }
        if (starEvent()){
            totalDiscountPrice -= STAR_DAY;
        }
        return totalDiscountPrice - christmasDiscount();
    }

    public boolean starEvent(){
        for(Util.Star starDay : Util.Star.values()){
            if (starDay.getDay() == day){
                return true;
            }
        }
        return false;
    }

    private int christmasDiscount(){
        if (day >= START && day <= END){
            return STAR_DAY + (day-START)*ADD_DISCOUNT;
        }
        return DEFAULT;
    }

    private int discountPrice(Menu menu, Util.EventDiscount event){
        Util.Food food = menu.searchMenu();
        if (food.getType().equals(event.getType())){
            return event.getPrice()*menu.getCount();
        }
        return DEFAULT;
    }
}
