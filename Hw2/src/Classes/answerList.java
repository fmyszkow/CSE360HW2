package Classes;
import java.util.ArrayList;

class answerList{
	
	//Question list creates an ArrayList to store Questions, which have Answers
	private ArrayList<Answer> aList;
	public answerList() {
		aList = new ArrayList<Answer>();
	}
	
	public void addAnswer(Answer a) {
		aList.add(a);
	}
	
	public Answer getAnswer(int i) {
		return aList.get(i);
	}
}