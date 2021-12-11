package com.practica.cajablanca;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NumPalabrasTest {

    static Editor editor;

    @BeforeEach
    void init() {
        editor = new Editor();
        editor.leerFichero("src/test/resources/prueba.txt");
    }

    @Test
    void camino1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(0, 1, "test"));
    }

    @Test
    void camino2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(3, Integer.MAX_VALUE, "test"));

    }

    @Test
    void camino3() {
        editor = new Editor();
        Assertions.assertEquals(0, editor.numPalabras(2, -1, "test"));

    }

    @Test
    void camino4() {
        Assertions.assertEquals(0, editor.numPalabras(2, 1, "test"));

    }

    @Test
    @Disabled
    @DisplayName("Camino 5 inviable. No se puede dar esta condición sin modificar el código del Editor")
    void camino5() {

    }

    @Test
    void camino6() {
        Assertions.assertEquals(1, editor.numPalabras(1, 2, "lore"));

    }

    @Test
    void camino7() {
        Assertions.assertEquals(0, editor.numPalabras(1, 2, "palabranoenfichero"));

    }


}
