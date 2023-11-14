package christmas;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public int inputVisit(){
        try{
            String day = Console.readLine();
            return Integer.parseInt(day);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(Util.Error.ERROR_DAY.getMessage());
        }
    }

    public String readLine(){
        return Console.readLine();
    }
}
