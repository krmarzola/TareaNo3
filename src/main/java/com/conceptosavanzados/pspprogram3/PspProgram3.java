/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conceptosavanzados.pspprogram3;

import com.conceptosavanzados.pspprogram3.utilitarios.CalcularCoeficientes;
import com.conceptosavanzados.pspprogram3.utilitarios.LectorArchivo;
import com.conceptosavanzados.pspprogram3.vista.InterfazVista;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Kevin Ray Marzola Otero
 **/
public class PspProgram3 
{
     /**
        *  Clase Principal que cumple las funciones de controlador de la aplicación
        * @author Kevin Ray Marzola Otero
        * @param args the command line arguments
        * @throws java.io.IOException
        */
       public static void main(String[] args) throws IOException 
       {
           try
           {
               // TODO code application logic here
               HashMap<String, LinkedList<Double>> listaDeDatosXY = new InterfazVista().cargaArchivo();
               if(listaDeDatosXY.isEmpty())
                throw new Exception ("El listado de datos X y Y no pueden ser nulos ni vacíos");
               Double Xk = new LectorArchivo().solicitarParametroPorConsola();
               String resultado = new CalcularCoeficientes().Calcular(listaDeDatosXY, Xk);
               System.out.println("Para un valor estimado de "+ Xk + ". El resultado es el siguiente \n" + resultado); 
           }
           catch(IOException e)
           {
               System.out.println("Error al cargar archivo " + e.getMessage());            
           }
           catch (Exception e)
           {
               System.out.println("Error al leer Xk por consola " + e.getMessage());          
           }
       }
}