/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Calculadora {

    public double sumar(double $num1, double $num2) {
        double $result = $num1 + $num2;
        return $result;
    }

    public double restar(double $num1, double $num2) {
        double $result = $num1 - $num2;
        return $result;
    }

    public double multiplicar(double $num1, double $num2) {
        double $result = $num1 * $num2;
        return $result;
    }

    public double dividor(double $num1, double $num2) {
        double result = 0;
        try {
            result = $num1 / $num2;
        } catch (ArithmeticException e) {
            System.out.println("Error, imposible dividir por 0");
        }
        return result;
    }
}
