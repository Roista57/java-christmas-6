package christmas;

public class OutputView {
    private enum Message{
        STARTMESSAGE("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
        private final String message;

        Message(String message){
            this.message = message;
        }

        public String getMessage(){
            return message;
        }

    }
    public void printMessage(String message){
        System.out.println(message);
    }

    public void startMessage(){
        System.out.println(Message.STARTMESSAGE.getMessage());
    }
}
