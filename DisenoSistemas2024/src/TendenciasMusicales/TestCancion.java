package TendenciasMusicales;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class TestCancion {
    @Test
    public void testPopularidad() {
        Cancion c1 = new Cancion("The Scientist", new Album(new Artista("Coldplay"), 2002, "A Rush of Blood to the head"));
        assertEquals(new Normal().getClass().getCanonicalName(), c1.getPopularidad().getClass().getCanonicalName());
    }
}
