package Classes;
import java.util.ArrayList;

class Answer{
	private String user;
	private String answerText;
	private ArrayList<Answer> replyList;
	
	public Answer(String user, String questionText){
		this.user = user;
		this.answerText = questionText;
		replyList = new ArrayList<Answer>();
	}
	
	public String getAnwer() {
		return this.answerText;
	}
	
	public void setAnswer(String newQuestion) {
		this.answerText = newQuestion;
	}
	
	public void addReply(Answer reply) {
		replyList.add(reply);
	}
}