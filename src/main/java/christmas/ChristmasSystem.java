package christmas;

public class ChristmasSystem {
    private final InputView inputView;
    private final OutputView outputView;
    private static final int DEFAULT = 0;
    private static final int START = 1;
    private static final int END = 31;
    public ChristmasSystem(){
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start(){
        int orderDay = inputVisitErrorCheck();
    }

    public int inputVisitErrorCheck(){
        int day = DEFAULT;
        boolean check = false;

        while(!check){
            try{
                day = inputView.inputVisit();
                numInRange(day);
                check = true;
            }catch (IllegalArgumentException e){
                outputView.printMessage(e.getMessage());
            }
        }
        return day;
    }

    private void numInRange(int day){
        if (day < START || day > END){
            throw new IllegalArgumentException("1일에서 31일 사이의 숫자로 작성해주세요.");
        }
    }
}
