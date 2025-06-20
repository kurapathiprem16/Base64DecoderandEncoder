package com.test.pratice.constants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;

public class base64Decoder  {
	
	public static void main(String arg[]) throws IOException {

	
    String path = "C:/Users/2728579/Downloads/MyFile.txt";
    
  
    
    BufferedReader read = new BufferedReader(new FileReader(path));
   
    List<String> temp = new ArrayList<>();
    List<String> filename = new ArrayList<>();
     String line;
     while((line=read.readLine()) != null) {
    	
    
    		
    		temp.add(line.substring(line.indexOf(':')+1,line.length()));
    		filename.add(line.substring(0,line.indexOf(':')));

    		System.out.println(line);
    		//System.out.println(read.readLine());
    	
    
    }
    System.out.println(temp.size());
    int count=0;
    for(String val : temp) {
    	
    	byte[] byt =Decoders.BASE64.decode(val);
    	
         FileOutputStream fout = new FileOutputStream("C:/Users/2728579/Documents/Base64Decode/"+filename.get(count));
         
         fout.write(byt);
         
         count++;
    	
    }
    
    

    
	}

}
