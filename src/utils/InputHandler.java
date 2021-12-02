package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputHandler {

    private static final String BASE_URL = "resources/";

    public static List<String> getInput(String dayPath) {
        String filePath = BASE_URL + dayPath + "/input.txt";

        System.out.println(filePath);

        String line;
        List<String> inputs = new ArrayList<>();
        BufferedReader reader;

        try {
            reader = new BufferedReader( new FileReader(filePath) );
            while((line=reader.readLine())!= null) {
                inputs.add( line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputs;
    }

}
