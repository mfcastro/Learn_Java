import java.util.Scanner;

public class Library {
	String BookTitle;
	String Author;
	String Genre;
	String [] bookShelf = {"[1] The 4 Hour Work Week", "[2] To Kill a Mockingbird", "[3] The Hitchhiker's Guid to the Galaxy"};
	
	
	public  void AvailableBooks(Object player){
		System.out.println("What would you like to read?" );
		for(int i=0;i < bookShelf.length; i++){
			System.out.println(bookShelf[i]);
		}
		Scanner scan = new Scanner(System.in);
		String bookSelction = scan.nextLine();
		
		SelectBook(bookSelction, player);
		
	}
	
	public static void SelectBook(String bookSelection, Object player){
		switch(bookSelection){
			case "The 4 Hour Work Week":
			case "1":
					System.out.println("That is a good book by Tim Ferriss ");
					System.out.println("IQ increased by 20!");
					((Player) player).Read(20);

					//System.out.println(((Player) player).IQ+20);
				
					break;
			case "To Kill a Mockingbird":
			case "2":
					System.out.println("I read that in high school");
					System.out.println("IQ increased by 10!");
	
					((Player) player).Read(10);
					//System.out.println(((Player) player).Read(10));
					
				break;
			case "The Hitchhiker's Guide to the Galaxy":	
			case "3":
				System.out.println("I have only seen the movie");
				System.out.println("IQ increased by 15!");
				((Player) player).Read(15);

				//System.out.println(((Player) player).IQ+15);
				break;
		}
		System.out.println();
	}
}

