package luntan.action.tz;

import java.util.List;
import luntan.model.TbBbs;
import luntan.model.TbBbsAnswer;
import luntan.service.TbBbsService;
import com.opensymphony.xwork2.ActionSupport;

public class TzAction extends ActionSupport {


		private static final long serialVersionUID = 1L;
		private int id,bbsClass,floor,bbsAnswerId,bbsAnswerFloorid;
		private String keyword,bbsSender;
		private String mhcx ;
		private TbBbs u =new TbBbs() ;
		private TbBbsAnswer u1 =new TbBbsAnswer() ;
		protected TbBbsService mgr ;
		private List<TbBbs> ul ;
		private List<TbBbsAnswer> ul1;
		public void setTz(TbBbsService mgr){
			this.mgr = mgr ;
			}
		public String insert() throws Exception
		{try{
	 		mgr.insert(u) ;
			addActionMessage("发帖成功") ;
			return SUCCESS ;
			}catch(Exception e){
					addActionMessage("发帖失败，请更改帖子标题！") ;
					return SUCCESS ;
					}
			}	
		public String insertAnswer() throws Exception
		{try{
	 		mgr.insert(u1) ;
			addActionMessage("回复成功") ;
			return "fbfh" ;
			}catch(Exception e){
					addActionMessage("回复失败！") ;
					return "fbfh" ;
					}
			}	
		public String delete() throws Exception
		{	
			try{
				mgr.delete(id) ;
				mgr.deleteAnswerall(id);
				addActionMessage("删除成功") ;
				return "delete" ;
				}catch(Exception e){
						addActionMessage("删除失败！") ;
						return "delete" ;
						}
				
			}
		public String deleteAnswer() throws Exception
		{	
			try{
				mgr.deleteAnswer(bbsAnswerId,bbsAnswerFloorid);
				addActionMessage("删除成功") ;
				return "delete1" ;
				}catch(Exception e){
						addActionMessage("删除失败！") ;
						return "delete1" ;
						}
				
			}
		public String deleteAnswer2() throws Exception
		{	
			try{
				mgr.deleteAnswer(bbsAnswerId,bbsAnswerFloorid);
				addActionMessage("删除成功") ;
				return "delete2" ;
				}catch(Exception e){
						addActionMessage("删除失败！") ;
						return "delete2" ;
						}
				
			}
		public String update() throws Exception
		{
			try{
				mgr.update(u) ;
				addActionMessage("修改成功") ;
				return SUCCESS ;
				}catch(Exception e){
					addActionMessage("修改失败，请重新修改！") ;
					return SUCCESS ;
					}
			
			}
		public String updateAnswer() throws Exception
		{
			try{
				mgr.update(u1);
				addActionMessage("修改成功") ;
				return SUCCESS ;
				}catch(Exception e){
					addActionMessage("修改失败，请重新修改！") ;
					return SUCCESS ;
					}
			
			}
		public String find() throws Exception
			{	
				List<TbBbs> ul = mgr.find(bbsClass) ;
				setUl(ul) ;
					if(ul != null){
						return SUCCESS ;
						}
					return SUCCESS ;
					
				}
		public String findAnswer() throws Exception
		{	
			List<TbBbsAnswer> ul1 = mgr.findAnswer(bbsSender) ;
			setUl1(ul1) ;
				if(ul1 != null){
					return "success2" ;
					}
				return "success2" ;
				
			}
		public String findAnswer2() throws Exception
		{	
			List<TbBbsAnswer> ul1 = mgr.findAnswer2(bbsSender) ;
			setUl1(ul1) ;
				if(ul1 != null){
					return "success3" ;
					}
				return "success3" ;
				
			}
		public String findByKeyword() throws Exception
		{  
			System.out.printf("%d",bbsClass);
			List<TbBbs> ul = mgr.findByKeyword(keyword,mhcx,bbsClass) ;
			setUl(ul) ;
			
				if(ul != null){
					return "key" ;
					}else{return "key";}
			}
		public String find1() throws Exception
		{	
			System.out.printf("%s",bbsSender);
			List<TbBbs> ul = mgr.find(bbsSender) ;
			setUl(ul) ;
				if(ul != null){
					return "success1" ;
					}
				return "success1" ;
				
			}
	public String findByKeyword1() throws Exception
	{  
	
		List<TbBbs> ul = mgr.findByKeyword(keyword,mhcx,bbsSender) ;
		setUl(ul) ;
		
			if(ul != null){
				return "key1" ;
				}else{return "key1";}
		}
	public String findByKeywordAnswer() throws Exception
	{  
	
		List<TbBbsAnswer> ul1 = mgr.findByKeywordAnswer(keyword, mhcx, bbsSender) ;
		setUl1(ul1) ;
		
			if(ul != null){
				return "key2" ;
				}else{return "key2";}
		}
		public String detail() throws Exception
				{	
			
					TbBbs u = mgr.detail(id) ;
					List<TbBbsAnswer> ul1 = mgr.findAnswer(id);		
					int floor = mgr.getfloornum(id); 
					setU(u) ;
					setUl1(ul1) ;
					setFloor(floor);
						if(u != null){
							return SUCCESS ;
							}
						return SUCCESS ;
					}
		
		public String update2() throws Exception
		{	
			TbBbs u = mgr.detail(id) ;
			setU(u) ;
				if(u != null){
					return "update" ;
					}
				return "update" ;
			}	
		public String updateAnswer2() throws Exception
		{	
			TbBbsAnswer u1 = mgr.detail(bbsAnswerId, bbsAnswerFloorid) ;
			setU1(u1) ;
				if(u1 != null){
					return "update2" ;
					}
				return "update2" ;
			}

		public void setKeyword(String keyword){
			this.keyword = keyword ;
		}
		public String getKeyword(){
			return this.keyword ;
		}	
		public List<TbBbs> getUl(){
			return ul ;
			} 
		public void setUl(List<TbBbs> ul){
			this.ul = ul ;
			} 
		public TbBbs getU(){
			return u ;
			}
		public void setU(TbBbs u){
			this.u = u ;
			} 
		public int getH(){
			return id ;
			}
		public void setH(int id){
			this.id = id ;
			}
		public int getBbsClass(){
			return bbsClass ;
			}
		public void setBbsClass(int bbsClass){
			this.bbsClass = bbsClass ;
			}
		public String getBbsSender(){
			return bbsSender ;
			}
		public void setBbsSender(String bbsSender){
			this.bbsSender = bbsSender ;
			}
		public String getMhcx() {
			return mhcx;
		}
		public void setMhcx(String mhcx) {
			this.mhcx = mhcx;
		}
		public TbBbsAnswer getU1() {
			return u1;
		}
		public void setU1(TbBbsAnswer u1) {
			this.u1 = u1;
		}
		public List<TbBbsAnswer> getUl1() {
			return ul1;
		}
		public void setUl1(List<TbBbsAnswer> ul1) {
			this.ul1 = ul1;
		}
		public int getFloor() {
			return floor;
		}
		public void setFloor(int floor) {
			this.floor = floor;
		}
		public int getBbsAnswerId() {
			return bbsAnswerId;
		}
		public void setBbsAnswerId(int bbsAnswerId) {
			this.bbsAnswerId = bbsAnswerId;
		}
		public int getBbsAnswerFloorid() {
			return bbsAnswerFloorid;
		}
		public void setBbsAnswerFloorid(int bbsAnswerFloorid) {
			this.bbsAnswerFloorid = bbsAnswerFloorid;
		} 
		
		}

