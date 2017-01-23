package Geonsik;

public class dictionary {
	   public static void main(String[] args){

	      String[] words = {"funk","chunk","furry","baconantor"};

	      for (String w :words){
	         if(w.startsWith("fu"))
	            System.out.println(w + " starts with fu");
	      }
	      
	      for (String w :words){
		         if(w.endsWith("nk"))
		            System.out.println(w + " ends with nk");
		      }
	   }
	}
