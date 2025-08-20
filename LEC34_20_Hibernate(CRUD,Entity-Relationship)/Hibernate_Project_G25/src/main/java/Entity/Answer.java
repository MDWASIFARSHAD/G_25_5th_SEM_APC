package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
	
	@Id
	private int aid;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aid, String answer) {
		super();
		this.aid = aid;
		this.answer = answer;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	private String answer;

}
