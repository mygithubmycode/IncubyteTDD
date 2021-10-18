package SC;

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

    private static int add( String numbers, String delimiter) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(delimiter);
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
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



