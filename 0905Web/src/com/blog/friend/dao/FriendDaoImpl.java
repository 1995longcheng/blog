package com.blog.friend.dao;

import java.util.List;

import com.blog.friend.entity.Friend;
import com.blog.friend.dao.BaseDao;
import com.blog.friend.dao.FriendDao;

public abstract class FriendDaoImpl extends BlogDao implements FriendDao {

	@Override
	public List readFirstFriend() {
		// TODO Auto-generated method stub
		return super.readFirstFriend();
	}

	public Friend findByNAME(String fname) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> getAllFriendByPage(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public int delete(int fid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(int fid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int save(Friend friend) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Friend findById(int fid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Friend> getAllFriend() {
		// TODO Auto-generated method stub
		return null;
	}

	public int delete(int fid, String fname, int fage, char fsex) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(int fid, String fname, int fage, char fsex) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	


}
