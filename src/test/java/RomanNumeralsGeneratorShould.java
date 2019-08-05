import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsGeneratorShould {

    @Test
    public void generate_roman_numeral() {

        RomanNumeralsGenerator generator = new RomanNumeralsGenerator();
        assertThat(generator.generate(1), is("I"));
        assertThat(generator.generate(2), is("II"));
        assertThat(generator.generate(3), is("III"));


        assertThat(generator.generate(5), is("V"));
        assertThat(generator.generate(6), is("VI"));
        assertThat(generator.generate(7), is("VII"));
        assertThat(generator.generate(8), is("VIII"));


        assertThat(generator.generate(10), is("X"));
        assertThat(generator.generate(11), is("XI"));
        assertThat(generator.generate(12), is("XII"));
        assertThat(generator.generate(13), is("XIII"));


        assertThat(generator.generate(15), is("XV"));
        assertThat(generator.generate(16), is("XVI"));
        assertThat(generator.generate(17), is("XVII"));
        assertThat(generator.generate(18), is("XVIII"));



    }

}
