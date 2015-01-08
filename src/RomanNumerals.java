import java.util.HashMap;

/**
 * Created by renatagrfarias on 12/16/14.
 */
public class RomanNumerals {

    HashMap<String, Integer> numerals;

    public RomanNumerals() {
        numerals = new HashMap<String, Integer>();
        numerals.put("I", 1);
        numerals.put("V", 5);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("C", 100);
    }

    public HashMap<String, Integer> getRomanNumerals(){
        return numerals;
    }

    public int convert(String numeral) {
        int lastPosition = numeral.length()-1;
        int total = numerals.get(numeral.charAt(lastPosition) + "");

        for(int i=lastPosition; i>0; i--){
            int currentNumber = numerals.get(numeral.charAt(i) + "");
            int previousNumber = numerals.get(numeral.charAt(i-1) + "");

            if(currentNumber > previousNumber)
                total -= previousNumber;
            else
                total += previousNumber;

        }
        return total;
    }
}
