package solutions.day3;

import utils.InputHandler;
import java.util.List;

public class Task1 {
    static String gammaRate = "";
    static String epsilonRate ="";


    public static void main(String[] args) {
        List<String> inputs = InputHandler.getInput( "day3" );

        int inputsQuantity = inputs.size();

        for (int i = 0; i <12 ; i++) {
            int binary0 = 0;
            int binary1 = 0;

            for (int j = 0; j <inputsQuantity ; j++) {

                if(inputs.get( j ).charAt( i )=='1')
                    binary1++;
                else binary0++;
            }

            if(binary1>binary0)  {
                gammaRate= gammaRate + "1";
                epsilonRate = epsilonRate + "0";
            }

            else {
                gammaRate = gammaRate+"0";
                epsilonRate = epsilonRate +"1";
            }



        }
        System.out.println(gammaRate);
        System.out.println(epsilonRate);
        System.out.println("REsult: " + Integer.parseInt( gammaRate,2 )*Integer.parseInt( epsilonRate,2 ));
    }
}
