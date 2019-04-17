/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //test here
        // TODO code application logic here
        stack st=new stack();
        st.push(1);
        st.push("vhghg");
       // System.out.println(st.pop());
       char[]x={'I','f',' ','(',' ','x',' ','<','=',' ','S',' ',')',' '};
        scanner sc=new scanner(x);
        //System.out.println(scanner.text);
        token tok=new token(); 
        chars op=new chars();
//        System.out.println(sc.match_expression(x,0));
//         System.out.println(tok.get_token());
//         System.out.println(tok.get_token());
//         System.out.println(tok.get_token());

        System.out.println(Arrays.toString(sc.apply_matching()));
        
    }
    
}
