public class RomanNumeralsGenerator {

    public String generate(int arabicNumber) {

        String numeral = "";


        for(RomanNumerals romanNumeral : RomanNumerals.values()){

            while (arabicNumber >= romanNumeral.getArabic()) {

                numeral += romanNumeral.getValue();
                arabicNumber -= romanNumeral.getArabic();
            }
        }

        return numeral;
    }

    public enum RomanNumerals {
        THOUSAND("M", 1000),
        NINE_HUNDRED("CM", 900),
        FIVE_HUNDRED("D", 500),
        HUNDRED("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40),
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);

        private String value;
        private int arabic;

        public String getValue() {
            return value;
        }

        RomanNumerals(String value, int arabic) {
            this.value = value;
            this.arabic = arabic;
        }

        public int getArabic() {
            return arabic;
        }

        public void setArabic(int arabic) {
            this.arabic = arabic;
        }
    }
}
