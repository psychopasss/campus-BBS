package luntan.model;

/**
 * TbBorder entity. @author MyEclipse Persistence Tools
 */

public class TbBorder implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer boardId;
	private Integer boardClassId;
	private String boardName;
	private String boardMaster;
	private String boardPcard;

	// Constructors

	/** default constructor */
	public TbBorder() {
	}

	/** minimal constructor */
	public TbBorder(Integer boardId) {
		this.boardId = boardId;
	}

	/** full constructor */
	public TbBorder(Integer boardId, Integer boardClassId, String boardName,
			String boardMaster, String boardPcard) {
		this.boardId = boardId;
		this.boardClassId = boardClassId;
		this.boardName = boardName;
		this.boardMaster = boardMaster;
		this.boardPcard = boardPcard;
	}

	// Property accessors

	public Integer getBoardId() {
		return this.boardId;
	}

	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}

	public Integer getBoardClassId() {
		return this.boardClassId;
	}

	public void setBoardClassId(Integer boardClassId) {
		this.boardClassId = boardClassId;
	}

	public String getBoardName() {
		return this.boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardMaster() {
		return this.boardMaster;
	}

	public void setBoardMaster(String boardMaster) {
		this.boardMaster = boardMaster;
	}

	public String getBoardPcard() {
		return this.boardPcard;
	}

	public void setBoardPcard(String boardPcard) {
		this.boardPcard = boardPcard;
	}

}