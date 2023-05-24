/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package pruebasunitarias;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class MatricadNGTest {

    
    public MatricadNGTest() {
        
    }

    /**
     * Test of getCantidadCadenasQueEmpiezanCon method, of class Matricad.
     */
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = 'h';
        Matricad instance =  null;
        int expResult = 2;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);

    }

    /**
     * Test of hayCadenasQueEmpiezanPor method, of class Matricad.
     */
    @Test
    public void testHayCadenasQueEmpiezanPor() {
        System.out.println("hayCadenasQueEmpiezanPor");
        char letra = 't';
        Matricad instance = null;
        boolean expResult = true;
        boolean result = instance.hayCadenasQueEmpiezanPor(letra);
        assertEquals(result, expResult);

    }

    /**
     * Test of getConcatenacionCadenas method, of class Matricad.
     */
    @Test
    public void testGetConcatenacionCadenas() {
        System.out.println("getConcatenacionCadenas");
        Matricad instance = null;
        String expResult = "";
        String result = instance.getConcatenacionCadenas();
        assertEquals(result, expResult);

    }

    /**
     * Test of getPosicionesDe method, of class Matricad.
     */
    @Test
    public void testGetPosicionesDe() {
        System.out.println("getPosicionesDe");
        String unaCadena = "adios";
        Matricad instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);

    }

}
