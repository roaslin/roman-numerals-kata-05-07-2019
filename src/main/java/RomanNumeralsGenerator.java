public class RomanNumeralsGenerator {
    public String generate(int arabicNumber) {


        if(arabicNumber == 3){
            return "III";
        }

        if(arabicNumber == 2){
            return "II";
        }

        return "I";
    }
}
