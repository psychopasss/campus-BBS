package luntan.dao.impl;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import luntan.dao.TbBbsDAO;
import luntan.model.TbBbs;

public class TbBbsDAOImpl extends HibernateDaoSupport implements TbBbsDAO{
	public TbBbs get(int bbsId){
		return getHibernateTemplate().get(TbBbs.class,bbsId) ;
		}
	public void insert(TbBbs tbBbs) {
			getHibernateTemplate().save(tbBbs);
	}
	public void delete(int bbsId) {
		TbBbs x=getHibernateTemplate().load(TbBbs.class,bbsId) ;
            getHibernateTemplate().delete(x) ;
	}
	public void update(TbBbs tbBbs) {
			getHibernateTemplate().update(tbBbs);
	}
	public List<TbBbs> find(int bbsClass) throws Exception {
		@SuppressWarnings("unchecked")
		List<TbBbs> ul = getHibernateTemplate().find("from TbBbs where bbsClass like ?", bbsClass);
		if(ul != null && ul.size() >=1 )
		{
			return ul ;
			
		}
		return null ;
	}
	@SuppressWarnings("unchecked")
	public List<TbBbs> findByKeyword(String keyword,String mhcx,int bbsClass) {
		List<TbBbs> ul = null ;
		if(mhcx.equals("true")){
			ul = getHibernateTemplate().find("from TbBbs x where  x.bbsTitle like ? and x.bbsClass like ?",new Object[] {'%'+keyword+'%',bbsClass}) ;
		}else{
			ul = getHibernateTemplate().find("from TbBbs x where  x.bbsTitle like ? and x.bbsClass like ?",new Object[] {keyword,bbsClass}) ;	
		}
		if(ul != null && ul.size() >=1 )
		{
			return ul ;
		}
		return null ;
	}
	public TbBbs detail(int bbsId) {
		@SuppressWarnings("unchecked")
		List<TbBbs> ul = getHibernateTemplate().find("from TbBbs x where x.bbsId=?",bbsId) ;
		if(ul != null && ul.size() >=1 )
		{
			return ul.get(0) ;
		}
		return null;
	}
	@Override
	public int getnum() {
		Query query = getSession().createQuery("select max(tbBbs.bbsId) from TbBbs tbBbs") ;
		int num = (int) query.uniqueResult();
		if(num != 0){
			return num;
		}
		return 0;
	}
	@Override
	public List<TbBbs> find(String bbsSender) throws Exception {
		@SuppressWarnings("unchecked")
		List<TbBbs> ul = getHibernateTemplate().find("from TbBbs where bbsSender like ?", bbsSender);
		if(ul != null && ul.size() >=1 )
		{
			return ul ;
			
		}
		return null;
	}
	@SuppressWarnings("unchecked")
	public List<TbBbs> findByKeyword(String keyword,String mhcx,String bbsSender) {
		List<TbBbs> ul = null ;
		if(mhcx.equals("true")){
			ul = getHibernateTemplate().find("from TbBbs x where  x.bbsTitle like ? and x.bbsSender like ?",new String[] {'%'+keyword+'%',bbsSender});
		}else{
			ul = getHibernateTemplate().find("from TbBbs x where  x.bbsTitle like ? and x.bbssender like ?",new String[] {keyword,bbsSender}) ;	
		}
		if(ul != null && ul.size() >=1 )
		{
			return ul ;
		}
		return null;
	}

}


