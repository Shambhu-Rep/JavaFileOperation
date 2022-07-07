package com.file;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class FileOperation {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\");
		/*System.out.println(file.mkdir());
		boolean b = file.createNewFile();
		System.out.println(b);
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		
		System.out.println(file.isHidden());
		System.out.println(file.isFile());
		*/
		
		//to print all folder list
		String[] list = file.list();
		System.out.println(list.length);
		for (String x : list) {
			System.out.println(x);
		}
		
		//To print all foolder path
		System.out.println();
		File[] files = file.listFiles();
		for (File x : files) {
			System.out.println(x);
		}
		/*List<String> readLines = FileUtils.readLines(file);
		String s = readLines.get(0);
		System.out.println(s);
		for (int i = 0; i < readLines.size(); i++) {
			String s1 = readLines.get(i);
			System.out.println(s1);
		}
		for (String x : readLines) {
			System.out.println(x);
		}
		FileUtils.write(file, "\nhi greend technology",true);
		
		String str = FileUtils.readFileToString(file);
		System.out.println(str);
		File des = new File("E:\\File_Operations\\Java\\kk.txt");
		FileUtils.copyFile(file, des);*/
	}

}
