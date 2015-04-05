package luntan.dao;

import java.util.List;

import luntan.model.TbBbsAnswer;

public interface TbBbsAnswerDAO {
	public void insert(TbBbsAnswer tbBbs) ;//发表回复
	public void delete(int bbsAnswerId,int bbsAnswerFloorid) ;//利用帖子编号，楼层编号删除指定回复
	public void update(TbBbsAnswer tbBbs) ;//修改回复
	public List<TbBbsAnswer> find(int bbsAnswerId) throws Exception ;//他人对我的帖子的回复
	public List<TbBbsAnswer> findByKeyword(String keyword,String mhcx,int bbsAnswerId) ;//帖子内搜索
	public List<TbBbsAnswer> find(String bbsAnswerSender) throws Exception ;//我的所有回帖
	public List<TbBbsAnswer> findByKeyword(String keyword,String mhcx,String bbsAnswerSender) ;//我的所有回帖中搜索 
	public int getfloor(int bbsAnswerId);//获取最大楼层数
	public void delete(int id) ;////利用帖子编号删除指定帖子内所有回复
	public TbBbsAnswer detail(int bbsAnswerId,int bbsAnswerFloorid) ;//利用帖子编号，楼层编号查看指定回复
	public List<TbBbsAnswer> find2(String bbsSender)throws Exception;
}
