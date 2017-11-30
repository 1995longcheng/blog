package com.blog.friend.dao;

import java.util.List;

import com.blog.friend.entity.*;

public interface FriendDao {
	public List<Friend> getAllFriend();//��ʾ�����б�
	public List<Friend> getAllFriendByPage(int pageIndex,
			  int pageSize);//��ҳ���
	public int delete(int fid,String fname,int fage,char fsex);//ɾ������ID
	public int insert(int fid,String fname,int fage,char fsex);//��Ӻ���ID
	  public int save(Friend friend);
	  
	  public Friend findById(int fid);//����ID���Һ���
	  public Friend findByNAME(String fname);//�������ֲ��Һ���
}
