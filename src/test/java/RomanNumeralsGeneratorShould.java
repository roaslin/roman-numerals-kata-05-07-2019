import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsGeneratorShould {

    @Test
    public void generate_roman_numeral() {

        RomanNumeralsGenerator generator = new RomanNumeralsGenerator();
        assertThat(generator.generate(1), is("I"));
    }

}