package com.blog.friend.service;

import java.util.List;

import com.blog.friend.dao.FriendDao;
import com.blog.friend.dao.FriendDaoImpl;
import com.blog.friend.entity.Friend;

public class FriendServiceImpl implements FriendService {

	private  FriendDao friendDao=new FriendDaoImpl();

	public List<Friend> getAllFriend() {
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

	public int save(Friend friend) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Friend findById(int fid) {
		// TODO Auto-generated method stub
		return null;
	}

}
