import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word to see is it palindrom or not \nEnter your word: ");
		String kelime = input.nextLine();
		int bas = 0 ,son = kelime.length() - 1;//char 0'dan başladığı için lenght()-1;
		boolean palindromMu = true;
		while (bas < son) 
		{
			if (kelime.charAt(bas) != kelime.charAt(son)) 
			{
				palindromMu = false;
				break;//boşuna diğer harflere bakmaya gerek yok
			}
				bas++;
				son--;
		}
		if (palindromMu)
		System.out.println(kelime + " is a palindrome!");
		else
		System.out.println(kelime + " is not a palindrome!");
		input.close();
	}

}
