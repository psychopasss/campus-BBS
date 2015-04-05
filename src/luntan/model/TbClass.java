package luntan.model;

/**
 * TbClass entity. @author MyEclipse Persistence Tools
 */

public class TbClass implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer calssId;
	private String calssName;
	private String calssIntro;

	// Constructors

	/** default constructor */
	public TbClass() {
	}

	/** minimal constructor */
	public TbClass(Integer calssId) {
		this.calssId = calssId;
	}

	/** full constructor */
	public TbClass(Integer calssId, String calssName, String calssIntro) {
		this.calssId = calssId;
		this.calssName = calssName;
		this.calssIntro = calssIntro;
	}

	// Property accessors

	public Integer getCalssId() {
		return this.calssId;
	}

	public void setCalssId(Integer calssId) {
		this.calssId = calssId;
	}

	public String getCalssName() {
		return this.calssName;
	}

	public void setCalssName(String calssName) {
		this.calssName = calssName;
	}

	public String getCalssIntro() {
		return this.calssIntro;
	}

	public void setCalssIntro(String calssIntro) {
		this.calssIntro = calssIntro;
	}

}