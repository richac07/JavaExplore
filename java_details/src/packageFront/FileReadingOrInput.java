package packageFront;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReadingOrInput {

	public static void main(String[] args) throws Exception{
	    
		//Read File
		FileReader fr= new FileReader("/Users/i331396/eclipse-workspace/projectBasic/src/packageFront/message.txt");
		int i;
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}

		//USING BUFFERED READER"
		System.out.print('\n'+"USING BUFFEREDREADER" +'\n');
		BufferedReader bf= new BufferedReader(new FileReader("/Users/i331396/eclipse-workspace/projectBasic/src/packageFront/message.txt"));
		String s;
		while((s=bf.readLine())!=null) {
			System.out.println(s);
		}
		
		


		//USING BUFFERED READER FOR scanning String input
		System.out.print('\n'+"USING BUFFEREDREADER for user input" +'\n');
		ArrayList<String> ar= new ArrayList<>();
		BufferedReader bf1= new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=bf1.readLine())!=null) {
			ar.add(str);
		}
		ar.stream().forEach(System.out::println);

		System.out.println("Testing ARRAYLIST");
		for(String ss: ar) {
			System.out.println(ss);
		//	System.out.println(ar.get(i));
			System.out.println(ss.charAt(0));
			if(ss.charAt(0)!='T') {
				System.out.println("DIDNT MATCH");
			}
			else {
				System.out.println("MATCHED");
			}
			
		}
		System.out.println("Testing ARRAYLIST cOMPLETED ");
		//USING BUFFERED READER FOR scanning INT input
		System.out.print('\n'+"USING BUFFEREDREADER for user INT input" +'\n');
		ArrayList<Integer> ar1= new ArrayList<>();
		BufferedReader bf2= new BufferedReader(new InputStreamReader(System.in));
		String stt;
		while((stt=bf2.readLine())!=null) {
			ar1.add(Integer.parseInt(stt));

		}
		ar1.stream().forEach(System.out::println);


		//		// Input taken from user inside console and use CTRL+D to end the input in console
		//		System.out.print('\n'+"USING SCANNER for user input" +'\n');
		//		Scanner scanner = new Scanner(System.in);
		//		ArrayList<String> st= new ArrayList<>();
		//
		//		while(scanner.hasNextLine()) {
		//			st.add(scanner.nextLine());
		//		}
		//
		//		st.stream().forEach(System.out::println);
		
//		DB Connection
//		String DBuRL="http>//mdm.google.com";
//		String username="adn";
//		String password="hfhf";
	//	String query="select * from stu";
//		Connection con= DriverManager.getConnection(DBuRL, username, password);
//		Statement stmt= con.createStatement();
//		ResultSet res=stmt.executeQuery(query);
		
		//Assert.assertEquals()

	}

}
