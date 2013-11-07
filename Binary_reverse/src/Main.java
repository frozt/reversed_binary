import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static int num=0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readInteger();
		System.out.print(reverseBinary(num));
	}

	private static int reverseBinary(int num) {
		// TODO Auto-generated method stub
		String temp="";
		String bin = Integer.toBinaryString(num);
		for(int i=bin.length() -1 ; i >= 0; i--)
		{
			temp  = temp + bin.charAt(i);
		}
		return Integer.parseInt(temp,2);
	}

	private static void readInteger()
	{
		String input = null;	
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			input=br.readLine();
		
		} catch(IOException io){
			io.printStackTrace();
		}
		try{
			  num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			  readInteger();
			}
	}
}
