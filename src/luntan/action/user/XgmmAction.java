package luntan.action.user ;

import luntan.service.TbUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class XgmmAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String newpassword ;
	private String oldpassword ;
	private String renewpassword ;
	private String userid = (String) ActionContext.getContext().getSession().get("user") ;
	protected TbUserService login ;
	public void setLogin(TbUserService login){
		this.login = login ;
		}
	public String execute() throws Exception
	{	String nowpassword = login.getUserpassword(userid) ;
		if(!newpassword.equals(renewpassword))
			{
			addActionMessage("两次新密码输入不一致") ;
			return ERROR ;
			}
		if(oldpassword.equals(nowpassword))
		{
			int x = login.updatePassword(userid,newpassword) ;
				if(x > 0){
							addActionMessage("修改成功！") ;
							return SUCCESS ;
						 }else{
							 addActionMessage("修改失败！") ;
							 return ERROR ;
						 	  }
		}
		addActionMessage("旧密码错误！") ;
		return ERROR ;
			
		}	
	public void setNewpassword(String newpassword){
		this.newpassword = newpassword ;
	}
	public String getNewpassword(){
		return this.newpassword ;
	}
	public void setOldpassword(String oldpassword){
		this.oldpassword = oldpassword ;
	}
	public String getOldpassword(){
		return this.oldpassword ;
	}	
	public void setRenewpassword(String renewpassword){
		this.renewpassword = renewpassword ;
	}
	public String getRenewpassword(){
		return this.renewpassword ;
	}		
	}
