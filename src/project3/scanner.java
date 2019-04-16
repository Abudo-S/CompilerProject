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
public class scanner {
    private static char[] text;
    private static String[] msg;
    private token tok;
    private chars operation;
    private static int errors;
    private String[] IDs;
    private int count_IDs;
    
    public scanner(char[] text){
       scanner.text = text;
       this.tok=new token();
       this.operation=new chars();
       errors=0;
       this.IDs=new String[100];
       this.count_IDs=0;
    }
    
       public char[] gettext() {
               return text;
       }

       public token getTok() {
               return tok;
       }
       
       public int get_errors(){
           return errors;
       }

	public boolean match(char[] str) {
           try{
                int index=0;   
                switch(str[index]) {
                case '@':
                case '^':
                        if(str[index+1] == ' '){
                                index++;
                                tok.add_token("Stat Symbol");
                        }
                        
                        break;

                case '$':
                case '#':
                        if(str[index+1] == ' '){
                                index++;
                                tok.add_token("End Symbol");
                        }
                        break;

                case 'T':
                        if(str[index+1] == 'y'){
                            index++;
                                if(str[index+1] == 'p'){
                                    index++;
                                        if(str[index+1] == 'e'){
                                            index++;
                                                if(str[index+1] == ' '){
                                                    index++;
                                                         tok.add_token("Class");
                                                }
                                        }
                                                       
                                }
                        }        
                        break;

                case 'I':
                        if(str[index+1] == 'n') {
                                index++;
                                if(str[index+1] == 'f'){
                                    index++;
                                        if(str[index+1] == 'e'){
                                            index++;
                                                if(str[index+1] == 'r'){
                                                    index++;
                                                        if(str[index+1] == ' '){
                                                            index++;
                                                                tok.add_token("Inheritance");
                                                        }
                                                }
                                        }
                                }

                        } else if(str[index+1] == 'f') {
                                index++;
                                if(str[index+1] == ' '){
                                    index++;
                                        tok.add_token("Condition");
                                }

                        } else if(str[index+1] == 'p') {
                            index++;
                                if(str[index+1] == 'o'){
                                    index++;
                                        if(str[index+1] == 'k'){
                                            index++;
                                                if(str[index+1] == ' ') {
                                                    index++;
                                                        tok.add_token("Integer");

                                                } else if(str[index+1] == 'f') {
                                                    index++;
                                                        if(str[index+1] == ' ')
                                                            index++;
                                                                tok.add_token("Float");
                                                }
                                        }
                                }
                        }
                        break;

                case 'S':
                        if(str[index+1] == 'e') {
                            index++;
                                if(str[index+1] == 'q'){
                                    index++;
                                        if(str[index+1] == 'u'){
                                            index++;
                                                if(str[index+1] == 'e'){
                                                    index++;
                                                        if(str[index+1] == 'n'){
                                                            index++;
                                                                if(str[index+1] == 'c'){
                                                                    index++;
                                                                        if(str[index+1] == 'e'){
                                                                            index++;
                                                                                if(str[index+1] == ' '){
                                                                                    index++;
                                                                                        tok.add_token("String");
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }

                        } else if(str[index+1] == 'r') {
                            index++;
                                if(str[index+1] == 'a'){
                                    index++;
                                        if(str[index+1] == 'p'){
                                            index++;
                                                if(str[index+1] == ' '){
                                                    index++;
                                                        tok.add_token("Struct");
                                                }
                                        }
                                }

                        } else if(str[index+1] == 'c') {
                            index++;
                                if(str[index+1] == 'a'){
                                    index++;
                                        if(str[index+1] == 'n'){
                                            index++;
                                                if(str[index+1] == ' '){
                                                    index++;
                                                        tok.add_token("Switch");
                                                }
                                        }
                                }

                        } else if(str[index+1] == 'i') {
                                if(str[index+1] == 'p'){
                                    index++;
                                        if(str[index+1] == 'o'){
                                                if(str[index+1] == 'k'){
                                                    index++;
                                                        if(str[index+1] == ' ') {
                                                            index++;
                                                                tok.add_token("SInteger");

                                                        } else if(str[index+1] == 'f') {
                                                            index++;
                                                                if(str[index+1] == ' '){
                                                                    index++;
                                                                        tok.add_token("SFloat");
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                        break;

                case 'C':
                        if(str[index+1] == 'r') {
                            index++;
                                if(str[index+1] == 'a'){
                                    index++;
                                        if(str[index+1] == 'f'){
                                            index++;
                                                if(str[index+1] == ' '){
                                                    index++;
                                                        tok.add_token("Character");
                                                }
                                        }
                                }

                        } else if(str[index+1] == 'o') {
                            index++;
                                if(str[index+1] == 'n'){
                                    index++;
                                        if(str[index+1] == 'd'){
                                            index++;
                                                if(str[index+1] == 'i'){
                                                    index++;
                                                        if(str[index+1] == 't'){
                                                            index++;
                                                                if(str[index+1] == 'i'){
                                                                        if(str[index+1] == 'o'){
                                                                            index++;
                                                                                if(str[index+1] == 'n'){
                                                                                    index++;
                                                                                        if(str[index+1] == 'o'){
                                                                                            index++;
                                                                                                if(str[index+1] == 'f'){
                                                                                                    index++;
                                                                                                        if(str[index+1] == ' '){
                                                                                                            index++;
                                                                                                                tok.add_token("Switch");
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                        break;

                case 'V':
                        if(str[index+1] == 'a'){
                            index++;
                                if(str[index+1] == 'l'){
                                    index++;
                                        if(str[index+1] == 'u'){
                                            index++;
                                                if(str[index+1] == 'e'){
                                                    index++;
                                                        if(str[index+1] == 'l'){
                                                            index++;
                                                                if(str[index+1] == 'e'){
                                                                    index++;
                                                                        if(str[index+1] == 's'){
                                                                            index++;
                                                                                if(str[index+1] == 's'){
                                                                                    index++;
                                                                                        if(str[index+1] == ' '){
                                                                                            index++;
                                                                                                tok.add_token("Void");
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                        break;

                case 'R':
                        if(str[index+1] == 'a') {
                            index++;
                                if(str[index+1] == 't'){
                                    index++;
                                        if(str[index+1] == 'i'){
                                            index++;
                                                if(str[index+1] == 'o'){
                                                    index++;
                                                        if(str[index+1] == 'n'){
                                                            index++;
                                                                if(str[index+1] == 'a'){
                                                                    index++;
                                                                        if(str[index+1] == 'l'){
                                                                            index++;
                                                                                if(str[index+1] == ' '){
                                                                                    index++;
                                                                                        tok.add_token("Boolean");
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }

                        } else if(str[index+1] == 'e') {
                            index++;
                                if(str[index+1] == 's'){
                                    index++;
                                        if(str[index+1] == 'p'){
                                            index++;
                                                if(str[index+1] == 'o'){
                                                    index++;
                                                        if(str[index+1] == 'n'){
                                                            index++;
                                                                if(str[index+1] == 'd'){
                                                                    index++;
                                                                        if(str[index+1] == 'w'){
                                                                            index++;
                                                                                if(str[index+1] == 'i'){
                                                                                    index++;
                                                                                        if(str[index+1] == 't'){
                                                                                            index++;
                                                                                                if(str[index+1] == 'h'){
                                                                                                    index++;
                                                                                                        if(str[index+1] == ' '){
                                                                                                                tok.add_token("Return");
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                } else if(str[index+1]=='q'){
                                    index++;
                                         if(str[index+1]=='u'){
                                             index++;
                                                if(str[index+1]=='i'){
                                                    index++;
                                                        if(str[index+1]=='r'){
                                                            index++;
                                                                if(str[index+1]=='e'){
                                                                    index++;
                                                                    if(str[index+1] == ' '){
                                                                        index++;
                                                                            tok.add_token("Inclusion");
                                                                    }
                                                                }
                                                        }
                                                }
                                         }
                                }
                        }
                        break;

                case 'E':
                        if(str[index+1] == 'l') {
                            index++;
                                if(str[index+1] == 's'){
                                    index++;
                                        if(str[index+1] == 'e'){
                                            index++;
                                                if(str[index+1] == ' '){
                                                    index++;
                                                        tok.add_token("Condition");
                                                }
                                        }
                                }

                        } else if(str[index+1] == 'n') {
                            index++;
                                if(str[index+1] == 'd'){
                                    index++;
                                        if(str[index+1] == 't'){
                                            index++;
                                                if(str[index+1] == 'h'){
                                                    index++;
                                                        if(str[index+1] == 'i'){
                                                            index++;
                                                                if(str[index+1] == 's'){
                                                                    index++;
                                                                        if(str[index+1] == ' '){
                                                                            index++;
                                                                                tok.add_token("Break");
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                        break;
                case 'H':
                        if(str[index+1]=='o'){
                            index++;
                                if(str[index+1]=='w'){
                                    index++;
                                        if(str[index+1]=='e'){
                                            index++;
                                                if(str[index+1]=='v'){
                                                    index++;
                                                        if(str[index+1]=='e'){
                                                            index++;
                                                                if(str[index+1]=='r'){
                                                                    index++;
                                                                        tok.add_token("Loop");
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                        break;
                case 'W':
                        if(str[index+1]=='h'){
                            index++;
                                if(str[index+1]=='e'){
                                    index++;
                                        if(str[index+1]=='n'){
                                            index++;
                                                tok.add_token("Loop");
                                        }
                                }
                        }
                        break;
                case '+':
                case '/':
                case '*':
                        tok.add_token("Arithmetic Operation"); 
                        break;
                case '-':
                        if(str[index+1]=='>'){
                             index++;
                             tok.add_token("Arithmetic Operation");
                        }else
                             tok.add_token("Access Operator");
                        break;
                case '&':
                        if(str[index+1]=='&'){
                            index++;
                                tok.add_token("Logic operators");
                        }
                        break;
                case '|':
                        if(str[index++]=='|'){
                            index++;
                                tok.add_token("Logic operators"); 
                        }
                        break;
                case '~':
                        tok.add_token("Logic operators");
                        break;
                case '=':
                        if(str[index+1]=='='){
                            index++;
                            tok.add_token("relational operators");
                        }else{
                            index++;
                            tok.add_token("Assignment operator");
                        }
                        break;
                case '<':  
                        if(str[index+1]=='=')
                             index++;
                        tok.add_token("relational operators");
                        break;
                case '>':     
                        if(str[index+1]=='=')
                             index++; 
                        tok.add_token("relational operators");
                        break;
                case '!':
                        if(str[index+1]=='='){
                                index++;
                                tok.add_token("relational operators");
                        }
                        break;
                case '{':
                case '}':
                case '[':
                case ']':
                        tok.add_token("Braces");
                        break;
                case '"':
                case ',':
                case '\'':    
                        tok.add_token("Quotation Mark");
                        break;
                case '(':
                        tok.add_token("(");
                        break;
                case ')':
                        tok.add_token(")");
                        break;

                default:
                        int i=match_number(str, index);
                        if(i==index){
                            i=match_ID(str,index);
                        }
                        if(i!=index){
                            return true;
                        }
                        return false;
                }                   
                
           }catch(Exception e){
                int i=match_number(str, 0);
                if(i==0){
                    i=match_ID(str,0);
                }
                if(i!=0){
                    return true;
                }
               return false;
           }
		
		return true;
	}
	 
    public int match_number(char[] ch,int i){
        int index=i;
        for(int j=i;j<ch.length;j++){
            if(ch[j]<'0'&&ch[j]>'9'){
               index=j;
               this.tok.add_token("Constant");
               break;
            }
        }
        return index;
    }
    
     public int match_ID(char[] ch,int i){
         String str="";
        int index=i;
        if(ch[i]==' '){
            i++;
        }
        if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){ 
            for(int j=i;j<ch.length;j++){
                str+=ch[i];
                if(ch[j]==' '||ch[j]=='('||ch[j]=='{'){
                    this.IDs[this.count_IDs++]=str;
                    index=j;
                    this.tok.add_token("ID");
                    break;
                }
            }
        }
        return index;
    }
     
    public String[] apply_matching(){
        char[] word=new char[50];
        int counter=0,line=1;
        boolean bool;
        for(int i=0;i<text.length;i++){
            if(text[i]=='\n'||text[i]==' '){
                if(text[i]=='\n')
                    line++;
                
                bool=match(operation.make_char_to_space(word));
                if(bool){
                    msg[tok.size()-1]="Line#: "+tok.size()+" Token Text: "+this.operation.convert_to_String(word)+" Token Type: "+tok.peek();
                }else{
                    msg[tok.size()-1]="Line#: "+tok.size()+"Error in Token Text: "+this.operation.convert_to_String(word);
                    this.errors++;
                }
                counter=0;
                word=new char[50];
            }
            word[counter]=text[i];
        }
        return scanner.msg;
    }
     
}
