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
    private token tok;
    private chars operation;
    
    public scanner(char[] text){
       scanner.text = text;
       this.tok=new token();
       operation=new chars();
    }
    
       public static char[] gettext() {
               return text;
       }

       public token getTok() {
               return tok;
       }

	public boolean match(char[] str) {
           try{
                for(int index=0;index<str.length;index++){    
                    switch(str[index]) {
                    case '@':
                    case '^':
                            if(str[index++] == ' ')
                                    tok.add_token("Stat Symbol");
                            break;

                    case '$':
                    case '#':
                            if(str[index++] == ' ')
                                    tok.add_token("End Symbol");
                            break;

                    case 'T':
                            if(str[index++] == 'y')
                                    if(str[index++] == 'p')
                                            if(str[index++] == 'e')
                                                    if(str[index++] == ' ')
                                                            tok.add_token("Class");
                            break;

                    case 'I':
                            if(str[index++] == 'n') {
                                    if(str[index++] == 'f')
                                            if(str[index++] == 'e')
                                                    if(str[index++] == 'r')
                                                            if(str[index++] == ' ')
                                                                    tok.add_token("Inheritance");

                            } else if(str[index++] == 'f') {
                                    if(str[index++] == ' ')
                                            tok.add_token("Condition");

                            } else if(str[index++] == 'p') {
                                    if(str[index++] == 'o')
                                            if(str[index++] == 'k')
                                                    if(str[index++] == ' ') {
                                                            tok.add_token("Integer");

                                                    } else if(str[index++] == 'f') {
                                                            if(str[index++] == ' ')
                                                                    tok.add_token("Float");
                                                    }
                            }
                            break;

                    case 'S':
                            if(str[index++] == 'e') {
                                    if(str[index++] == 'q')
                                            if(str[index++] == 'u')
                                                    if(str[index++] == 'e')
                                                            if(str[index++] == 'n')
                                                                    if(str[index++] == 'c')
                                                                            if(str[index++] == 'e')
                                                                                    if(str[index++] == ' ')
                                                                                            tok.add_token("String");

                            } else if(str[index++] == 'r') {
                                    if(str[index++] == 'a')
                                            if(str[index++] == 'p')
                                                    if(str[index++] == ' ')
                                                            tok.add_token("Struct");

                            } else if(str[index++] == 'c') {
                                    if(str[index++] == 'a')
                                            if(str[index++] == 'n')
                                                    if(str[index++] == ' ')
                                                            tok.add_token("Switch");

                            } else if(str[index++] == 'i') {
                                    if(str[index++] == 'p')
                                            if(str[index++] == 'o')
                                                    if(str[index++] == 'k')
                                                            if(str[index++] == ' ') {
                                                                    tok.add_token("SInteger");

                                                            } else if(str[index++] == 'f') {
                                                                    if(str[index++] == ' ')
                                                                            tok.add_token("SFloat");
                                                            }
                            }
                            break;

                    case 'C':
                            if(str[index++] == 'r') {
                                    if(str[index++] == 'a')
                                            if(str[index++] == 'f')
                                                    if(str[index++] == ' ')
                                                            tok.add_token("Character");

                            } else if(str[index++] == 'o') {
                                    if(str[index++] == 'n')
                                            if(str[index++] == 'd')
                                                    if(str[index++] == 'i')
                                                            if(str[index++] == 't')
                                                                    if(str[index++] == 'i')
                                                                            if(str[index++] == 'o')
                                                                                    if(str[index++] == 'n')
                                                                                            if(str[index++] == 'o')
                                                                                                    if(str[index++] == 'f')
                                                                                                            if(str[index++] == ' ')
                                                                                                                    tok.add_token("Switch");
                            }
                            break;

                    case 'V':
                            if(str[index++] == 'a')
                                    if(str[index++] == 'l')
                                            if(str[index++] == 'u')
                                                    if(str[index++] == 'e')
                                                            if(str[index++] == 'l')
                                                                    if(str[index++] == 'e')
                                                                            if(str[index++] == 's')
                                                                                    if(str[index++] == 's')
                                                                                            if(str[index++] == ' ')
                                                                                                    tok.add_token("Void");
                            break;

                    case 'R':
                            if(str[index++] == 'a') {
                                    if(str[index++] == 't')
                                            if(str[index++] == 'i')
                                                    if(str[index++] == 'o')
                                                            if(str[index++] == 'n')
                                                                    if(str[index++] == 'a')
                                                                            if(str[index++] == 'l')
                                                                                    if(str[index++] == ' ')
                                                                                            tok.add_token("Boolean");

                            } else if(str[index++] == 'e') {
                                    if(str[index++] == 's'){
                                            if(str[index++] == 'p')
                                                    if(str[index++] == 'o')
                                                            if(str[index++] == 'n')
                                                                    if(str[index++] == 'd')
                                                                            if(str[index++] == 'w')
                                                                                    if(str[index++] == 'i')
                                                                                            if(str[index++] == 't')
                                                                                                    if(str[index++] == 'h')
                                                                                                            if(str[index++] == ' ')
                                                                                                                    tok.add_token("Return");
                                    } else if(str[index++]=='q'){
                                             if(str[index++]=='u')
                                                    if(str[index++]=='i')
                                                            if(str[index++]=='r')
                                                                    if(str[index++]=='e')
                                                                        if(str[index++] == ' ')
                                                                                tok.add_token("Inclusion");
                                    }
                            }
                            break;

                    case 'E':
                            if(str[index++] == 'l') {
                                    if(str[index++] == 's')
                                            if(str[index++] == 'e')
                                                    if(str[index++] == ' ')
                                                            tok.add_token("Condition");

                            } else if(str[index++] == 'n') {
                                    if(str[index++] == 'd')
                                            if(str[index++] == 't')
                                                    if(str[index++] == 'h')
                                                            if(str[index++] == 'i')
                                                                    if(str[index++] == 's')
                                                                            if(str[index++] == ' ')
                                                                                    tok.add_token("Break");
                            }
                            break;
                    case 'H':
                            if(str[index++]=='o'){
                                    if(str[index++]=='w')
                                            if(str[index++]=='e')
                                                    if(str[index++]=='v')
                                                            if(str[index++]=='e')
                                                                    if(str[index++]=='r')
                                                                            tok.add_token("Loop");
                            }
                            break;
                    case 'W':
                            if(str[index++]=='h')
                                    if(str[index++]=='e')
                                            if(str[index++]=='n')
                                                    tok.add_token("Loop");
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
                            if(str[index++]=='&')
                                    tok.add_token("Logic operators");
                            break;
                    case '|':
                            if(str[index++]=='|')
                                    tok.add_token("Logic operators"); 
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
                }
           }catch(Exception e){
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
        int index=i;
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
    }
     
    public void apply_matching(){
        char[] word=new char[50];
        int counter=0;
        for(int i=0;i<text.length;i++){
            if(text[i]=='\n'||text[i]==' '){
                match(operation.make_char_to_space(word));
                counter=0;
                word=new char[50];
            }
            word[counter]=text[i];
        }
    }
    
   
}
