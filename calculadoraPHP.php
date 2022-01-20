<?php
/// Clase calculadora en PHP
///
/// Permite realizar operaciones aritméticas básicas

class Calculadora
{
    /**
     * Calcula la suma de dos números reales ($num1,$num2)
     * @param $num1 El primer sumando
     * @param $num2 El segundo sumando
     * @return El sumatorio de los números $num1 y $num2
     */
    public function sumar($num1, $num2)
    {
        $result = $num1 + $num2;
        return $result;
    }
    /**
     * Calcula la resta de dos números reales ($num1,$num2)
     * @param $num1 El minuendo
     * @param $num2 El sustraendo
     * @return La diferencia entre los números $num1 y $num2
     */
    public function restar($num1, $num2)
    {
        $result = $num1 - $num2;
        return $result;
    }
    /**
     * Calcula la multiplicación de dos números reales ($num1,$num2)
     * @param $num1 El primer factor
     * @param $num2 El segundo factor
     * @return El producto entre los factores $num1 y $num2
     */
    public function multiplicar($num1, $num2)
    {
        $result = $num1 * $num2;
        return $result;
    }
    /**
     * Calcula la división entre dos números reales ($num1,$num2)
     * @param $num1 El dividendo
     * @param $num2 El divisor (debe ser distinto de 0)
     * @return El cociente entre $num1 y $num2
     */
    public function dividir($num1, $num2)
    {
        try {
            $result = $num1 / $num2;
        } catch (ArithmeticError) { //excepción para controlar la división entre 0
            echo "Error: no es posible dividir por 0";
        }
        return $result;
    }
}
