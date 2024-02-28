package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestVo;

@Service
public class GuestbookService {

	@Autowired
	private GuestbookDao guestbookDao;
	
	public List<GuestVo> exeList() {
		System.out.println("GuestbookController.exeList()");
		
		List<GuestVo> guestbookList=guestbookDao.guestRead();
		
		return guestbookList;
	}

	public int exeWrite(GuestVo guestVo) {
		System.out.println("GuestbookController.exeWrite()");
		
		int count = guestbookDao.guestWrite(guestVo);
		
		return count;
		
	}

	public void exeDelete(int no, String password) {
		System.out.println("GuestbookController.exeDelete()");
		System.out.println(no);
		System.out.println(password);
		int count = guestbookDao.delete(no, password);
	}

	
	

}
