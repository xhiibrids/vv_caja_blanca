package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * C1: 1-2-3-16                                               C1: 1-2-3-16
 * C2: 1-2-3-4-16                                           C2: 1-2-3-4-16
 * C3: 1-2-3-4-5-6-4                                   C3: 1-2-3-4-5-6-4
 * C4: 1-2-3-4-5-6-7-8-9-6-4                        C4: 1-2-3-4-5-6-7-8A-8B-6
 * C5: 1-2-3-4-5-6-7-8-10-6-4                          C5: 1-2-3-4-5-6-7-8A-9-6
 * C6: 1-2-3-4-5-6-7-8-10-11-6-4                        C6: 1-2-3-4-5-6-7-8A-8B-9
 */


public class MayorLongitudTest {

    static Editor editor;

    @BeforeEach
    void init() {
        editor = new Editor();
        editor.leerFichero("src/main/resources/prueba.txt");
    }

    @Test
    void camino1() throws EmptyCollectionException {
        editor = new Editor();
        Assertions.assertNull(editor.mayorLongitud());
    }

    @Test
    @Disabled("Camino no factible")
    void camino2() {
        /**
         * Imposible entrar al "for" de la línea 4 si se ha cumplido la condición de que this.editor.size() > 0
         */
    }

    @Test
    @Disabled("Camino no factible")
    void camino3() {
        /**
         * Imposible entrar al "for" de la línea 6 si la condición de this.editor.size() > 0
         */
    }

    @Test
    void camino4() throws EmptyCollectionException {
        editor = new Editor();
        editor.leerFichero("src/main/resources/unaPalabra.txt");
        Assertions.assertEquals("verificacion", editor.mayorLongitud());
    }

    @Test
    void camino5() throws EmptyCollectionException {
        /**
         * fichero con una sola linea y dos palabras
         * se realizan dos vueltas del bucle "for" interno para "saltar" la condición de "mayor == null"
         * segunda palabra mas corta que la primera
         */
        editor = new Editor();
        editor.leerFichero("src/main/resources/dosPalabrasSegMasCorta.txt");
        Assertions.assertEquals("verificacion", editor.mayorLongitud());
    }

    @Test
    void camino6() throws EmptyCollectionException {
        /**
         * fichero con una sola linea y dos palabras
         * se realizan dos vueltas del bucle "for" interno para "saltar" la condición de "mayor == null"
         * segunda palabra mas larga que la primera
         */
        editor = new Editor();
        editor.leerFichero("src/main/resources/dosPalabrasSegMasLarga.txt");
        Assertions.assertEquals("verificacion", editor.mayorLongitud());
    }


}
