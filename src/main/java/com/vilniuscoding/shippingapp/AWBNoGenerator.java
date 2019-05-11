package com.vilniuscoding.shippingapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class AWBNoGenerator {
	
	String prefix = "EXPS-";
	
	public int awbGenerator() {
		
		int random = 10000 + new Random().nextInt(90000);
		System.out.println(prefix+random);
		return random;
	}
	
	public void awbPrint() {
		
		File file = new File("C:\\Users\\Tom\\eclipse-workspace\\IO files\\AWB.txt");
		FileWriter fileWriter = null;
		
		BufferedWriter dataWriter = null;
		String inputLine;
		// Get All objects data
		inputLine = "kazkas";
		
				try{
		            fileWriter = new FileWriter(file);
		            dataWriter = new BufferedWriter(fileWriter);
		            
		            int lineAmount = 2;
		            
		            for(int i = 0; i < lineAmount; i++){
		            	fileWriter.write("some text " + i);
		            	fileWriter.write(System.getProperty("line.separator"));
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }finally{
		            try {
		            	dataWriter.close();
		                fileWriter.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
	}
	
	

}
