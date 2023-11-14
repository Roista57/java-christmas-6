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

    public void start() {
        outputView.printMessage(Util.Message.STARTMESSAGE.getMessage());
        outputView.printMessage(Util.Message.VISIT.getMessage());
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
            throw new IllegalArgumentException(Util.Error.ERROR_DAY.getMessage());
        }
    }
}
