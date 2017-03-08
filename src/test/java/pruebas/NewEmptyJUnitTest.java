/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.conceptosavanzados.pspprogram3.utilitarios.CalcularCoeficientes;
import com.conceptosavanzados.pspprogram3.utilitarios.OperacionesNumericas;
import java.util.HashMap;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PERSONAL
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void testCaso1()
    {
        HashMap<String, LinkedList<Double>> listaPruebaDatosXY = new HashMap<String, LinkedList<Double>>();
        LinkedList<Double> valoresPruebaX = new LinkedList<Double> ();
        valoresPruebaX.add(130.0);
        valoresPruebaX.add(650.0);
        valoresPruebaX.add(99.0);
        valoresPruebaX.add(150.0);
        valoresPruebaX.add(128.0);
        valoresPruebaX.add(302.0);
        valoresPruebaX.add(95.0);
        valoresPruebaX.add(945.0);
        valoresPruebaX.add(368.0);
        valoresPruebaX.add(961.0);
        LinkedList<Double> valoresPruebaY = new LinkedList<Double> ();
        valoresPruebaY.add(186.0);
        valoresPruebaY.add(699.0);
        valoresPruebaY.add(132.0);
        valoresPruebaY.add(272.0);
        valoresPruebaY.add(291.0);
        valoresPruebaY.add(331.0);
        valoresPruebaY.add(199.0);
        valoresPruebaY.add(1890.0);
        valoresPruebaY.add(788.0);
        valoresPruebaY.add(1601.0);
        double Xk = 386.0;
        listaPruebaDatosXY.put("X", valoresPruebaX);
        listaPruebaDatosXY.put("Y", valoresPruebaY);
        
        CalcularCoeficientes objetoPruebas = new CalcularCoeficientes();
        objetoPruebas.Calcular(listaPruebaDatosXY, Xk);
		
        assertEquals(-22.55D, objetoPruebas.getB0(), 0.01D);
        assertEquals(1.7279D, objetoPruebas.getB1(), 0.01D);
        assertEquals(0.9545D, objetoPruebas.getR(), 0.01D);
        assertEquals(0.9111D, objetoPruebas.getR2(), 0.01D);
        assertEquals(644.4294D, objetoPruebas.getYk(), 0.01D);
    }
    
    
    @Test 
    public void testCalcularMedia()
    {
        LinkedList<Double> valoresPruebaX = new LinkedList<Double> ();
        valoresPruebaX.add(130.0);
        valoresPruebaX.add(650.0);
        valoresPruebaX.add(99.0);
        valoresPruebaX.add(150.0);
        valoresPruebaX.add(128.0);
        valoresPruebaX.add(302.0);
        valoresPruebaX.add(95.0);
        valoresPruebaX.add(945.0);
        valoresPruebaX.add(368.0);
        valoresPruebaX.add(961.0);
        double media = OperacionesNumericas.calcularMedia(valoresPruebaX);
        assertEquals(382.8D, media, 0.01D);
    }
    
     @Test 
    public void testCalcularSumatoria()
    {
        LinkedList<Double> valoresPruebaY = new LinkedList<Double> ();
        valoresPruebaY.add(186.0);
        valoresPruebaY.add(699.0);
        valoresPruebaY.add(132.0);
        valoresPruebaY.add(272.0);
        valoresPruebaY.add(291.0);
        valoresPruebaY.add(331.0);
        valoresPruebaY.add(199.0);
        valoresPruebaY.add(1890.0);
        valoresPruebaY.add(788.0);
        valoresPruebaY.add(1601.0);
        double sumatoria = OperacionesNumericas.calcularSumatoria(valoresPruebaY);
        assertEquals(6389D, sumatoria, 0.01D);
    }
}
