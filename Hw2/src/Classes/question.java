package Classes;
import java.util.ArrayList;

class question{
	private String user;
	private String questionText;
	private String topic;
	private boolean isAnswered;
	private answerList aList;
	
	public question(String user, String questionText, String topic, boolean isAnswered){
		this.user = user;
		this.questionText = questionText;
		this.topic = topic;
		this.isAnswered = isAnswered;
		aList = new answerList();
	}
	
	public String getQuestion() {
		return this.questionText;
	}
	
	public String getTopic() {
		return this.topic;
	}
	
	public void setAnswered(boolean isAnswered) {
		this.isAnswered = isAnswered;
	}
	
	public void setQuestion(String newQuestion) {
		this.questionText = newQuestion;
	}
	
	public void setTopic(String newTopic) {
		this.topic = newTopic;
	}
	
	
	public void addAnswer(Answer newAnswer) {
		aList.addAnswer(newAnswer);
		if(!isAnswered)
			isAnswered = true;
	}
}