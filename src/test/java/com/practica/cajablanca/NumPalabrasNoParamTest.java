package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class NumPalabrasNoParamTest {

    static Editor editor;

    @BeforeEach
    void init() {
        editor = new Editor();
        editor.leerFichero("src/test/resources/unaPalabra.txt");
    }
    @Test
    void camino1(){
        editor = new Editor();
        Assertions.assertThrows(EmptyCollectionException.class,() -> editor.numPalabras());
    }
    @Test
    @Disabled("Camino inviable. ")
    void camino2(){

    }

    @Test
    @Disabled("Camino inviable")
    void camino3(){

    }
    @Test
    @Disabled("Camino inviable")
    void camino4() {

    }
    @Test
    void camino5() throws EmptyCollectionException {
        Assertions.assertEquals(1, editor.numPalabras());
    }
}
