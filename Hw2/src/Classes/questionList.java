package Classes;
import java.util.ArrayList;

class questionList{
	
	//Question list creates an ArrayList to store Questions, which have Answers
	private ArrayList<question> qList;
	public questionList() {
		qList = new ArrayList<question>();
	}
	
	public void askQuestion(String user, String topic, String questionText, boolean isAnswered) {
		qList.add(new question(user, topic, questionText, false));
	}
	
	public void answerQuestion(question q, Answer a) {
		for(int i = 0; i < qList.size(); i++) {
			if(qList.get(i).getQuestion().equals(q.getQuestion()))
				qList.get(i).addAnswer(a);
		}
	}
	
	public void getQuestion(String topic) {
		
	}
}