package luntan.dao;

import java.util.List;

import luntan.model.TbBbs;

public interface TbBbsDAO {
	public void insert(TbBbs tbBbs) ;
	public void delete(int id) ;
	public void update(TbBbs tbBbs) ;
	public List<TbBbs> find(int bbsClass) throws Exception ;
	public List<TbBbs> findByKeyword(String keyword,String mhcx,int bbsClass) ;
	public List<TbBbs> find(String bbsSender) throws Exception ;
	public List<TbBbs> findByKeyword(String keyword,String mhcx,String bbsSender) ;
	public TbBbs detail(int id) ;
    public int getnum();
}
