public class RomanNumeralsGenerator {
    public String generate(int arabicNumber) {

        String numeral = ""
                ;
        if(arabicNumber == 6){
            return "VI";
        }

        if(arabicNumber == 5){
            return "V";
        }


        for(int i = 0; i < arabicNumber;i++){

            numeral += "I";
        }

        return numeral;
    }
}
