package packageFront;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
//	public static void anounceTeaTime() {
//	System.out.print("wait for it");
//	
//	}

	public static double salaryCalculator(double noOfHoursInWeek, double moneyPerHour ) {
		double salary= noOfHoursInWeek  * moneyPerHour *52 ;
		return salary;
	}
	
	public static void main(String[] args) throws IOException {
		
//		//Version COmpare
//	    String version1 = "1.010";
//        String version2 = "1.001";
// 
//        if (CompareVersion.versionCompare(version1, version2) < 0)
//            System.out.println(version1 + " is smaller");
//        else if (CompareVersion.versionCompare(version1, version2) > 0)
//            System.out.println(version2 + " is smaller");
//        else
//            System.out.println("Both version are equal");
		
		// Add String values
		//Scanner input = new Scanner (System.in);
//		String str = "Hello Cat";
//		
//		System.out.println("New String is: " + ReplaceStringSpace.addString(str));
		
		
		// FIBONACCI//
//		Scanner input= new Scanner (System.in);
//		int number = input.nextInt();		
//		for(int i=0; i<number; i++) {
//			System.out.print(Fibonacci.fib(i) + " ");
//		}
//        
//		System.out.println("Hello world!!! whats Up");
//		double studentGPA= 3.5;
//		String studentName="Richa";
//		String lastName = "Chamoli";
//		System.out.println(studentName + " " + lastName);
//		System.out.println("The Initials of Student is " + studentName.charAt(0) + "." + lastName.charAt(0));
//		
//		// Take the Input from the user
//		System.out.println("Whats your GPA");
//		Scanner input= new Scanner (System.in);
//		studentGPA = input.nextDouble();
//		System.out.println(studentName + " " + "has the GPA of " + studentGPA);
//		
//		// If condition
//		
//		System.out.println("Select a numnber from 1 to 10 and know your future");
//		Scanner input1= new Scanner (System.in);
//		int pickedNo = input1.nextInt();
//		if(pickedNo <= 5) {
//			System.out.println(" Have a nice shopping Day");
//			
//		}
//		else {
//			
//		System.out.println(" Have a nice Day with Friends");
//		}
//		
//		// Multiple choice question Input
//		String sampleQuestion= "What is the extension of Java  file";
//		
//		
//		System.out.println("Please select a,b or c option to choose the correct answer ");
//		System.out.println(sampleQuestion);
//		System.out.println("a. Java");
//		System.out.println("b. Class");
//		System.out.println("c. Jar");
//		
//		Scanner inputChoice = new Scanner(System.in);
//      String inputValue= inputChoice.next();
//		inputValue= inputValue.toLowerCase();
//		if (inputValue.equals("a")) {
//			System.out.println("Congratulations!! Java is the correct answer");
//			
//		}
//		else {
//			System.out.println("Sorry the correct answer is Java");
//		}
		
		//anounceTeaTime();
//		double exponential= Math.pow(2, 5);
//		System.out.println(exponential);
		
//		Triangle triangleA = new Triangle(3,3,3);
//		Triangle triangleB = new Triangle(3,2,1);
//		
//		// call an instance method
//		double areaA= triangleA.findArea();
//		double areaB= triangleB.findArea();
//		System.out.println("The Area of triangleA is " + " " + areaA);
//		System.out.println("The Area of triangleB is " + " " + areaB);
//		
//		//Call a Static Variable
//		System.out.println(Triangle.noOfSide);
//		//Call an instance Variable
//		System.out.println(triangleA.base);
		
		
//		StudentProfile stu1 = new StudentProfile("Richa","Chamoli",2015, 9, "CSE");
//		StudentProfile stu2 = new StudentProfile("ABC","Sh",2015, 3, "CSE");
//		
//		int gradYear1= stu1.incrementalGradYear();
//		int gradYear2= stu2.incrementalGradYear();
//		
//		System.out.println(stu1.firstname + stu1.lastName + " " + "is getting graduated in year "+ " " + gradYear1 + " " + "in the Stream" + " "+ stu1.declareGraduated );
//		System.out.println(stu2.firstname + stu2.lastName + " " + "is getting graduated in year "+ " " + gradYear2 + " " + "in the Stream" + " "+ stu2.declareGraduated );

//		// Return Values
//		BankAccount c1 = new BankAccount("Richa Chamoli", 10000);
//		BankAccount c2 = new BankAccount("John Cena", 10000);
//		c1.depositMoney(1000);
//		System.out.println("Normal Balance" + c1.getBalance());
//		c1.withdrawMoney(200);
//		
//		c2.withdrawMoney(5000);
//		System.out.println("Balance After Withdrawal Not changing - " + c1.getBalance());
//		System.out.println("Please enter the amount to be deposit");
//		Scanner input = new Scanner(System.in);
//		double amt = input.nextDouble();
//		double balAmt= c2.justDeposit(amt);
//		System.out.println(c2.getowner() + " " + "- Your latest balance is " +  " "+ c2.getBalance() );
		
//		
//		//Inheritance
//		InhertianceExample listy= new InhertianceExample();
//		listy.add(0);
//		listy.add(10);
//		listy.add(20);
//		listy.add(30);
//		
//		System.out.println(listy.getmodValue(1));
//		System.out.println(listy.getmodValue(-2));
//		System.out.println(listy.getmodValue(40));
		
//		// Pollymorphism: PolymExample2, PhoneNumber
		
//		PolymExample2 contactOne = new PolymExample2("Sally", new PhoneNumber("2637263737"));
//		PolymExample2 contactTwo = new PolymExample2("Maggie Smith",new PhoneNumber(41, "9384713401"));
//		PolymExample2 contactThree = new PolymExample2("Roger Williams",new PhoneNumber("448474734929"));
//		PolymExample2 contactFour = new PolymExample2("David Jones", "david_jones@bluewire.com");
//		PolymExample2 contactFive = new PolymExample2("Sarah Brown",new PhoneNumber("2029384982"), "sarahb@tech.com");
//		
//
//        System.out.println(contactOne);
//        System.out.println(contactTwo);
//        System.out.println(contactThree);
//        System.out.println(contactFour);
//        System.out.println(contactFive);
		
//		//Abstract class: AbstractFileReader, DidgitalOnlyFileReader, message.txt
		
//		DigitalOnlyfileReader digitalReader = new DigitalOnlyfileReader("/Users/i331396/eclipse-workspace/learningJava/src/learningJava/message.txt");
//		System.out.println("Digital File Read " + digitalReader.readFile());
//		System.out.println("Digital File Read " + digitalReader.getPath());
		
		//Interface class: InterfaceEvent, PAsswordChangeEvent
		
//		PasswordChangeEvent e1 = new PasswordChangeEvent("1234d4");
//		e1.process();

//		// Second largest number
//	int[] a= {2,5,3,4,6};
//	int[] b = {7,23,6,5,1,9,4};
//	int[] c= {1};
//	
//
//	SecondLargestNumberArray.secondLargest(b);
//	int value= SecondLargestNumberArray.secondLargestDirect(b);
//	System.out.println("second largest of second array is " + value);
	
	// Unique Character
//		String myString= "My name is Richa, Chamoli";
//		String checkString ="MynameisRichaChamoli";
		String uVal= "ab cde fghij,klmnopqrstuvwxyz";
//		UniqueStringCharacter.uniqueChar(checkString);
//		
		//boolean val= UniqueStringCharacter.uniqueChar(checkString);
//		boolean val= UniqueStringCharacter.uniqueChar(uVal);
//		System.out.println(val);
//	    if (val) {
//	    	System.out.println("UNIQUE STRING");
//	    }
//	    else {
//	    	System.out.println("NOT UNIQUE STRING");
//	    }

		//Egypt and allien problem in one
		Scanner scanner = new Scanner(System.in);
        int i=0;
        while (scanner.hasNextLine()){
             i++;
            String inputCase = scanner.nextLine();
            String[] parts = inputCase.split(" ");
            //String res = EyptProblem.convert(parts[0], parts[1], parts[2]);
           //if(parts.length ==3) {
            String res = AllienLanguage.sourceToTarget(parts[0], parts[1], parts[2]);
            System.out.println("Case #" + i+ ": " + res);
           //}
            
        }
        scanner.close();
     }
		
		
		 // max subArray Sum Mod
//	    int[] arr = { 3, 3, 9, 9, 5 };
//	    int n = 5;
//	    int m = 7;
//		int[] arr = {1,2,3};
//		int n=3;
//		int m =2;
//	    System.out.print(maxSumSubArrayMod.maxSubarray(arr, n, m));
//		
//			    int M[][] = {{0, 1, 1, 0, 1},
//			                 {1, 1, 0, 1, 0},
//			                 {0, 1, 1, 1, 0},
//			                 {1, 1, 1, 1, 0},
//			                 {1, 1, 1, 1, 1},
//			                 {0, 0, 0, 0, 0}};
//			 
//			    Sol.printMaxSubSquare(M);
//			 
//			  
//			}
		
		// Closest/ Minimum WORD COUNT BETWEEN 2 numbers
//		Scanner in = new Scanner(System.in);
//		String s = in.nextLine();
//		String s1= in.nextLine();
//		String s2 = in.nextLine();
//		
//		int index1 = -1;
//		int index2 = -1;
//		int distance=Integer.MAX_VALUE;
//		int answer = Integer.MAX_VALUE;
//		
//		String[] str = s.split(" ");
//
//		for (String a : str)
//	        System.out.println(a);
//	
//	
//	    for(int i=0;i< str.length;i++) {
//	    	 if(str[i].equals(s1)) {
//	    		 index1=i;
//	    	 }
//	    	 if(str[i].equals(s2)) {
//	    		 index2=i;
//	    	 }
//	    	 if(index1!= -1 && index2!= -1) {
//	    		 distance=Math.abs(index1- index2);
//	    	 }
//	    	 if(answer >distance) {
//	    		 answer = distance;
//	    	 }
//	    }
//	    if (answer == Integer.MAX_VALUE) {
//	    	System.out.println("Word count not eligible");
//	    }
//	    else {
//	    	System.out.println("Word Count : " + answer);
//	    	
//	    	 }
    //REVERSE STRING
//		String s= "I work at ABC";
//		System.out.println("For the INPUT value: " + s);
//		System.out.println("Output is: " + ReverseWordInString.reverseWord(s));
//		System.out.println("Output2 is: " + ReverseWordInString.reversewholeString(s));
//		System.out.println("Output2 is: " + ReverseWordInString.reverseCharWord(s));
	
		
		// Max Palindrome
//		String str= "thiisiit";
//		
//		System.out.println("Max Palin is: " + MaxPalindromeString.lps(str,0,str.length()-1));
		
		// PRODUCT of other numbers in an array
//		int[] arr = {2,3,4};
//		SingleArrayMultiplicationOtherNumbers.multipleArray(arr);
		
		//MERGE SORT
//		int[] arr1 = {2,3,4,5};
//		int[] arr2 = {1,6,7,9,15,20,56};
//		MergeSortImplementation.mergeSort(arr1, arr2);
		

}

	
	
		
		
	    

