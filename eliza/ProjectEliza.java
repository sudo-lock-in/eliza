//https://www.youtube.com/watch?v=5sbeUMDD4v4

import java.util.Scanner;
public class ProjectEliza {


		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			PromptBank bank = new PromptBank(); //transferring over
			bank.populateStatementsArray(); 
			bank.populateQuestionsArray();
			boolean operate = true; //begins the program
			boolean prompting = true; //begins separate part for the prompt entries
			boolean exclamation = false; 
			boolean question = false;
			boolean statement = false;
			while (operate) {
				operate = false; //prevent infinite loop
				System.out.println("ELIZA: Hello, my name is Eliza. What is your name?");
				String user = scnr.nextLine();
				System.out.printf("Eliza: Hello, %s. Tell me what is on your mind today in 1 sentence.\n", user);
				while (prompting) {
					prompting = false; 
					String sentence = scnr.nextLine().trim();
					if (sentence.equalsIgnoreCase("EXIT")) {
						System.out.print("ELIZA: Do you want to run the session again?");
						String yesorno = scnr.nextLine(); 
						if (yesorno.equalsIgnoreCase("no")) {
							System.out.println("ELIZA: Goodbye, until next time");
						} else if (yesorno.equalsIgnoreCase("yes")) {
							operate = true; //restarts program
							
						}
						
					} else {
							if (sentence.charAt(sentence.length() - 1) == '!') {
								 exclamation = true; //determines whether i will add wow dramatic or ask a question
								
							} else if (sentence.charAt(sentence.length() - 1) == '?' ) {
								 question = true;
								
							} else {
								 statement = true;
							} 								
						if (exclamation) {
							System.out.println("Wow! Dramatic! " + bank.getFullStatement(sentence.replace("!", ""))); 
							//removing extra punctuation from output
							prompting = true; //re-prompts
							exclamation = false;
						} else if (question) {
							System.out.println(bank.getFullQuestion(sentence.replace("?", "")));
							prompting = true;
							question = false;
						} else if (statement) {
							System.out.println(bank.getFullStatement(sentence.replace(".", "")));
							prompting = true;
							statement = false;
						}
					}
					
				}
			}
			

		}
}
