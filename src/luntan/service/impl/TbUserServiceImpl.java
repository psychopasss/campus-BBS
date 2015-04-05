package luntan.service.impl ;
import luntan.model.TbUser ;
import luntan.dao.* ;
import luntan.service.* ;
public class TbUserServiceImpl implements TbUserService{
	private UserDAO userDao ;
	public void setUserDao(UserDAO userDao){
		this.userDao = userDao ;
		}
		
	public void insert(TbUser user) throws Exception {
			userDao.insert(user) ;
	}
	
	public int loginValid(TbUser user) throws Exception{
		try{
			TbUser u = userDao.findUser(user) ;
			if(u != null){
				return 1 ;
				}
			}catch(Exception e){
				e.printStackTrace() ;
				throw new Exception("验证用户登陆出现异常！") ;
				}
			return -1 ;
		}
	public String getUserpassword(String userid) throws Exception{
		try{
			TbUser u = userDao.getUserpassword(userid) ;
			if(u != null){
				return u.getUserPassword() ;
				}
			}catch(Exception e){
				e.printStackTrace() ;
				throw new Exception("获取旧密码出现异常！") ;
				}
			return null ;
		}
	public int updatePassword(String userid,String newpassword) throws Exception{
		try{
			TbUser user = new TbUser() ;
			user.setUserName(userid) ;
			user.setUserPassword(newpassword) ;
			TbUser u = userDao.updateUserpassword(user) ;
			if(u != null){
				return 1 ;
				}
			}catch(Exception e){
				e.printStackTrace() ;
				throw new Exception("修改密码出现异常！") ;
				}
		return -1 ;
	}
	}
