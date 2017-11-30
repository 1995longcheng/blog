package com.blog.friend.service;

import java.util.List;

import com.blog.friend.entity.Friend;
public interface FriendService {
	
	//查找所有的好友
	  public List<Friend> getAllFriend();
		//分页显示，pageIndex页码，pageSize,每页多少条
	  public List<Friend> getAllFriendByPage(int pageIndex,
			  int pageSize);
	  //根据好友ID删除好友
	  public int delete(int fid);
	  public int save(Friend friend);
	  //根据ID显示某个好友
	  public Friend findById(int fid);
	public int getPageMax(int pageSize);

}
