import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    Quadrado q1;

    @BeforeEach
    void doBefore(){
        q1 = new Quadrado(10);
    }

    @Test
    void calcularQuadrado(){
        Assertions.assertEquals(4* 7, q1.calcularPerimetro());
    }


}