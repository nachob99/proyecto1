

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    /**
     * Default constructor for test class test
     */
    public test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test()
    {
        escuela escuela1 = new escuela1();
        escuela1.añadirAula("EDUCACION", 1, 32, 1);
        escuela1.añadirAula("Fisica", 32, 50, 14);
        escuela1.añadirAula("DAM2", 1, 10, 9);
        escuela1.añadirAula("DAM", 14, 32, 10);
        escuela1.listarAulas();
        escuela1.imprimirPorNombre();
        escuela1.eliminarClase(1);
        escuela1.listarAulas();
    }
}

