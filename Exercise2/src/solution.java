import java.util.Scanner;
public class solution {

		public static void main(String[] String) {
			Scanner input = new Scanner(System.in);
			
	    printExercise1();
	    printExercise2();
	    printExercise3();
	    printExercise4();
	    printExercise5();
	    printExercise6();
	    printExercise7();
	    printExercise8();
	    printExercise9();
	    printExercise10();
			
		}
		
	        public static void printExercise1() {
	        	Scanner input = new Scanner(System.in);
	        	System.out.println("Exercise1");
				System.out.print("Input your first name: ");
			    String fname = input.next();
			    System.out.print("Input your last name: ");
			    String lname = input.next();
			    System.out.println();
			    System.out.println("Hello \n"+fname+" "+lname);
			    System.out.println();
			    
	        }
	        
	        public static void printExercise2() {
	        	Scanner input = new Scanner(System.in);
	        	 System.out.println("Exercise2");
	 		    System.out.print("Input the first number: ");
	 		    int num1 = input.nextInt();
	 		    System.out.print("Input the second number: ");
	 		    int num2 = input.nextInt();
	 		    int sum = num1 + num2;
	 		    System.out.println();
	 		    System.out.println("Sum: "+sum);
	 		    System.out.println();
	 		    
	        }
	        
	        public static void printExercise3() {
	        	Scanner input = new Scanner(System.in);
	        	System.out.println("Exercise3");
			    System.out.print("Input the first number: ");
			    int a = input.nextInt();
			    System.out.print("Input the second number: ");
			    int b = input.nextInt();
			    int d = (a/b);
			    System.out.println();
			    System.out.println("The division of a and b is:" +d);
			    System.out.println();
			    
	        }
	        
	        public static void printExercise4() {
	        	Scanner input = new Scanner(System.in);
	        	System.out.println("Exercise4");
	 		    int w = -5 + 8 * 6;
	 		    int x = (55 + 9) % 9;
	 		    int y = 20 + (-3 * 5 / 8);
	 		    int z = 5 + 15 / 3 * 2 - 8 % 3;

	 		    System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
	 		    System.out.println();
	 		    
	        }
	        
	        public static void printExercise5() {
	        	Scanner input = new Scanner(System.in);
	        	System.out.println("Exercise5");
			    System.out.print("Input first number: ");
			    int numb1 = input.nextInt();
			     
			    System.out.print("Input second number: ");
			    int numb2 = input.nextInt();
			     
			    System.out.println(numb1 + " x " + numb2 + " = " + numb1 * numb2);
			    System.out.println();
			    
	        }
	        
	        public static void printExercise6() {
	            Scanner input = new Scanner(System.in);
	            System.out.println("Exercise6");
			    System.out.print("Input first number: ");
			    int no1 = input.nextInt();
			     
			    System.out.print("Input second number: ");
			    int no2 = input.nextInt();
			     
			   
			    System.out.println(no1 + " + " + no2 + " = " + 
			    (no1 + no2));
			     
			    System.out.println(no1 + " - " + no2 + " = " + 
			    (no1 - no2));
			    System.out.println();
			    
	        }
	        
	        public static void printExercise7() {
	            Scanner input = new Scanner(System.in);
	            System.out.println("Exercise7");
			    System.out.print("Input a number: ");
			    int number1 = input.nextInt();
			     
			    for (int i=0; i< 10; i++){
			     System.out.println(number1 + " x " + (i+1) + " = " + 
			       (number1 * (i+1)));
			     System.out.println();
			    }
			    
	        }
	        
	        public static void printExercise8() {
	            Scanner input = new Scanner(System.in);
	            System.out.println("Exercise8");
			    System.out.println("   J    a   v     v  a ");
		        System.out.println("   J   a a   v   v  a a");
		        System.out.println("J  J  aaaaa   V V  aaaaa");
		        System.out.println(" JJ  a     a   V  a     a");
		        System.out.println();
		        
	        }
	        
	        public static void printExercise9() {
	            Scanner input = new Scanner(System.in);
	            System.out.println("Exercise9");

		        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		        System.out.println();
		        
	        }
	        
	        public static void printExercise10() {
	            Scanner input = new Scanner(System.in);
	            System.out.println("Exercise10");

		        double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		        System.out.println(pi); //
		        System.out.println();
		        
		        input.close();
		        
	        }
	        
	        
}
