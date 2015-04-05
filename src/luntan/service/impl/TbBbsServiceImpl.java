package luntan.service.impl;
import java.util.List;

import luntan.dao.TbBbsAnswerDAO;
import luntan.dao.TbBbsDAO;
import luntan.model.TbBbs ;
import luntan.model.TbBbsAnswer;
import luntan.service.TbBbsService;
public class TbBbsServiceImpl implements TbBbsService{
		/**************************接收DAO组件*******************************/
		private TbBbsDAO tbBbsDao ;//帖子处理DAO组件
		public void setTbBbsDao(TbBbsDAO tbBbsDao){
			this.tbBbsDao = tbBbsDao ;
			}
		private TbBbsAnswerDAO tbBbsAnswerDao ;//帖子回复处理DAO组件
		public void setTbBbsAnswerDao(TbBbsAnswerDAO tbBbsAnswerDao){
			this.tbBbsAnswerDao = tbBbsAnswerDao ;
			}
		/**************************帖子处理*******************************/
		public void insert(TbBbs tbBbs) throws Exception {
			tbBbsDao.insert(tbBbs) ;
		}
		public void delete(int id) throws Exception {
			tbBbsDao.delete(id) ;
		}
		public void update(TbBbs tbBbs) throws Exception {
			tbBbsDao.update(tbBbs) ;
		}
		public List<TbBbs> find(int bbsClass) throws Exception {
			List<TbBbs> ul = tbBbsDao.find(bbsClass) ;
			if(ul != null){
				return ul ;
				}
			return null ;
		}
		public List<TbBbs> findByKeyword(String keyword,String mhcx,int bbsClass) throws Exception {
			List<TbBbs> ul = tbBbsDao.findByKeyword(keyword,mhcx,bbsClass) ;
			if(ul != null){
				return ul ;
				}
			return null ;
		}
		public TbBbs detail(int id) throws Exception {
			TbBbs u = tbBbsDao.detail(id) ;
			if(u != null){
				return u ;
				}
			return null ;
		}
		@Override
		public int getnum() throws Exception {
			// TODO Auto-generated method stub
			int num = tbBbsDao.getnum();
			if(num != 0){
				return num;
			}
			return 0;
		}
		@Override
		public List<TbBbs> find(String bbsSender) throws Exception {
			// TODO Auto-generated method stub
			List<TbBbs> ul = tbBbsDao.find(bbsSender) ;
			if(ul != null){
				return ul ;
				}
			return null;
		}
		@Override
		public List<TbBbs> findByKeyword(String keyword, String mhcx,
				String bbsSender) throws Exception {
			// TODO Auto-generated method stub
			List<TbBbs> ul = tbBbsDao.findByKeyword(keyword,mhcx,bbsSender) ;
			if(ul != null){
				return ul ;
				}
			return null;
		}
		/**************************帖子回复处理*******************************/
		@Override
		public void insert(TbBbsAnswer tbBbsAnswer) {
			// TODO Auto-generated method stub
			tbBbsAnswerDao.insert(tbBbsAnswer) ;
		}
		@Override
		public void deleteAnswer(int bbsAnswerId,int bbsAnswerFloorid) {
			// TODO Auto-generated method stub
			tbBbsAnswerDao.delete(bbsAnswerId,bbsAnswerFloorid) ;
		}
		@Override
		public void update(TbBbsAnswer tbBbsAnswer) {
			// TODO Auto-generated method stub
			tbBbsAnswerDao.update(tbBbsAnswer) ;
		}
		@Override
		public List<TbBbsAnswer> findAnswer(int bbsAnswerId) throws Exception {
			// TODO Auto-generated method stub
			List<TbBbsAnswer> ul = tbBbsAnswerDao.find(bbsAnswerId) ;
			if(ul != null){
				return ul ;
				}
			return null;
		}
		@Override
		public List<TbBbsAnswer> findByKeywordAnswer(String keyword,
				String mhcx, int bbsAnswerId) {
			// TODO Auto-generated method stub
			List<TbBbsAnswer> ul = tbBbsAnswerDao.findByKeyword(keyword,mhcx,bbsAnswerId) ;
			if(ul != null){
				return ul ;
				}
			return null;
		}
		@Override
		public List<TbBbsAnswer> findAnswer(String bbsAnswerSender)
				throws Exception {
			// TODO Auto-generated method stub
			List<TbBbsAnswer> ul = tbBbsAnswerDao.find(bbsAnswerSender) ;
			if(ul != null){
				return ul ;
				}
			return null;
		}
		@Override
		public List<TbBbsAnswer> findByKeywordAnswer(String keyword,
				String mhcx, String bbsAnswerSender) {
			// TODO Auto-generated method stub
			List<TbBbsAnswer> ul = tbBbsAnswerDao.findByKeyword(keyword,mhcx,bbsAnswerSender) ;
			if(ul != null){
				return ul ;
				}
			return null;
		}
		@Override
		public int getfloornum(int bbsAnswerId) throws Exception {
			// TODO Auto-generated method stub
			int floor = tbBbsAnswerDao.getfloor(bbsAnswerId) ;
			if(floor != 0){
				return floor;
			}
			return 0;
		}
		@Override
		public void deleteAnswerall(int id) {
			// TODO Auto-generated method stub
			tbBbsAnswerDao.delete(id) ;
		}
		@Override
		public TbBbsAnswer detail(int bbsAnswerId, int bbsAnswerFloorid) {
			// TODO Auto-generated method stub
			TbBbsAnswer u1 = tbBbsAnswerDao.detail(bbsAnswerId,bbsAnswerFloorid) ;
			if(u1 != null){
				return u1 ;
				}
			return null;
		}
		@Override
		public List<TbBbsAnswer> findAnswer2(String bbsSender) throws Exception{
			// TODO Auto-generated method stub
			List<TbBbsAnswer> ul = tbBbsAnswerDao.find2(bbsSender) ;
			if(ul != null){
				return ul ;
				}
			return null;
		}
	}


