
public class Bins {

    private int max;
    private int min;
    int[] bins;

    public Bins(int min, int max){
        this.min = min;
        this.max = max;
        //using an array, the index represent the number on the dice. anything less than min is not used (0 is never
        //used if you have 1 dice, 0 and 1 index is not used if you have 2 dice
        bins = new int[max + 1];
    }
    //get the number in the bin which is the number of times the number is rolled.
    // BinNUmber is the index.
    public int getBin(int binNumber){
        return bins[binNumber];
    }

    public void incrementBin(int binNumber){
        bins[binNumber] = bins[binNumber] + 1;
    }

}

