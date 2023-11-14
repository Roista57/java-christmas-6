package christmas;

public class Menu {
    private final String foodName;
    private final int count;
    public Menu(String[] orderInfo){
        validate(orderInfo[0]);
        this.foodName = orderInfo[0];
        this.count = numberCheck(orderInfo[1]);
    }

    private void validate(String foodName){
        for (Util.Food food : Util.Food.values()) {
            if (food.getName().equals(foodName)){
                return;
            }
        }
        throw new IllegalArgumentException(Util.Error.ERROR_ORDER.getMessage());
    }

    private int numberCheck(String number){
        try{
            return Integer.parseInt(number);
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException(Util.Error.ERROR_ORDER.getMessage());
        }
    }

    public String getFoodName(){
        return foodName;
    }
    public int getCount(){
        return count;
    }
}
