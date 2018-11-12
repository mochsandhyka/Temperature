package com.example.asus.myapplication;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;


public class ConverterTest {

    private Converter conv;
    private double min = 0.0;
    private double max = 100.0;

    public void initBlankClass() {
        conv = new Converter();
    }

    public void firstConstructorTest(){
        assertEquals(0.0, conv.getCelcius(),0);
    }

    public void secondConstructorTest(){
        double x = (Math.random()*((max-min)+1))+min;
        conv = new Converter(x);
        assertEquals(x, conv.getCelcius(),0);
    }

    public void variableTest() throws NoSuchFieldException, SecurityException {

        Field f1 = conv.getClass().getDeclaredField("temp");// variable 1

        Field[] f = conv.getClass().getDeclaredFields();
        assertEquals(1, f.length);

        assertEquals(f1.getType(), double.class);
    }

    public void methodsNameTest() throws NoSuchMethodException, SecurityException {

        Method[] m = conv.getClass().getDeclaredMethods();
        assertEquals(4, m.length);

        Class[] cArg = new Class[1];
        cArg[0] = double.class;
        Method m1 = conv.getClass().getDeclaredMethod("setTemperature", cArg);// method
        Method m2 = conv.getClass().getDeclaredMethod("getCelcius",null);// method
        Method m3 = conv.getClass().getDeclaredMethod("getFarenheit",null);// method
        Method m4 = conv.getClass().getDeclaredMethod("getKelvin",null);// method

        assertEquals(Void.TYPE, m1.getReturnType());
        assertEquals(double.class, m2.getReturnType());
        assertEquals(double.class, m3.getReturnType());
        assertEquals(double.class, m4.getReturnType());
    }

    public void toFarenheitTest(){
        double x = (Math.random()*((max-min)+1))+min;
        conv.setTemperature(x);
        assertEquals((x*1.8)+32.0, conv.getFarenheit(),0);
    }

    public void toKelvinTest(){
        double x = (Math.random()*((max-min)+1))+min;
        conv.setTemperature(x);
        assertEquals(x+273.15, conv.getKelvin(),0);
    }

}
