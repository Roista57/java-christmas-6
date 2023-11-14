package christmas;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private enum Message{
        VISIT("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        private final String message;
        Message(String message){
            this.message = message;
        }
        public String getMessage(){
            return message;
        }
    }
    public int inputVisit(){
        try{
            System.out.print(Message.VISIT.getMessage());
            String day = Console.readLine();
            return Integer.parseInt(day);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("숫자가 아닌 값을 받았습니다.");
        }
    }
}
