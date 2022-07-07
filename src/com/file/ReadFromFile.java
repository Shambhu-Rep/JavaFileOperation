package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String[] args) { 
		String dir = System.getProperty ("user.dir");
		System.out.println(dir);
        try {  
            // Create f1 object of the file to read data  
            File f1 = new File(System.getProperty ("user.dir")+"\\FileOperations\\CreatFileNew.txt");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  

}
