/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conceptosavanzados.pspprogram3.utilitarios;

import java.util.LinkedList;

/**
 *
 * @author Kevin Ray Marzola Otero
 */
public class OperacionesNumericas 
{
    /**
    * Método calcula la media de un LinkedList tipo double
    * @param listaDeNumeros
    * @return 
    */
    public static double calcularMedia(LinkedList<Double> listaDeNumeros)
    { 
        double sumatoria = 0;
        for(double valor : listaDeNumeros)
        {
            sumatoria += valor;
        }
        return ((double)sumatoria/(double)listaDeNumeros.size());    
    }
    
    /**
    Metodo calcula la productoria de dos LinkedList tipo double
    @param valoresX es un LinkedList tipo double
    @param valoresY es un LinkedList tipo dobule
    @return variable de tipo double
    */    
    public static double calcularProductoria(LinkedList<Double> valoresX, LinkedList<Double> valoresY)
    {
        if(valoresX.size() != valoresY.size())
        {
            System.out.println("los arreglos no tienen el mismo tamaño");
            System.exit(2);
        }
        
        int totalNumeros = valoresX.size();
        double acumulador = 0D;
        for(int indiceMultiplicacion = 0; indiceMultiplicacion< totalNumeros; indiceMultiplicacion++)
        {
            acumulador += valoresX.get(indiceMultiplicacion)*valoresY.get(indiceMultiplicacion);
        }
        
        return acumulador;
    }
    
    /**
    Metodo calcula la sumatoria de un LinkedList tipo double
    @param valoresX es un LinkedList tipo double
    @return variable de tipo double 
     */     
    public static double calcularSumatoria(LinkedList<Double> valoresX)
    {
        double acumulador = 0;
        for(Double valor : valoresX)
        {
            acumulador +=valor;             
        }
        return acumulador;
    }
    
    /**
    Metodo calcula la productoria de un Arraylist tipo double
    @param valoresX es un ArrayList tipo double
    @return variable de tipo double
    */      
    public static double calcularProductoria(LinkedList<Double> valoresX)
    {
        if(valoresX.size() != valoresX.size())
        {
                System.out.println("los arreglos no tienen el mismo tamaño");
                System.exit(2);
        }
        int totalNumeros = valoresX.size();
        double acumulador = 0D;
        for(int indiceMultiplicacion = 0; indiceMultiplicacion< totalNumeros; indiceMultiplicacion++)
        {
                acumulador += valoresX.get(indiceMultiplicacion)*valoresX.get(indiceMultiplicacion);
        }
        return acumulador;
    }
    
}