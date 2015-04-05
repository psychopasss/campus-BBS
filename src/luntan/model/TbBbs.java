package luntan.model;

import java.sql.Timestamp;

/**
 * TbBbs entity. @author MyEclipse Persistence Tools
 */

public class TbBbs implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer bbsId;
	private String bbsTitle;
	private String bbsContent;
	private Timestamp bbsSendTime;
	private String bbsSender;
	private String bbsOpTime;
	private String bbsToGoodTime;
	private Integer bbsClass;

	// Constructors

	/** default constructor */
	public TbBbs() {
	}

	/** minimal constructor */
	public TbBbs(Integer bbsId) {
		this.bbsId = bbsId;
	}

	/** full constructor */
	public TbBbs(Integer bbsId, String bbsTitle, String bbsContent,
			Timestamp bbsSendTime, String bbsSender, String bbsOpTime,
			String bbsToGoodTime, Integer bbsClass) {
		this.bbsId = bbsId;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
		this.bbsSendTime = bbsSendTime;
		this.bbsSender = bbsSender;
		this.bbsOpTime = bbsOpTime;
		this.bbsToGoodTime = bbsToGoodTime;
		this.bbsClass = bbsClass;
	}

	// Property accessors

	public Integer getBbsId() {
		return this.bbsId;
	}

	public void setBbsId(Integer bbsId) {
		this.bbsId = bbsId;
	}

	public String getBbsTitle() {
		return this.bbsTitle;
	}

	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}

	public String getBbsContent() {
		return this.bbsContent;
	}

	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}

	public Timestamp getBbsSendTime() {
		return this.bbsSendTime;
	}

	public void setBbsSendTime(Timestamp currentTime) {
		this.bbsSendTime = currentTime;
	}

	public String getBbsSender() {
		return this.bbsSender;
	}

	public void setBbsSender(String bbsSender) {
		this.bbsSender = bbsSender;
	}

	public String getBbsOpTime() {
		return this.bbsOpTime;
	}

	public void setBbsOpTime(String bbsOpTime) {
		this.bbsOpTime = bbsOpTime;
	}

	public String getBbsToGoodTime() {
		return this.bbsToGoodTime;
	}

	public void setBbsToGoodTime(String bbsToGoodTime) {
		this.bbsToGoodTime = bbsToGoodTime;
	}
	public Integer getBbsClass() {
		return this.bbsClass;
	}
	public void setBbsClass(Integer bbsClass) {
		this.bbsClass = bbsClass;
	}
}