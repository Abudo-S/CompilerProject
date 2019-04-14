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
public class token {
    private static String[] tokens;
    private int count;
    int front;
    
    public token(){
        tokens = new String[500];
        this.front = 0;
        this.count =-1;
    }
    
    public void add_token(String token){
        if(count == 499) {
            System.out.println("Can't push a token");
        } else {
            tokens[++count]=token;
        }
    }
    
    public String get_token(){
         if(front==count+1){
            System.out.println("Can't get a token");
            return null;
        }else{
            return tokens[front++];
       }
    }
    
    public int size(){
        return count+1;
    }
}
