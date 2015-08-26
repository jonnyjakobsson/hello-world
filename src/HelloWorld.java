import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("What is your name?");
			name = bf.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	
		System.out.println("HelloWorld: " + name);
	}

}
