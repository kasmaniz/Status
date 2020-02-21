/*
 * Zohaib Kasmani
 * 991545984
 * SYST10199-Web Programming
 */
package status;

/**
 *
 * @author Taby zeri
 */
public class InputGenerator {
    int num=4;
   public UserInput[] data =new UserInput[4];
    
public void generate(){
    int count=0;
    for(UserInput.Inputs temp1: UserInput.Inputs.values()){
        UserInput i1=new UserInput(temp1);
        data[count]=i1;
        count++;
    }
} 


}
