package com.blog.friend.service;

import java.util.List;

import com.blog.friend.entity.Friend;
public interface FriendService {
	
	//�������еĺ���
	  public List<Friend> getAllFriend();
		//��ҳ��ʾ��pageIndexҳ�룬pageSize,ÿҳ������
	  public List<Friend> getAllFriendByPage(int pageIndex,
			  int pageSize);
	  //���ݺ���IDɾ������
	  public int delete(int fid);
	  public int save(Friend friend);
	  //����ID��ʾĳ������
	  public Friend findById(int fid);
	public int getPageMax(int pageSize);

}
