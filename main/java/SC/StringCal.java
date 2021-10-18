package SC;

public class StringCal {

    public static int add(String numbers){
        int returnval =0;
        String[] numbersArray = numbers.split(",|n");
       /* if (numbersArray.length > 2) {
            throw new RuntimeException(" 2 numbers separated by comma (,) are allowed");
        } else { */
            for (String number : numbersArray) {
                if (!number.isEmpty()) {
                   returnval+= Integer.parseInt(number.trim());

            }
        }
        return returnval;
    }


}



