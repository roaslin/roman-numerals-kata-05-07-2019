public class RomanNumeralsGenerator {
    public String generate(int arabicNumber) {

        String numeral = "";

        if(arabicNumber >= 10){

            numeral += "X";
            arabicNumber -=10;
        }

        if(arabicNumber >= 5){

            numeral += "V";
            arabicNumber -=5;
        }


        for(int i = 0; i < arabicNumber;i++){

            numeral += "I";
        }

        return numeral;
    }
}
