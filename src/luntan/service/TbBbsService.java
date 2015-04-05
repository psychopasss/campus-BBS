package luntan.service;
import luntan.model.TbBbs ;
import luntan.model.TbBbsAnswer;

import java.util.List ;

public interface TbBbsService {
	/**************************帖子处理*******************************/
	public void insert(TbBbs tz) throws Exception ;//发表帖子	
	public void delete(int id) throws Exception ;//利用帖子编号，删除帖子
	public void update(TbBbs tz) throws Exception ;//修改帖子
	public List<TbBbs> find(int bbsClass) throws Exception ;//根据板块id列出相应的帖子
	public List<TbBbs> findByKeyword(String keyword,String mhcx,int bbsClass) throws Exception ;//在板块内搜索相应的帖子
	public List<TbBbs> find(String bbsSender) throws Exception ;//根据发帖人id列出相应的帖子
	public List<TbBbs> findByKeyword(String keyword,String mhcx,String bbsSender) throws Exception ;//在对应的发帖人id中搜索相应的帖子
	public TbBbs detail(int id) throws Exception ;//帖子详情
	public int getnum() throws Exception ;//获取最大的帖子id
	/**************************帖子回复处理*******************************/
	public void insert(TbBbsAnswer tbBbs) ;//发表回复
	public void deleteAnswer(int bbsAnswerId,int bbsAnswerFloorid) ;//利用帖子编号，楼层编号删除指定回复
	public void update(TbBbsAnswer tbBbs) ;//修改回复
	public List<TbBbsAnswer> findAnswer(int bbsAnswerId) throws Exception ;//他人对我的帖子的回复
	public List<TbBbsAnswer> findByKeywordAnswer(String keyword,String mhcx,int bbsAnswerId) ;//帖子内搜索
	public List<TbBbsAnswer> findAnswer(String bbsAnswerSender) throws Exception ;//我的所有回帖
	public List<TbBbsAnswer> findByKeywordAnswer(String keyword,String mhcx,String bbsAnswerSender) ;//我的所有回帖中搜索 
	public int getfloornum(int bbsAnswerId) throws Exception;//获取最大的楼层号
	public void deleteAnswerall(int id);//利用帖子编号删除指定帖子内所有回复
	public TbBbsAnswer detail(int bbsAnswerId,int bbsAnswerFloorid) ;//利用帖子编号，楼层编号查看指定回复
	public List<TbBbsAnswer> findAnswer2(String bbsSender) throws Exception;//他人对我的帖子的回复
}
