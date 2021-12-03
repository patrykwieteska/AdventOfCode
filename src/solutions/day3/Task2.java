package solutions.day3;

import utils.InputHandler;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    static String oxygenGeneratorRating;
    static String co2ScrubberRating;

    public static void main(String[] args) {
        List<String> inputs = InputHandler.getInput( "day3_v2" );

        List<String> oxygenGeneratorRatings = inputs;
        for (int i = 0; i <12 ; i++) {
            int binary0 = 0;
            int binary1 = 0;

            // oxygenGeneratorRating;

            char bitPosition = '0';

            // check most common bit bitPosition

            for (int j = 0; j <oxygenGeneratorRatings.size() ; j++) {

                if(oxygenGeneratorRatings.get( j ).charAt( i )=='1')
                    binary1++;
                else binary0++;
            }



            if(binary1 >= binary0)
                bitPosition='1';

            List<String> newOxygenGeneratorRatings = new ArrayList<>();

            for (int j = 0; j <oxygenGeneratorRatings.size() ; j++) {
                if(oxygenGeneratorRatings.get( j ).charAt( i )== bitPosition) {
                    newOxygenGeneratorRatings.add( oxygenGeneratorRatings.get( j ) );
                }
            }

            oxygenGeneratorRatings=newOxygenGeneratorRatings;
            if(oxygenGeneratorRatings.size()==1) {
                oxygenGeneratorRating =oxygenGeneratorRatings.get( 0 );
                break;
            }
        }

        System.out.println(oxygenGeneratorRating);



        List<String> co2ScrubberRatings = inputs;
        for (int i = 0; i <12 ; i++) {
            int binary0 = 0;
            int binary1 = 0;

            char bitPosition = '1';

            // check most common bit on bitPosition

            for (int j = 0; j <co2ScrubberRatings.size() ; j++) {

                if(co2ScrubberRatings.get( j ).charAt( i )=='1')
                    binary1++;
                else binary0++;
            }

            if(binary0 <= binary1)
                bitPosition='0';

            List<String> newCo2ScrubberRatings = new ArrayList<>();

            for (int j = 0; j <co2ScrubberRatings.size() ; j++) {
                if(co2ScrubberRatings.get( j ).charAt( i )== bitPosition) {
                    newCo2ScrubberRatings.add( co2ScrubberRatings.get( j ) );
                }
            }

            co2ScrubberRatings=newCo2ScrubberRatings;
            if(co2ScrubberRatings.size()==1) {
                co2ScrubberRating =co2ScrubberRatings.get( 0 );
                break;
            }
        }

        System.out.println(co2ScrubberRating);

        System.out.println("REsult: "+Integer.parseInt( co2ScrubberRating,2 )*Integer.parseInt( oxygenGeneratorRating
                ,2 ));
    }
}
