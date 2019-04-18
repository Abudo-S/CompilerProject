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
public class stack {
    Object[] stack;
    private int count;
    
    public stack(){
        this.stack=new Object[500];
        count=-1;
    }
    
    public void push(Object x){
        if(count==500-1){
            System.out.println("Can't push,the stack is full");
        }else{
            stack[++count]=x;
        }
    }
    
    public Object pop(){
        if(count==-1){
            System.out.println("Can't pop,the stack is empty");
            return null;
        }else{
            Object x =stack[count];
            count--;
            return x;
        }
    }
    
    public int size(){
        return count+1;
    }
    
    public void fill_stack(token tok){
        String[] tokens=tok.get_all_tokens();
        for(int i=0;i<tok.size();i++){
            this.push(tokens[i]);
        }
    }
}
