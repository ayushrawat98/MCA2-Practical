//question 1
class Average{
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < args.length; ++i){
			sum += args[i];
		}
		int avg = sum/4;
		int p = avg;
		System.out.printf("Average = %f \n Percentage = %f",avg,p);

	}
}

//Question 2

class Fact {
	public static void main(String[] args) {
		int res = 1;
		for(int i = 2; i < args[1]; ++i){
			res *= i;
		}
		System.out.println(res);
	}
}



//Assignment 2


import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
       
       int sum = 0;
       int sum2 = 0;
       
       while(a > 0){
           int t = a%10;
           
           sum += t;
           sum2 += sum;
           
           a/=10;
       }
       System.out.println(sum2);
       
     }
}



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number:");
	    int one = sc.nextInt();
	    System.out.println("Enter second number:");
	    int two = sc.nextInt();
	    System.out.printf("Result = %d", (one%10)+(two%10));
	}
}





/*
                        Assignment 2 
                    Sum of even digits
*/
import java.util.Scanner;
class second{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int sum = 0;
        while(a > 0){
            int t = a%10;
            if(t%2==0){
                sum += t;
            }
            a /= 10;
        }
        System.out.println("Sum of even digits is "+ sum );
    }
}


/*
	Assignment 3
	question 2
*/


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth position");
		int n = sc.nextInt();
		if(n==1){
		    System.out.println(0);
		    System.exit(0);
		}else if(n==2){
		    System.out.println(1);
		    System.exit(0);
		}
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i < n; ++i){
		    arr[i] = arr[i-1] + arr[i-2];
		}
        System.out.println(arr[n-1]);		
	}
}


/*
	Assignment 4
	question 1
*/



import java.util.Scanner;

 class Box{
    private int width;
    private int height;
    private int depth;
    
    public Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public int volume(){
        return height*width*depth;
    }
}


public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height:");
		int height = sc.nextInt();
		System.out.println("Enter width:");
		int width = sc.nextInt();
		System.out.println("Enter depth:");
		int depth = sc.nextInt();
		Box obj = new Box(width, height, depth);
		System.out.println("Volume = "+obj.volume());
	}
}






/*
	Assignment 4
	question 2
*/


import java.util.Scanner;

 class Calculator{
     public static int powering(int a, int b){
        int t = a;
        for(int i = 0; i < b; ++i){
            a *=t;
        }
        return a;
     }
     
     public static double powerDouble(double a, int b){
        double t = a;
        for(int i = 0; i < b; ++i){
            a *=t;
        }
        return a;
     }
     
     
 }

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Calculator.powering(2,3));
		System.out.println(Calculator.powerDouble(2.0,3));
	}
}



/*
	Assignment 4
	question 3
*/



import java.util.Scanner;

class Author{
    private String name;
    private String email;
    private char gender;
    
    public Author(String a, String b, char c){
        name = a;
        email = b;
        gender = c;
    }
    
    //getter
    public String getName(){
        return name;
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qntinstock;
    
    public Book(String a, Author b, double c, int d){
        name  = a;
        author = b;
        price = c;
        qntinstock = d;
    }
    
    //getter
    public String getName(){
        return name;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getStock(){
        return qntinstock;
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Author a = new Author("Rick Sandwich","blabla@gmail.com",'M');
		Book b = new Book("Look behind", a, 79, 111);
		System.out.println("Book name : "+b.getName());
		System.out.println("Author name : "+b.getAuthor().getName());
		System.out.println("Price : "+b.getPrice());
		System.out.println("Quantity : "+b.getStock());
	}
}
