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
    private static int front;
    private static int count;
    
    public token(){
        tokens=new String[500];
        front=0;
        count=-1;
    }
    
    public void add_token(String token){
        if(count==500-1){
            System.out.println("Can't push a token");
        }else{
            tokens[++count]=token;
        }
    }
    
    public String get_token(){
        if(count==-1){
            System.out.println("Can't get a token");
            return null;
        }else{
            return tokens[front++];
       }
    }
    
    public int size(){
        return count+1;
    }
    
    /*public String peek(){
        return tokens[this.count];
    }*/
}
