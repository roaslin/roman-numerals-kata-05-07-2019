public class RomanNumeralsGenerator {
    public String generate(int arabicNumber) {

        String numeral = "";

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
