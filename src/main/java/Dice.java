import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private Integer numberOfDice;
    private ArrayList<Integer>tossResult;
    Random randomNum = new Random();


    public Dice (Integer numberOfDice){
       this(numberOfDice, new Random());
    }

    public Dice(Integer numberOfDice, Random randomNum){
        this.numberOfDice = numberOfDice;
        this.randomNum = randomNum;
        tossResult = new ArrayList<Integer>();
    }

    public Integer toss(){
        return randomNum.nextInt(6) +1;}

    public Integer tossAndSum(){
        Integer sum = 0;
        for(int i = 1; i <= numberOfDice;i++){
            sum += toss();
        }
        return sum;
    }

}
