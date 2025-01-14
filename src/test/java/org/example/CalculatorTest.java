package org.example;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void init(){
        calc = new Calculator();
    }

    @Test
    public void subtracts2Numbers() {
        int result = calc.subtract("3", "2");
        assertEquals(1, result);
    }



/* Asercje jUnita */

    @Test
    public void zeroVerify() {
        int result = calc.subtract("2", "2");
        assertTrue("Should be true", result == 0);
    }

    @Test
    public void zeroValue() {
        int result = calc.subtract("2", "2");
        assertEquals("Zero value", 0, result);
    }



/* Asercje assertJ */

    @Test
    public void assertJTestingString(){
        String frodoObj = calc.nameOfFrodo();
        assertThat(frodoObj)
                .isEqualTo("Frodo")
                .isEqualToIgnoringCase("FRoDO")
                .isEqualToIgnoringWhitespace("  Frodo");
    }

    @Test
    public void assertJTestingList() {
        List<Point> points;
        points = calc.returnPoints();

        assertThat(points)
                .contains(new Point(1, 2))
                .hasSize(3)
                .doesNotContain(new Point(10, 10));

        assertThat(points).extracting("x", "y")
                .contains(
                        tuple(4, 5),
                        tuple(0, 0))
                .hasSize(3);

        assertThat(points).extracting("x", Integer.class)
                .contains(1, 4, 0)
                .hasSize(3);
    }


/* Asercje mockito */

    @Test
    public void mockitoTesting() {
        IFearable fearableMock = mock(IFearable.class);
        when(fearableMock.characterName()).thenReturn("Lurtz");
        when(fearableMock.lordAbbreviation()).thenReturn('M');
        when(fearableMock.showYourNation()).thenReturn(IFearable.Home.Gondor);

        String result = fearableMock.characterName();
        assertThat(result)
                .hasSize("Lurtz".length())
                .isEqualToIgnoringWhitespace("   Lurtz")
                .isNotEqualToIgnoringCase("  LuRTZ")
                .isNotNull();

        verify(fearableMock, times(1)).characterName();

    }
}
