package luntan.service;

import luntan.model.TbUser ;
public interface TbUserService{
	/**************************用户处理*******************************/
	int loginValid(TbUser user) throws Exception ;//登陆验证
	String getUserpassword(String userid) throws Exception ;//获取密码
	int updatePassword(String userid , String newpassword) throws Exception ;//修改密码
	public void insert(TbUser user) throws Exception ;//新用户注册
}
