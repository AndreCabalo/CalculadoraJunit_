import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void cinquentaENoveDeveRetornarF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGradle(59));

    }

    @Test
    void sessentaENoveDeveRetornarD(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGradle(69));

    }

    @Test
    void setentaENoveDeveRetornarC(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGradle(79));

    }
    @Test
    void oitentaENoveDeveRetornarB(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGradle(89));

    }
    @Test
    void noventaENoveDeveRetornarA(){
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGradle(99));

    }

    @Test
    void zeroDeveRetornarF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGradle(0));

    }

    @Test
    void negativoDeveRetornarArgumentoIlegal(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGradle(-10);
                });
    }
}