package fr.exia;
abstractimport java.io.*; 

public class TxtReader {
	// pass the path to the file as a parameter 
    FileReader fr = 
      new FileReader("C:\\Users\\lanto\\Desktop\\ui.txt"); 
  
    int i; 
    while ((i=fr.read()) != -1) 
      System.out.print((char) i); 
}
