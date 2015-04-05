package luntan.dao ;

import luntan.model.TbUser ;
public interface UserDAO{
	public TbUser get(String userid) ;
	public TbUser findUser(TbUser user) ;
	public TbUser getUserpassword(String userid) ;
	public TbUser updateUserpassword(TbUser user) ;
	public void insert(TbUser user) ;
	}
