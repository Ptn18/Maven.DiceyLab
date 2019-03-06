public class Simulation {

    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Dice dice;
    private Bins bin;

    public Simulation(int numberOfDies, int numberOfTosses){
        this.numberOfDies =numberOfDies;
        this.numberOfTosses =numberOfTosses;
        this.dice = new Dice(numberOfDies);
        this.bin = new Bins(2,12);

    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 10000);
        sim.runSimulation();
        sim.printResults();
    }

    public void runSimulation(){
        for(int i = 0; i< numberOfTosses; i++) {
            Integer sumDice = dice.tossAndSum();
            bin.incrementBin(sumDice);
        }
    }

    public void printResults(){
        int maxSum = (numberOfDies * 6) +1;
        for(int i = numberOfDies; i < maxSum; i++ ) {
            int result = bin.getBin(i);
            double percent = (double)result/numberOfTosses;
            String numbConverted = stars((int)(percent *100));
            String format = String.format("%2d : %6d: %.2f %s", i, result,percent, numbConverted);
            System.out.println(format);
            //System.out.println("%" i + " :" + result + ": " + percent + " " + numbConverted  );

        }
    }

    public String stars(int number){
        String count = "";
        for (int i = 1; i <= number; i++) {
            count += "*";
        }
        return count;
    }








}
