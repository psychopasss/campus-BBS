package luntan.dao.impl ;
import java.util.* ;

import luntan.dao.* ;
import luntan.model.* ;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.* ;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	public TbUser get(String userid){
		return getHibernateTemplate().get(TbUser.class,userid) ;
		}
	public TbUser findUser(TbUser user){
		@SuppressWarnings("unchecked")
		List<TbUser> ul = getHibernateTemplate().findByExample(user); 
		if(ul != null && ul.size() >=1 )
		{
			return ul.get(0) ;
		}
		return null ;
			}
	public TbUser getUserpassword(String userid){
		@SuppressWarnings("unchecked")
		List<TbUser> ul = getHibernateTemplate().find("from TbUser x where x.userName = ?" , userid) ;
		if(ul != null && ul.size() >=1 )
		{
			return ul.get(0) ;
		}
		return null ;
		}	
	public TbUser updateUserpassword(TbUser user) {
		Query query = getSession().createQuery("update TbUser u set u.userPassword=? where u.userName=?") ;
		query.setString(0, user.getUserPassword()) ;
		query.setString(1, user.getUserName()) ;
		if(query.executeUpdate()==1){
			return user ;
		}
		return null ;
	}
	public void insert(TbUser user) {
			getHibernateTemplate().save(user);
	}
	
	}
