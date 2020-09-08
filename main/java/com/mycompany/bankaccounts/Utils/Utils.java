/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankaccounts.Utils;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author marl8n
 */
public class Utils {
    
    static DecimalFormat df = new DecimalFormat("#.##");
    
    public static Function<String, Double> twoDecDouble = x -> Double.parseDouble(df.format(Double.parseDouble(x)));
}
