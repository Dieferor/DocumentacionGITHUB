/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Calculadora en java
 * @author Diego Fernández Ortega
 */
public class Calculadora {
    
    /**
     * Calcula la suma de dos números reales ($num1,$num2)
     * @param $num1 El primer sumando
     * @param $num2 El segundo sumando
     * @return El sumatorio de los números $num1 y $num2
     */
    public double sumar(double $num1, double $num2) {
        double $result = $num1 + $num2;
        return $result;
    }
    /**
     * Calcula la resta de dos números reales ($num1,$num2)
     * @param $num1 El minuendo
     * @param $num2 El sustraendo
     * @return La diferencia entre los números $num1 y $num2
     */
    public double restar(double $num1, double $num2) {
        double $result = $num1 - $num2;
        return $result;
    }
    /**
     * Calcula la multiplicación de dos números reales ($num1,$num2)
     * @param $num1 El primer factor
     * @param $num2 El segundo factor
     * @return El producto entre los factores $num1 y $num2
     */
    public double multiplicar(double $num1, double $num2) {
        double $result = $num1 * $num2;
        return $result;
    }
    /**
     * Calcula la división entre dos números reales ($num1,$num2)
     * @param $num1 El dividendo
     * @param $num2 El divisor (debe ser distinto de 0)
     * @return El cociente entre $num1 y $num2
     */
    public double dividir(double $num1, double $num2) {
        double result = 0;
        try {
            result = $num1 / $num2;
        } catch (ArithmeticException e) { //excepción para controlar la división entre 0
            System.out.println("Error, imposible dividir por 0");
        }
        return result;
    }
}

