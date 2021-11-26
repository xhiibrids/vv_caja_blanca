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
       editor.leerFichero("src/main/java/com/practica/cajablanca/empty.txt");
    }

    @Test
    void camino1(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> editor.numPalabras(0,1,"patata"));
    }

}
