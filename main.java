import java.util.Scanner;
 
public class Mainn{
	
	public static void main(String[] args) {
		
		Scanner obj =new Scanner(System.in);
		
		int choice=0;
		
		while(choice!=3);{
			System.out.println("Enter 1- module 1 & 2-Module 2");
			choice=obj.nextInt();
			
			if(choice==1) {
				Module1 obj1= new Module1();
				System.out.println("Enter Students name");
				obj1.name=obj.nextLine();
		        System.out.println("Enter Fathers name");
		        obj1.fname=obj.nextLine();
		        System.out.println("Enter uid");
		        obj1.uid=obj.nextLine();
		        System.out.println("Enter university id");
		        obj1.uni_id=obj.nextLine();
		        System.out.println("Enter semester");
		        obj1.sem=obj.nextInt();
		        
		        obj1.getdata(obj1.name, obj1.fname, obj1.uid, obj1.uni_id, obj1.sem);
		        obj1.setdata();

			}
			else if(choice==2) {
				Module2 obj2= new Module2();
				obj2.chemistry();
				obj2.physics();
				obj2.Maths();
			}
		}
		

	}
}

