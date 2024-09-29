import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TempConverterTest {

    @org.junit.jupiter.api.Test
    void kelvinToCel() {
        assertEquals(0.0, TempConverter.fahrToCel(32), 0.001);
    }

    @org.junit.jupiter.api.Test
    void testKelvinToCel() {
        assertEquals(0.0, TempConverter.kelvinToCel(273.15f), 0.001);
    }

    @org.junit.jupiter.api.Test
    void testKelvinToFah(){
        assertEquals(-458, TempConverter.kelvinToFah(1), 0.001);
    }

}