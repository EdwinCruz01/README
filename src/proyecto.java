import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;



class A {
		
		static int x;
	    final int y = 300  ;
	}



public class proyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		A b= new A();
		a.x=100;
		
		System.out.println(a.x);
		
		
		
		
		File f;
		f= new File ("ARCHIVO");
		try{
			FileWriter w= new FileWriter(f);
			BufferedWriter br = new BufferedWriter (w);
			PrintWriter wr = new PrintWriter (br);
	        wr.write("ESCRIBIENDO ARCHIVO");
	        wr.append("Escribiendo nuevo archivo ");
	        wr.close();
	        br.close();
		} 

		catch (Exception e){};
		

	try {
		FileReader r= new FileReader(f);
		 BufferedReader br= new BufferedReader(r);
		String linea;
		while ((linea= br.readLine())!=null)
	    System.out.println(linea);

	}

	catch (Exception e){};


	}
	


	}


