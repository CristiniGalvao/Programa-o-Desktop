/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author aluno
 */
public class ExemploBigDecimal {

    public static void main(String[] args) {
        new FramePrincipal().setVisible(true);
        
        BigDecimal valor = new BigDecimal("1.0");
        
        //somar
       valor= valor.add(new BigDecimal("2.00"));
        System.out.println("Soma: "+valor);
        
        //subtrair
       valor= valor.subtract(new BigDecimal("2.00"));
        System.out.println("Subtrair: "+valor);
        
        //dividir
        valor = new BigDecimal("10");
       valor= valor.divide(new BigDecimal("2.00"));
        System.out.println("Dividir: "+valor);
        
        //Multiplicar
       valor = new BigDecimal("2");
       valor= valor.add(new BigDecimal("2.00"));
        System.out.println("Multiplicar: "+valor);
        
        //compare
        //-1 = menor 
        //0 = igual
        //1 = maior
        valor = new BigDecimal("3");  
        int compara = valor.compareTo(new BigDecimal("2"));
        System.out.println("Comparação: "+compara);
        
        //retorna o maior valor entre eles
        valor = new BigDecimal("2");
        BigDecimal max = valor.max(new BigDecimal("5"));
        System.out.println("Maior: "+max);
        
        //retorna o menor valor entre eles
        valor = new BigDecimal("2");
        BigDecimal min = valor.min(new BigDecimal("5"));
        System.out.println("Menor: "+min);
        
        //Potência
        BigDecimal potencia = valor.pow(2);
        System.out.println("Potência: "+potencia);
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.CEILING);
        System.out.println("CEILENG: "+valor);
        
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.DOWN);
        System.out.println("DOWN: "+valor);
        
        valor = new BigDecimal("111.55555555");
        valor = valor.setScale(3,RoundingMode.FLOOR);
        System.out.println("FLOOR: "+valor);
        
        valor = new BigDecimal("111.5555");
        valor = valor.setScale(3,RoundingMode.HALF_UP);
        System.out.println("HALF_UP: "+valor);
        
        valor = new BigDecimal("111.5556");
        valor = valor.setScale(3,RoundingMode.HALF_DOWN);
        System.out.println("HALF_DOWN: "+valor);
    }
}
