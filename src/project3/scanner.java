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
<<<<<<< HEAD
    private static char[] str;
    public static int index;
    
    public scanner(char[] str){
        scanner.setStr(str);
=======
    private static char[] text;
    private token tok;
    
    public scanner(char[] text){
       scanner.text=text;
       tok=new token();
>>>>>>> b42ed9d77ea6c365d1a99ada0d966cc925ab6ef0
    }
    
    public static char[] getStr() {
		return str;
	}

	public static void setStr(char[] str) {
		scanner.str = str;
	}

	
	
//	public boolean matchStart(char[] str, int index) {
//		switch( str[index] ) {
//		case '@':
//		case '^':
//			if( matchClassDeclaration(str, index++) )
//				if( matchEnd(str) )
//					return true;
//			break;
//		default:
//			return false;
//		}
//		return false;
//	}
//	
//	public boolean matchClassDeclaration(char[] str, int index) {
//		switch( str[index] ) {
//		case 'T':
//			if(str[index++] == 'y')
//				if(str[index++] == 'p')
//					if(str[index++] == 'e')
//						if( matchID(str, index) )
//			break;
//		default:
//			return false;
//		}
//		return false;
//	}
//	
//	public boolean matchID(char[] str, int index) {
//		if(str[index] >= 65 && str[index] <=122 ) {
//			while(str[index] != ' ') {
//				index++;
//			}
//			return true;
//		}
//		return false;
//	}
//	
//	public boolean matchEnd(char[] str) {
//		switch(str[-1]) { // -1 will be replaced with the index
//		case '$':
//		case '#':
//			return true;
//		default:
//			return false;
//		}
//	}

}
