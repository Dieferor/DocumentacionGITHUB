<?php
 class Calculadora{

    public function sumar($num1,$num2){
        $result = $num1 + $num2;
        return $result;
    }
 
    public function restar($num1,$num2){
        $result = $num1 - $num2;
        return $result;
    }

    public function multiplicar($num1,$num2){
        $result = $num1 * $num2;
        return $result;
    }

    public function dividir($num1,$num2){
        try{
            $result = $num1 / $num2;
        }catch(ArithmeticError){
            echo "Error: no es posible dividir por 0";
        }       
        return $result;
    }
}
