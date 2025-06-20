package com.test.pratice.constants;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.nio.file.Path;


import io.jsonwebtoken.io.Encoders;

public class base64Encoder {
	
	public static void main(String arg[]) throws IOException {
		
		String path = "C:/Users/2728579/Desktop/base64";
		List<String> temp = new ArrayList<>();
		List<String> filname = new ArrayList<>();
		Path pat = Paths.get(path); 
		
		try(DirectoryStream<Path> DIC = Files.newDirectoryStream(pat)){
			
		
		for(Path file : DIC) {
		filname.add(file.getFileName().toString());
		File  output = new File(path+"/"+file.getFileName());
		
		
		
		byte[] value = Files.readAllBytes(output.toPath());
		
		String convert = Encoders.BASE64.encode(value);
		
		   temp.add(convert);
		
	       System.out.println(file.getFileName());
		   
		}
		}
		
		File myfile = new File("C:/Users/2728579/Downloads/MyFile.txt");
		
		if(myfile.createNewFile()) {
			
			System.out.println("the file created");
		}
		else {
			
			System.out.println("the file not created");
		}
		
		BufferedWriter writer = new BufferedWriter(new  FileWriter(myfile));
		
		int count=0;
		
		for(String val : temp) {
			
			writer.write(filname.get(count)+":"+val);
			writer.newLine();
			
		
			count++;
		} 
		  
		writer.close();
	    
	}

}
