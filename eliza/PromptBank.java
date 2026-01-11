//https://www.youtube.com/watch?v=5sbeUMDD4v4

//i just took the demo code and expanded upon it
	public class PromptBank {
	public String [] questions;
	public String [] statements;
	

	public PromptBank(){
		questions = new String[5]; //initialized the arrays to the correct length to match my number of questions/statements
		statements = new String[5];
		
	}

	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "Hmm... BLANK1 and BLANK2 sounds cool.";
		statements[4] = "BLANK1 and BLANK2 are interesting.";
		//i added 2 new questions & statements
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "What's up with BLANK1 and BLANK2?";
		questions[4] = "Are you a fan of BLANK1 and BLANK2?";
		
	}
	
	public String getRandomStatementTrunk(){
		int randomNum = (int)(Math.random() * statements.length);  //randomizes through each question/statement
		return statements[randomNum];

	}
	
	
	public String getRandomQuestionTrunk(){
		int randomNum = (int)(Math.random() * questions.length); 
		return questions[randomNum];
	}
	public String getFullStatement(String s) {
	    String[] sSplit = s.split(" ");
	    String word1 = sSplit[0];
	    String word2 = sSplit[sSplit.length - 1];
	    String template = getRandomStatementTrunk(); //allows to replace both blanks even if there is one word
	    template = template.replace("BLANK1", word1); //i used .replace instead of replaceAll (i learnt it in lab)
	    template = template.replace("BLANK2", word2);
	    return template;
	}

	public String getFullQuestion(String s) {
	    String[] sSplit = s.split(" ");
	    String word1 = sSplit[0];
	    String word2 = sSplit[sSplit.length - 1];
	    String template = getRandomQuestionTrunk(); 
	    template = template.replace("BLANK1", word1);
	    template = template.replace("BLANK2", word2);
	    return template;
	}
	
}
