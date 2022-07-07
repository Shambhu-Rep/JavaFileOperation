package com.file;

import java.io.File;
import java.io.IOException;

public class CreateFiles {

	public static void main(String[] args) {
		try {
			File file = new File(System.getProperty ("user.dir")+"\\FileOperations\\CreatFileNew1.txt");
			if (file.createNewFile()) {
				System.out.println("File " + file.getName() + " is created successfully.");
			} else {
				System.out.println("File is already exist in the directory.");
			}
		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred.");
			exception.printStackTrace();
		}

	}

}
