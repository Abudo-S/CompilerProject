/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import com.sun.istack.internal.Nullable;

/**
 *
 * @author Dell
 */
//No built_in methods

/*
 * array of char[] from dashboard
 * remove comment (use stack)
 * remove more than one line
 * remove more than one space || tap
 * */
public class preprocessing {
	private char[] Code;
	
	public preprocessing(char[] Code){
		this.Code = Code;
	}
	
	/**
	 * 
	 * @return array after preprocessing 
	 */
	public String[] Processing(){
		int startIndex;
		int endIndex;
		if (this.Code.length > 0) {
			int ArrayLength= this.Code.length;
			for (int i = 0;i<ArrayLength || this.Code[i] != '#' || this.Code[i] != '$'; i++) {
				if (this.Code[i] == '@'|| this.Code[i] == '^') {
					for (int j = i+1;j<Code.length; j++) {
						if (this.Code[j] == '*' && this.Code[j+1] == '*' && this.Code[j+2] == '*') {
							startIndex = j;
							for(int x = j;x < this.Code.length; x++){
								if(this.Code[x] == '\n'){
									endIndex = x;
									removeFromArray(startIndex, endIndex);
									ArrayLength = this.Code.length;
									j=startIndex;
									break;
								}
							}
						}else if (this.Code[j] == '\n' && this.Code[j+1] == '\n') {
							startIndex = j;
							removeFromArray(startIndex,0);
							ArrayLength = this.Code.length;
							j=startIndex;
						} else if(this.Code[j] == '\f' && this.Code[j+1] == '\f' || this.Code[j] == '\t' && this.Code[j+1] == '\t'){
							startIndex = j;
							removeFromArray(startIndex,0);
							ArrayLength = this.Code.length;
							j=startIndex;
						} else if (this.Code[j] == '/' && this.Code[j+1] == '$') {
							removeFromArray(j+1, getCommentIndex(j+1));
							ArrayLength = this.Code.length;
						}
					}
					break;
				}
			}
		}
		char[] returnedCode = this.Code;
		this.Code = new char[0];
		scanner sc=new scanner(returnedCode);
		return sc.apply_matching();
	}
	
	
	/**
	 * Remove elements from array by pass the two parameter.
	 * Remove one element from array by pass the first parameter 
	 * and second put it by zero.
	 * @param startIndex
	 * @param endIndex 
	 */
	private void removeFromArray(int startIndex,int endIndex){
		char[] anotherArray = new char[this.Code.length - 1];
		
        for (int i = 0, k = 0; i < this.Code.length; i++) {
        	if(endIndex != 0){
                if (i >= startIndex && i <= endIndex) 
                    continue;
        	}else if (i == startIndex){ 
                    continue;
        	}
              
            anotherArray[k++] = this.Code[i]; 
        }
        this.Code = anotherArray;
	}
	
	
	/**
	 * return the last index of the comment
	 * @param startIndex
	 * @return
	 */
	private int getCommentIndex(int startIndex){
		int commentCount = 0;
		for (int i = startIndex; i < this.Code.length; i++) {
			if(this.Code[i] == '$' && this.Code[i+1] == '/' && commentCount == 0){
				return i+1;
			}else if (this.Code[i] == '/' && this.Code[i] == '$') {
				commentCount++;
			}else if(this.Code[i] == '$' && this.Code[i+1] == '/' && commentCount != 0){
				commentCount--;
			}
		}
		return 0;
	}
	
}
