public class FizzBuzzTranslate {
    public static String translate(int number){

        if (number%3==0&&number%5==0){
            return "FizzBuzz";
        }

        if(number%3==0){
            return "Fizz";
        }

        if (number%5==0){
            return "Buzz";
        }

        String number1 = String.valueOf(number);
        char[] chars = number1.toCharArray();


        for (char chars1 : chars){
            if (chars1 == '3'){
                return "Fizz";
            }

            if (chars1 == '5'){
                return "Buzz";
            }
        }

        String stringResult = "";
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '1':
                    stringResult += "mot";
                    break;
                case '2':
                    stringResult += "hai";
                    break;
                case '4':
                    stringResult += "bon";
                    break;
                case '6':
                    stringResult += "sau";
                    break;
                case '7':
                    stringResult += "bay";
                    break;
                case '8':
                    stringResult += "tam";
                    break;
                case '9':
                    stringResult += "chin";
                    break;
            }
                stringResult += " ";

        }
        return stringResult;

    }
}
