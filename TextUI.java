package simple_dictionary;

import java.util.Scanner;


public class TextUI {
	private Scanner scanner;
	private SimpleDictionary dictionary;


	public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
		this.scanner = scanner;
		this.dictionary = simpleDictionary;
	}
	public void start() {
		while(true) {
			System.out.println("Command: ");
			String command = scanner.nextLine();
			if(command.equals("end")) {
				System.out.println("bye bye");
				break;
			}
			else if(command.equals("add")){
				System.out.println("Word: ");
				String word = scanner.nextLine();
				System.out.println("Translation: ");
				String translation = scanner.nextLine();
				dictionary.addWord(word, translation);

			}
			else if(command.equals("search")) {
				System.out.println("To be translated:" );
				String word = scanner.nextLine();
				//dictionary find translation
				if(!word.equals("")) {
					String t = dictionary.translate(word);
					System.out.println("Translation: " + t);

				}
				else System.out.println("Word "+ word + " was not found");


			}			

			else System.out.println("Unknown command");






		}



	}

}
