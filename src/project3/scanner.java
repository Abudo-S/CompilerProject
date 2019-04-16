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
    private static char[] str;
    private token tok;
    
    public scanner(char[] str){
       scanner.str = str;
       setTok(new token());
    }
    
    public static char[] getStr() {
		return str;
	}
	public static void setStr(char[] str) {
		scanner.str = str;
	}

	public token getTok() {
		return tok;
	}
	public void setTok(token tok) {
		this.tok = tok;
	}

	public boolean match(char[] str) {
		int index = 0;
		
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
				if(str[index++] == 's')
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
			
		default:
			return false;
		}
		
		return true;
	}
	
}
