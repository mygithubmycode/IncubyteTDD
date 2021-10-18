package SC;

import java.util.ArrayList;
import java.util.List;

public class StringCal {

    public static int add( String numbers) {
        String delimiter = ",|n";
        String numbersWithoutDelimiter = numbers;
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
        }
        return add(numbersWithoutDelimiter, delimiter);
    }

   /* private static int add( String numbers, String delimiter) {
        int returnVal = 0;
        String[] numbersArray = numbers.split(delimiter);
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnVal += Integer.parseInt(number.trim());
            }
        }
        return returnVal;
    }*/

    private static int add( String numbers, String delimiter) {
        int returnVal = 0;
        String[] numbersArray = numbers.split(delimiter);
        List negativeNumbers = new ArrayList();
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if (numberInt < 0) {
                    negativeNumbers.add(numberInt);
                }
                returnVal += numberInt;
            }
        }
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        return returnVal;
    }

  /*  public static int add(String numbers){
        int returnval =0;
        String[] numbersArray = numbers.split(",|n");
       /* if (numbersArray.length > 2) {
            throw new RuntimeException(" 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.isEmpty()) {
                   returnval+= Integer.parseInt(number.trim());

            }
        }
        return returnval;
    }
*/

}



