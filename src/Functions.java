import java.util.HashMap;

/**
 * Created by renatagrfarias on 12/18/14.
 */
public class Functions {

    public String verifyContentOfLine(String line) {
        String lastString;
        lastString = getLastString(line);
        RomanNumerals romanNumerals = new RomanNumerals();
        HashMap<String, Integer> roman = romanNumerals.getRomanNumerals();
        if(roman.containsKey(lastString)){
            return "RomanNumerals";
        }
        if(lastString.equals("Credits")){
            return "NumberOfCredits";
        }
        if(lastString.equals("?")){
            return "Questions";
        }
        return null;
    }

    public String getLastString(String line) {
        String[] separatedLine = line.split(" ");
        int lastPosition = separatedLine.length - 1;
        return separatedLine[lastPosition];
    }


}
