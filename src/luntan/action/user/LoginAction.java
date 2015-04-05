package luntan.action.user ;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import luntan.model.TbUser;
import luntan.service.TbUserService;

public class LoginAction extends ActionSupport implements ModelDriven<TbUser>{
	private static final long serialVersionUID = 1L;
	private TbUser model =new TbUser() ;
	private String renewpassword ;
	private String randomCode ;
	protected TbUserService login ;
	public void setLogin(TbUserService login){
		this.login = login ;
		}
	public String insert() throws Exception
	{try{
		//System.out.print(renewpassword);
		//System.out.print(model.getUserPassword());
		if(renewpassword != model.getUserPassword()){
			//System.out.print("-----------------\n");
 		login.insert(model) ;
		addActionMessage("注册成功。请登陆") ;
		}else{
		addActionMessage("两次密码输出不一致，请重新注册！") ;	
		}
		
		return SUCCESS ;
		}catch(Exception e){
				addActionMessage("注册失败，请检查用户名是否已存在！") ;
				return SUCCESS ;
				}
		}	
	public String execute() throws Exception
	{	
		Map<String, Object> session = ActionContext.getContext().getSession() ;
		String randomcode = (String) session.get("rand") ;
		session.put("rand", null) ;//为了安全起见，及时制空。
		if(randomCode.equals(randomcode)){
		int x = login.loginValid(model) ;
			if(x > 0){
				session.put("user",model.getUserName()) ;
				addActionMessage("登陆成功！") ;
				return SUCCESS ;
				}else{
					addActionMessage("用户名/密码错误！！") ;
					return ERROR ;
					}
			}
		addActionMessage("验证码不匹配，请重新输出。") ;
		return ERROR ;
		}	
	public TbUser getModel(){
		return model ;
		}

	public String getRandomCode() {
		return randomCode;
	}

	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}
	public String getRenewpassword() {
		return renewpassword;
	}
	public void setRenewpassword(String renewpassword) {
		this.renewpassword = renewpassword;
	}	
		
	}
