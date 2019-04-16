/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class FileReader {  
	private String Text;
	
	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}
	
	public FileReader(){
        
    }
    
    public void read(String FilePath) throws FileNotFoundException{
    	File file = new File(FilePath); 
    	Scanner sc = new Scanner(file); 
    	
    	
    	sc.close();
    }
}
