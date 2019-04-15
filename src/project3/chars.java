/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author Dell
 */
public class chars {
     public int look_for_length(char[] ch){
        int counter=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '||ch[i]=='\n'){
                break;
            }
            counter++;
        }
        return counter+1;
    }
    
    public char[] make_char_from_char(char[] ch,int from){
        try{
            if(from==ch.length){
                return (new char[1]);
            }
            int j=0;
            char[] new_ch=new char[ch.length-from];
            for(int i=from;i<ch.length;i++){
                //System.out.println(i);
                new_ch[j]=ch[i];
                j++;
            }
             return new_ch;
        }catch(Exception e){
            System.out.println(e);
        }
        return ch;
    }
    
    /*public char[] make_char_to_spaceORnewline(char[] ch){
        
    }*/
}
