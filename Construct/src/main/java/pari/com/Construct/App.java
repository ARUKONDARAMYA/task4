package pari.com.Construct;


	import java.util.*;
	import java.io.PrintStream;
	import java.io.FileDescriptor;
	import java.io.FileOutputStream;
	import java.io.IOException;
	abstract class Construct extends javafx.application.Application{
	static{
	PrintStream my=new PrintStream(new FileOutputStream(FileDescriptor.out));
	Scanner sc=new  Scanner(System.in);
	my.print("Enter materialtype\n");
	String materialtype=sc.nextLine();
	int cost;
	my.print("Enter totalareaofhouse\n");
	int totalareaofhouse=sc.nextInt();
	my.print("Enter full automated home or not\n");
	String answer=sc.next();
	if("standard".equals(materialtype)){
	cost=1200*totalareaofhouse;
	   my.print(cost);
	}
	else if("above standard".equals(materialtype)){
	cost=1500*totalareaofhouse;
	   my.print(cost);
	}
	else if("high standard".equals(materialtype)){
	  if("yes".equals(answer)){
	    cost=2500*totalareaofhouse;
	   my.print(cost);
	         }
	   else{
	   cost=1800*totalareaofhouse;
	   my.print(cost);
	       }
	 }
	else{
	my.print("Enter correct type of material standards");
	}
	System.exit(0);
	}
	}
 

