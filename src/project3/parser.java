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
//No built_in methods
public class parser {
    /*public void match_stmts(char[] ch){
        
         for(int i=0;i<ch.length;i++){
            switch(ch[i]){
                case 'I':
                case 'S':
                case 'C':
                case 'R':    
                case 'V':
                    //ch=match_Variable_Decl(make_char_from_char(ch,i))
                    if(ch[i++]=='='){
                        
                    }  
                //case :
                        
                
            }
         }
    }

    public int match_number(char[] ch,int i){
        int index=0;
        for(int j=i;j<ch.length;j++){
            if(ch[j]<'0'&&ch[j]>'9'){
               index=j;
               this.tok.add_token("Constant");
               break;
            }
        }
        return index;
    }
    
    public int match_expression(char[] ch,int j){
        int i,index=0;
        int check=0,check2=0,i_prev;
        try{
            if(ch[j]>='0'&&ch[j]<='9'){
                index=match_number(ch,j);
            }else{
                index=match_ID(ch,j); 
            }
            if(index!=j){
                check=1;
            }
            if(check==1){           
                for(i=index;i<ch.length;i++){
                     if(ch[i]=='*'|ch[i]=='/'){
                         this.tok.add_token("Arithmetic Operation");
                         i++;
                         i_prev=i;
                          if(ch[i]>='0'&&ch[i+1]<='9'){
                              i=match_number(ch,i);
                          }else{
                              i=match_ID(ch,i); 
                          }
                            if(i!=i_prev){
                                  check2=1;
                            }            
                     }
                      if(check2==1){
                            if(ch[i]=='+'|ch[i]=='-'){
                                    System.out.println("    sd "+ch[i+1]);
                                this.tok.add_token("Arithmetic Operation");
                                i++;
                                if(ch[i]>='0'||ch[i]<='9'){
                                    i=match_number(ch,i);
                                }else{
                                    i=match_ID(ch,i);
                                }
                            }else{
                                break;
                            }
                        }

                 }
                 return i;
               }       
        }catch(Exception e){
            System.out.println(e);
        }
        return index;
    }
    
    public int match_ID(char[] ch,int i){
        int index=0;
        if(ch[i]==' '){
            i++;
        }
        if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){ 
            for(int j=i;j<ch.length;j++){
                if(ch[j]==' '){
                    index=j;
                    this.tok.add_token("ID");
                    break;
                }
            }
        }
        return index;
    }*/
    /*public int remove_space(char[] ch,int i){
        int index=0;
        for(int j=i;j<ch.length;j++){
            if(ch[j]!=' '){
                index=j;
                break;
            }
              System.out.println("    sd "+j);
        }
        return index;
    }*/

    /*public char[] make_char_from_char(char[] ch,int from){
        try{
            if(from==ch.length){
                return (new char[1]);
            }
            int j=0;
            char[] new_ch=new char[ch.length-from];
            for(int i=from;i<ch.length;i++){
                System.out.println(i);
                new_ch[j]=ch[i];
                j++;
            }
             return new_ch;
        }catch(Exception e){
            System.out.println(e);
        }
        return ch;
    }*/
    
}
