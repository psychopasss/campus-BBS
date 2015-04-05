package luntan.dao.impl;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import luntan.dao.TbBbsAnswerDAO;
import luntan.model.TbBbsAnswer;

public class TbBbsAnswerDAOImpl extends HibernateDaoSupport implements TbBbsAnswerDAO{
	public TbBbsAnswer get(int id){
		return getHibernateTemplate().get(TbBbsAnswer.class,id) ;
		}
	public void insert(TbBbsAnswer tbBbsAnswer) {
			getHibernateTemplate().save(tbBbsAnswer);
	}
	public void delete(int bbsAnswerId,int bbsAnswerFloorid) {
		Query query = getSession().createQuery("delete TbBbsAnswer u where u.bbsAnswerId=? and u.bbsAnswerFloorid=?") ;
		query.setInteger(0,bbsAnswerId);
		query.setInteger(1,bbsAnswerFloorid);
		query.executeUpdate();
	}
	public void update(TbBbsAnswer tbBbsAnswer) {
			getHibernateTemplate().update(tbBbsAnswer);
	}
	public List<TbBbsAnswer> find(int bbsAnswerId) throws Exception {
		@SuppressWarnings("unchecked")
		
		List<TbBbsAnswer> ul1 = getHibernateTemplate().find("from TbBbsAnswer where bbsAnswerId =?",bbsAnswerId);
		if(ul1 != null && ul1.size() >=1 )
		{
			return ul1 ;
			
		}
		return null ;
	}
	public List<TbBbsAnswer> findByKeyword(String keyword,String mhcx,int bbsAnswerId) {
		List<TbBbsAnswer> ul = null ;
		if(mhcx.equals("true")){
			ul = getHibernateTemplate().find("from TbBbsAnswer x where  x.bbsAnswerContent like ? and x.bbsAnswerId like ?",new Object[] {'%'+keyword+'%',bbsAnswerId}) ;
		}else{
			ul = getHibernateTemplate().find("from TbBbsAnswer x where  x.bbsAnswerContent like ? and x.bbsAnswerId like ?",new Object[] {keyword,bbsAnswerId}) ;	
		}
		if(ul != null && ul.size() >=1 )
		{
			return ul ;
		}
		return null ;
	}
	public TbBbsAnswer detail(int bbsAnswerId,int bbsAnswerFloorid) {
		@SuppressWarnings("unchecked")
		List<TbBbsAnswer> u1 = getHibernateTemplate().find("from TbBbsAnswer x where x.bbsAnswerId=? and x.bbsAnswerFloorid=?",new Integer[] {bbsAnswerId,bbsAnswerFloorid}) ;
		if(u1 != null && u1.size() >=1 )
		{
			return u1.get(0) ;
		}
		return null;
	}

	public List<TbBbsAnswer> find(String bbsAnswerSender) throws Exception {
		@SuppressWarnings("unchecked")
		List<TbBbsAnswer> ul = getHibernateTemplate().find("from TbBbsAnswer where bbsAnswerSender like ?", bbsAnswerSender);
		if(ul != null && ul.size() >=1 )
		{
			return ul ;
			
		}
		return null;
	}
	@Override
	public List<TbBbsAnswer> findByKeyword(String keyword,String mhcx,String bbsAnswerSender) {
		List<TbBbsAnswer> ul = null ;
		if(mhcx.equals("true")){
			ul = getHibernateTemplate().find("from TbBbsAnswer x where  x.bbsAnswerContent like ? and x.bbsAnswerSender like ?",new String[] {'%'+keyword+'%',bbsAnswerSender});
		}else{
			ul = getHibernateTemplate().find("from TbBbsAnswer x where  x.bbsAnswerContent like ? and x.bbsAnswerSender like ?",new String[] {keyword,bbsAnswerSender}) ;	
		}
		if(ul != null && ul.size() >=1 )
		{
			return ul ;
		}
		return null;
	}
	@Override
	public int getfloor(int bbsAnswerId) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("select max(x.bbsAnswerFloorid) from TbBbsAnswer x where x.bbsAnswerId = ?") ;
		query.setInteger(0,bbsAnswerId);
		try{
		int floor = (int) query.uniqueResult();
		return floor;
		}catch(Exception e){
			return 1;
		}
		
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("delete TbBbsAnswer u where u.bbsAnswerId=?") ;
		query.setInteger(0,id);
		query.executeUpdate();
	}
	@Override
	public List<TbBbsAnswer> find2(String bbsSender) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<TbBbsAnswer> ul = getHibernateTemplate().find("from TbBbsAnswer where bbsAnswerSendTo like ?", bbsSender);
		if(ul != null && ul.size() >=1 )
		{
			return ul ;
			
		}
		return null;
	}

}


