/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metics.assignment.cocomo.experiment;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author sazx
 */
public class Precition {
    
   public static void main(String[] args){
       
       Double toBeTruncated = 3.5789055;

        toBeTruncated = BigDecimal.valueOf(toBeTruncated).setScale(3, RoundingMode.HALF_UP).doubleValue();
        System.out.println(toBeTruncated);
        
   }
}
