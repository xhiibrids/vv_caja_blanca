package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SustituirPalabraTest {
    static Editor editor;

    @BeforeEach
    void init() {
        editor = new Editor();
    }

    @Test
    /*
    Editor vacío. Devuelve el control en L2.
     */
    void emptyList() {
        editor.sustituirPalabra("", "");
        Assertions.assertTrue(editor.editIsEmpty());
    }

    /*
    Editor relleno. La palabra no se encuentra en ninguna línea. Se toma el camino A en L11.
     */
    @Test
    void oneWordMissing() throws EmptyCollectionException {
        editor.leerFichero("src/test/resources/oneLine.txt");
        editor.sustituirPalabra("missing", "ttt");
        Assertions.assertEquals("pal", editor.getLinea(1).getAtPos(1));
    }

    /*
    Editor relleno. La palabra se encuentra en alguna línea. Se toma el camino B en L11.
     */
    @Test
    void oneWordPresent() throws EmptyCollectionException {
        editor.leerFichero("src/test/resources/oneLine.txt");
        editor.sustituirPalabra("pal", "ttt");
        Assertions.assertEquals("ttt", editor.getLinea(1).getAtPos(1));
    }





}
