package christmas;

import java.util.ArrayList;

public class Util {
    public enum Message{
        STARTMESSAGE("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다."),
        VISIT("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)"),
        ORDER("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        private final String message;

        Message(String message){
            this.message = message;
        }

        public String getMessage(){
            return message;
        }
    }
    public enum Error{
        ERROR_DAY("유효하지 않은 날짜입니다. 다시 입력해 주세요."),
        ERROR_ORDER("유효하지 않은 주문입니다. 다시 입력해 주세요.");
        private final String message;

        Error(String message){
            this.message = "[ERROR] " + message;
        }

        public String getMessage(){
            return message;
        }
    }

    public enum Food{
        MUSHROOMSOUP("양송이수프", 6000, "애피타이저"),
        TAPAS("타파스", 5500, "애피타이저"),
        CAESARSALAD("시저샐러드", 8000,"애피타이저"),
        TBONESTEAK("티본스테이크", 55000,"메인"),
        BARBECUERIBS("바비큐립", 54000,"메인"),
        SEAFOODPASTA("해산물파스타", 35000,"메인"),
        CHRISTMASPASTA("크리스마스파스타", 25000,"메인"),
        CHOCOLATECAKE("초코케이크", 15000,"디저트"),
        ICECREAM("아이스크림", 5000,"디저트"),
        ZEROCOLA("제로콜라", 3000,"음료"),
        REDWINE("레드와인", 60000,"음료"),
        CHAMPAGNE("샴페인", 25000,"음료");

        private final String name;
        private final int price;
        private final String type;

        Food(String name, int price, String type){
            this.name = name;
            this.price = price;
            this.type = type;
        }

        public String getName(){
            return name;
        }
        public int getPrice(){
            return price;
        }
        public String getType(){
            return type;
        }
    }
}
