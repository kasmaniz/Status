/*
 * Zohaib Kasmani
 * 991545984
 * 
 */
package status;

/**
 *
 * @modifier Zohaib Kasmani
 */
public class UserInput {
    public enum Inputs{ZERO,ONE,TWO,THREE};
           private Inputs inputs;
           private int [] number=new int[4];
         
    
    public UserInput(Inputs i){
        this.inputs=i;
}

    /**
     * @return the inputs
     */
    public Inputs getInputs() {
        return inputs;
    }

    /**
     * @param inputs the inputs to set
     */
    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }

    /**
     * @return the number
     */
    public int[] getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int[] number) {
        this.number = number;
    }
}