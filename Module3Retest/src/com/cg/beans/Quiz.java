package com.cg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Question_Master")
public class Quiz {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq",sequenceName="seq_Ques_id",
				allocationSize=1)
	private int quesNo;
	
	@NotEmpty(message="Please Select Ques SubTopic ")
	@Column(name="Ques_subtopic")
	private String quesTopic;
	
	@NotEmpty(message="Please Select Ques Category ")
	@Column(name="Ques_Category")
	private String quesCat;

	@NotEmpty(message="Please Enter Question ")
	@Column(name="Question")
	private String ques;

	@NotEmpty(message="Please Enter Option 1 ")
	@Column(name="Option_1")
	private String option1;
	
	@NotEmpty(message="Please Enter Option 2 ")
	@Column(name="Option_2")
	private String option2;
	
	@NotEmpty(message="Please Enter Option 3 ")
	@Column(name="Option_3")
	private String option3;
	
	@NotEmpty(message="Please Enter Option 4 ")
	@Column(name="Option_4")
	private String option4;
	
	@NotEmpty(message="Please Enter ans ")
	@Column(name="Answer")
	private String ans;
	
	@NotEmpty(message="Please Enter remarks ")
	@Column(name="Remarks")
	private String remarks;
	@NotEmpty(message="Please Enter review ")
	@Column(name="Review_Cont")
	private String review;

	public Quiz(int quesNo, String quesTopic, String quesCat, String ques,
			String option1, String option2, String option3, String option4,
			String ans, String remarks, String review) {
		super();
		this.quesNo = quesNo;
		this.quesTopic = quesTopic;
		this.quesCat = quesCat;
		this.ques = ques;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.ans = ans;
		this.remarks = remarks;
		this.review = review;
	}

	public Quiz() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Quiz [quesNo=" + quesNo + ", quesTopic=" + quesTopic
				+ ", quesCat=" + quesCat + ", ques=" + ques + ", option1="
				+ option1 + ", option2=" + option2 + ", option3=" + option3
				+ ", option4=" + option4 + ", ans=" + ans + ", remarks="
				+ remarks + ", review=" + review + "]";
	}

	public int getQuesNo() {
		return quesNo;
	}

	public void setQuesNo(int quesNo) {
		this.quesNo = quesNo;
	}

	public String getQuesTopic() {
		return quesTopic;
	}

	public void setQuesTopic(String quesTopic) {
		this.quesTopic = quesTopic;
	}

	public String getQuesCat() {
		return quesCat;
	}

	public void setQuesCat(String quesCat) {
		this.quesCat = quesCat;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	
}
