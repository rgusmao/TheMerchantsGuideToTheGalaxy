import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by renatagrfarias on 12/17/14.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Functions functions = new Functions();
        RomanNumerals romanNumerals = new RomanNumerals();
        FileReader file = new FileReader("/Users/renatagrfarias/Downloads/TheMerchantsGuideToTheGalaxy/src/Notes");

        BufferedReader br = new BufferedReader(file);
        String typeOfContent;
        String line = br.readLine();
        ArrayList output = new ArrayList();
        HashMap galaxy = new HashMap();

        while(line != null) {
            typeOfContent = functions.verifyContentOfLine(line);
            String outputLine;
            String[] splitedLine = line.split(" ");

            if(typeOfContent.equals("RomanNumerals")) {
                galaxy.put(splitedLine[0], splitedLine[2]);

            } else if (typeOfContent.equals("NumberOfCredits")) {

                    //Silver
                    if (line.contains("Silver")) {
                        int number = romanNumerals.convert(galaxy.get(splitedLine[0]).toString() + galaxy.get(splitedLine[1]).toString());
                        int silver = Integer.valueOf(splitedLine[4]) / (number);
                    }
                    //Gold
                    if (line.contains("Gold")) {
                        int number = romanNumerals.convert(galaxy.get(splitedLine[0]).toString() + galaxy.get(splitedLine[1]).toString());
                        int gold = Integer.valueOf(splitedLine[4]) / (number);

                    }
                    //Iron
                    if (line.contains("Iron")) {
                        int number = romanNumerals.convert(galaxy.get(splitedLine[0]).toString() + galaxy.get(splitedLine[1]).toString());
                        int iron = Integer.valueOf(splitedLine[4]) / (number);

                    }

            } else if (typeOfContent.equals("Questions")) {

                if(line.contains("how much")){
                    //how much
                } else if(line.contains("how many")){
                    //how many
                }


            }

            line = br.readLine();
        }

    }



}
