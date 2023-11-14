package christmas;

import java.util.ArrayList;

public class OutputView {
    private static final int CHAMPAGNE = 120000;
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printEvent(int day){
        System.out.println("12월 "+day+"일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        System.out.println();
    }

    public void printOrderMenu(ArrayList<Menu> orders, int totalOrderPrice){
        System.out.println("<주문 메뉴>");
        for (Menu menu : orders){
            System.out.println(menu.getFoodName()+" "+menu.getCount()+"개");
        }
        System.out.println();
        System.out.println("<할인 전 총주문 금액>");
        System.out.println(totalOrderPrice+"원");

        System.out.println("<증정 메뉴>");
        System.out.print(giftMenu(totalOrderPrice));

    }

    private String giftMenu(int totalOrderPrice){
        if (totalOrderPrice/CHAMPAGNE >= 1){
            return "샴페인 1개";
        }
        return "없음";
    }

    public void benefitHistory(){

    }
}
