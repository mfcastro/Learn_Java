
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		looper();
	}


public static void looper(){
	for (int i = 0; i<=100; i++){		
		if (i%4 == 0 && i%7 == 0){
			System.out.println("fizzbuzz");
		}
		else if(i%7 == 0){
			System.out.println("buzz");
		}
		else if (i%4 == 0){
			System.out.println("fizz");
		}
		else{
			System.out.println(i);
		}
		
	} 
}

}