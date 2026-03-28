public class PromptBank {
	public String [] questions;
	public String [] statements;
	

	public PromptBank(){
		questions = new String[28];
		statements = new String[27];
		
	}

	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "Hmm... BLANK1 and BLANK2 sounds cool.";
		statements[4] = "BLANK1 and BLANK2 are interesting.";
		statements[5] = "It sounds like BLANK1 and BLANK2 have a lot of history.";
		statements[6] = "I can see why you'd bring up BLANK1 and BLANK2.";
		statements[7] = "Many people feel strongly about both BLANK1 and BLANK2.";
		statements[8] = "I’m curious to hear your perspective on BLANK1 versus BLANK2.";
		statements[9] = "It's not every day someone mentions BLANK1 and BLANK2 together.";
		statements[10] = "That’s a unique take on BLANK1 and BLANK2.";
		statements[11] = "I suppose BLANK1 and BLANK2 define much of what you're saying.";
		statements[12] = "Tell me if BLANK1 and BLANK2 are usually related in your mind.";
		statements[13] = "You seem quite focused on BLANK1 and BLANK2 right now.";
		statements[14] = "I'm listening. Go on about BLANK1 and BLANK2.";
		statements[15] = "It’s interesting how BLANK1 leads back to BLANK2.";
		statements[16] = "I've never thought about BLANK1 and BLANK2 that way before.";
		statements[17] = "That explains a lot about your interest in BLANK1 and BLANK2.";
		statements[18] = "BLANK1 and BLANK2 definitely deserve more discussion.";
		statements[19] = "I’m trying to grasp the connection between BLANK1 and BLANK2.";
		statements[20] = "You sound very certain about BLANK1 and BLANK2.";
		statements[21] = "Let's explore the idea of BLANK1 and BLANK2 a bit deeper.";
		statements[22] = "I feel like there is a hidden story behind BLANK1 and BLANK2.";
		statements[23] = "BLANK1 and BLANK2 seem to be the main characters here.";
		statements[24] = "I'm following you on BLANK1, but BLANK2 is a surprise.";
		statements[25] = "That is a bold statement regarding BLANK1 and BLANK2.";
		statements[26] = "I hadn't considered the impact of BLANK1 and BLANK2.";
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "What's up with BLANK1 and BLANK2?";
		questions[4] = "Are you a fan of BLANK1 and BLANK2?";
		questions[5] = "How long have you been interested in BLANK1 and BLANK2?";
		questions[6] = "If you had to choose between BLANK1 and BLANK2, which would it be?";
		questions[7] = "Does BLANK1 make you think of BLANK2, or is it the other way around?";
		questions[8] = "What would happen if BLANK1 and BLANK2 were no longer part of the picture?";
		questions[9] = "Could BLANK1 be a direct result of BLANK2?";
		questions[10] = "What is the biggest challenge with BLANK1 and BLANK2?";
		questions[11] = "Do your friends also care about BLANK1 and BLANK2?";
		questions[12] = "Why do you think BLANK1 and BLANK2 are so prominent right now?";
		questions[13] = "Is there a specific memory tied to BLANK1 and BLANK2?";
		questions[14] = "Do you feel like you have control over BLANK1 and BLANK2?";
		questions[15] = "What changed recently regarding BLANK1 and BLANK2?";
		questions[16] = "Are BLANK1 and BLANK2 helping you or holding you back?";
		questions[17] = "How do you feel when you encounter BLANK1 and BLANK2?";
		questions[18] = "Is there anyone else involved with BLANK1 and BLANK2?";
		questions[19] = "Would you say BLANK1 and BLANK2 are your top priorities?";
		questions[20] = "What would a world without BLANK1 and BLANK2 look like to you?";
		questions[21] = "Is it hard to balance BLANK1 with BLANK2?";
		questions[22] = "Can you describe the first time you dealt with BLANK1 and BLANK2?";
		questions[23] = "Do you think BLANK1 is more important than BLANK2?";
		questions[24] = "Is there a positive side to BLANK1 and BLANK2?";
		questions[25] = "What advice would you give someone else about BLANK1 and BLANK2?";
		questions[26] = "Are you looking for a change in BLANK1 and BLANK2?";
		questions[27] = "How do you think I can help you with BLANK1 and BLANK2?";	
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

