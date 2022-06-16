import java.util.Scanner;
class Quiz{
	String s1;
	int option;
	Scanner sc=new Scanner(System.in);
	int marks=0;
	
	void input(){
		System.out.println();
		System.out.println("                 ******* HELLO GUYS *******                    ");
		System.out.println();
		System.out.println("            ****** WELCOME TO QUIZ MANIA *****                ");
		System.out.println();
		System.out.println("          *********now lets start the Quiz*********                ");
		System.out.println();
		System.out.println("\n ENTER PLAYER NAME : ");
		s1=sc.nextLine();
	}
	void execute(){
		System.out.println(" IF YOU WANT TO START THE GAME THEN PRESS 1 ");
		System.out.println();
		System.out.println(" IF YOU WANT TO EXIT FROM THE GAME RIGHT NOW THEN PRESS 2 ");
		System.out.println();
		System.out.println(" ENTER YOUR CHOICE ");
		option=sc.nextInt();
		switch(option){
		case 1:
			start();
			question();
			break;
		
		case 2:
			System.out.println(" THANK YOU FOR JOINING OUR GAME , BETTER LUCK NEXT TIME :-)");
			System.exit(0);
			break;
		default :
			execute();
			break;
		}
	}
	void question(){
		System.out.println(" WHAT IS THE FULL FORM OF CPU ?");
		System.out.println("1.Central Processing Unit. \t 2.Control Unit.");
		int ans=sc.nextInt();
		if(ans==1){
			marks+=2;
		}
		else{
			marks-=1;
		}
		System.out.println(" WHAT IS THE FULL FORM OF JVM ?");
		System.out.println("1.java virtual machine. \t 2.java viral machine \t 3. java video machine");
		ans=sc.nextInt();
		if(ans ==1 ){
			marks = marks + 2;
		}
		else{
			marks = marks - 1;
		}
		System.out.println(" WHICH INHERITANCE'S CONCEPT IS NOT APPLICABLE IN JAVA ?");
		System.out.println("1.simple inheritance. \t 2.multiple inheritance \t 3. multilevel inheritance");
		ans=sc.nextInt();
		if(ans ==2 ){
			marks = marks + 2;
		}
		else{
			marks = marks - 1;
		}
		System.out.println(" WHO IS THE PRIME MINISTER OF INDIA ?");
		System.out.println("1.Narendra Ghosh. \t 2.Narendra lal  \t 3. Narendra Modi");
		ans=sc.nextInt();
		if(ans ==3 ){
			marks = marks + 2;
		}
		else{
			marks = marks - 1;
		}
		System.out.println(" WHO IS THE FOUNDER OF APPLE ?");
		System.out.println("1.Marcus Stoinis. \t 2.Mamta Baneerjee \t 3. Steve jobs");
		ans=sc.nextInt();
		if(ans ==3 ){
			marks = marks + 2;
		}
		else{
			marks = marks - 1;
		}
		
	}
	void start(){
		new Thread(
			()->{
				try{
					Thread.sleep(20000);
				}
				catch(Exception e){
					System.out.println(e);
				}
				System.out.println("time up");
				System.out.println("Congratulations : "+s1);
				System.out.println("Your marks : "+marks);
				System.exit(0);
			}
			).start();
	}
	public static void main(String[] args)throws Exception {
		Quiz q=new Quiz();
		q.input();
		q.execute();
	}
}