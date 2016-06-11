/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encriptacion;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jjn
 */
public class Binary2ASCII {
    StringBuffer binaryString = new StringBuffer();
    ArrayList<String> binaryList = new ArrayList();
    
    public void binaryConcat(String text, 
            HashMap<Character, String> huffCode) {
        
        for (char c : text.toCharArray()) 
            binaryString.append(huffCode.get(c));
    }
    
    public void binaryList(){
        String bs = "";
        int count = 0;

        while (!binaryString.toString().isEmpty()) {
            count = 8;
            bs = "";
            for (int j = 0; j < 8; j++){
                bs += binaryString.charAt(0);
                binaryString.deleteCharAt(0);
                count--;
                
                if (binaryString.toString().isEmpty())
                    break;
            }
            
            if (count != 0) {
                for (int i = 0; i < count; i++)
                    bs += "0";
                
                binaryList.add(bs);
                
            } else {
                binaryList.add(bs);
            }
        }
    }
    
    public String stringFromBinary() {
        String str = "";
        
        for (String s : binaryList) {
            int binary = Integer.parseInt(s, 2);
            str += (char)binary;
        }
        
        return str;
    }
}
