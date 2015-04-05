package luntan.model;

import java.sql.Timestamp;

/**
 * TbBbsAnswer entity. @author MyEclipse Persistence Tools
 */

public class TbBbsAnswer implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer bbsAnswerPk;
	private Integer bbsAnswerId;
	private Integer bbsAnswerFloorid;
	private String bbsAnswerContent;
	private String bbsAnswerSender;
	private Timestamp bbsAnswerSendTime;
	private String bbsAnswerSendTo;
	// Constructors

	/** default constructor */
	public TbBbsAnswer() {
	}

	/** full constructor */
	public TbBbsAnswer(Integer bbsAnswerId, Integer bbsAnswerFloorid,
			String bbsAnswerContent, String bbsAnswerSender,
			Timestamp bbsAnswerSendTime,String bbsAnswerSendTo) {
		this.bbsAnswerId = bbsAnswerId;
		this.bbsAnswerFloorid = bbsAnswerFloorid;
		this.bbsAnswerContent = bbsAnswerContent;
		this.bbsAnswerSender = bbsAnswerSender;
		this.bbsAnswerSendTime = bbsAnswerSendTime;
		this.bbsAnswerSendTo = bbsAnswerSendTo;
	}

	// Property accessors

	public Integer getBbsAnswerPk() {
		return this.bbsAnswerPk;
	}

	public void setBbsAnswerPk(Integer bbsAnswerPk) {
		this.bbsAnswerPk = bbsAnswerPk;
	}

	public Integer getBbsAnswerId() {
		return this.bbsAnswerId;
	}

	public void setBbsAnswerId(Integer bbsAnswerId) {
		this.bbsAnswerId = bbsAnswerId;
	}

	public Integer getBbsAnswerFloorid() {
		return this.bbsAnswerFloorid;
	}

	public void setBbsAnswerFloorid(Integer bbsAnswerFloorid) {
		this.bbsAnswerFloorid = bbsAnswerFloorid;
	}

	public String getBbsAnswerContent() {
		return this.bbsAnswerContent;
	}

	public void setBbsAnswerContent(String bbsAnswerContent) {
		this.bbsAnswerContent = bbsAnswerContent;
	}

	public String getBbsAnswerSender() {
		return this.bbsAnswerSender;
	}

	public void setBbsAnswerSender(String bbsAnswerSender) {
		this.bbsAnswerSender = bbsAnswerSender;
	}

	public Timestamp getBbsAnswerSendTime() {
		return this.bbsAnswerSendTime;
	}

	public void setBbsAnswerSendTime(Timestamp bbsAnswerSendTime) {
		this.bbsAnswerSendTime = bbsAnswerSendTime;
	}

	public String getBbsAnswerSendTo() {
		return bbsAnswerSendTo;
	}

	public void setBbsAnswerSendTo(String bbsAnswerSendTo) {
		this.bbsAnswerSendTo = bbsAnswerSendTo;
	}

}