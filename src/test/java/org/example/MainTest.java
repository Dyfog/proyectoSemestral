package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int testearValor1;
    int testearValor2;
    int testearValor3;
    int valorMax1;
    int valorMax2;
    int valorMax3;
    int valorMin1;
    int valorMin2;
    int valorMin3;
    int material1;
    int material2;
    int material3;
    int simples1;
    int simples2;
    int simples3;
    int sofisticados1;
    int sofisticados2;
    int sofisticados3;
    int[] arregloTesting1 = new int[2];
    int[] arregloTesting2 = new int[2];
    int[] arregloTesting3 = new int[2];
    int largo1;
    int largo2;
    int largo3;
    int color1;
    int color2;
    int color3;
    int iva1;
    int iva2;
    int iva3;
    int[] precioTotal1;
    int[] precioTotal2;
    int[] precioTotal3;

    @BeforeEach
    void setUp() {
        testearValor1= -2;
        testearValor2= 0;
        testearValor3= -7;

        valorMax1 = -1;
        valorMax2 = 3;
        valorMax3 = -1;

        valorMin1 = -4;
        valorMin2 = 0;
        valorMin3 = -4;

        material1=0;
        material2=1;
        material3=2;

        simples1=5;
        simples2=10;
        simples3=0;

        sofisticados1=5;
        sofisticados2=0;
        sofisticados3=0;

        arregloTesting1[0]=simples1;
        arregloTesting2[0]=simples2;
        arregloTesting3[0]=simples3;

        arregloTesting1[1]=sofisticados1;
        arregloTesting2[1]=sofisticados2;
        arregloTesting3[1]=sofisticados3;

        largo1=0;
        largo2=1;
        largo3=2;

        color1=0;
        color2=2;
        color3=5;

        iva1=100;
        iva2=10;
        iva3=0;

        precioTotal1= new int[]{0,2,3,4,6};
        precioTotal2= new int[]{0,10,10,10,0};
        precioTotal3= new int[]{0,0,0,0,0};
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    void validarRangoNumeroTest() {
        assertTrue(Main.validarRangoNumero(testearValor1,valorMin1,valorMax1));
        assertTrue(Main.validarRangoNumero(testearValor2,valorMin2,valorMax2));
        assertFalse(Main.validarRangoNumero(testearValor3,valorMin3,valorMax3));
    }
    @Test
    void calculoMaterialTest(){
        assertEquals(6000,Main.calculoMaterial(material1));
        assertEquals(5000,Main.calculoMaterial(material2));
        assertEquals(4000,Main.calculoMaterial(material3));
    }
    @Test
    void calculoDiseñoTest(){
        assertEquals(8500,Main.calculoDiseño(arregloTesting1));
        assertEquals(5000,Main.calculoDiseño(arregloTesting2));
        assertEquals(0,Main.calculoDiseño(arregloTesting3));
    }
    @Test
    void calculoDecoracionTest(){
        assertEquals(10500,Main.valorDecoracion(arregloTesting1));
        assertEquals(6000,Main.valorDecoracion(arregloTesting2));
        assertEquals(0,Main.valorDecoracion(arregloTesting3));
    }
    @Test
    void calculoLargoTest(){
        assertEquals(0,Main.calcValorLargo(largo1));
        assertEquals(5000,Main.calcValorLargo(largo2));
        assertEquals(7000,Main.calcValorLargo(largo3));
    }
    @Test
    void calculoColorTest(){
        assertEquals(8000,Main.valorColores(color1));
        assertEquals(8000,Main.valorColores(color2));
        assertEquals(9000,Main.valorColores(color3));
    }
    @Test
    void calcularNetoTest(){
        assertEquals(119,Main.calcularNeto(iva1));
        assertEquals(11.9,Main.calcularNeto(iva2),0.1);
        assertEquals(0,Main.calcularNeto(iva3));
    }
    @Test
    void calcularSumaDePreciosTest(){
        assertEquals(15,Main.calcularPrecioArreglo(precioTotal1));
        assertEquals(30,Main.calcularPrecioArreglo(precioTotal2));
        assertEquals(0,Main.calcularPrecioArreglo(precioTotal3));
    }
}