package com.blog.friend.dao;

import java.util.List;

import com.blog.friend.entity.*;

public interface FriendDao {
	public List<Friend> getAllFriend();//显示好友列表
	public List<Friend> getAllFriendByPage(int pageIndex,
			  int pageSize);//翻页浏览
	public int delete(int fid,String fname,int fage,char fsex);//删除好友ID
	public int insert(int fid,String fname,int fage,char fsex);//添加好友ID
	  public int save(Friend friend);
	  
	  public Friend findById(int fid);//根据ID查找好友
	  public Friend findByNAME(String fname);//根据名字查找好友
}
