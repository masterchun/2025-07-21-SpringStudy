package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.*;
import com.sist.vo.*;

@Repository
public class StudentDAO {
	@Autowired
	private StudentMapper mapper;
	
	public void studentInsert(StudentVO vo) {
		mapper.studentInsert(vo);
	}
	
	public List<StudentVO> studentListData() {
		return mapper.studentListData();
	}
	
	public void studentUpdate(StudentVO vo) {
		mapper.studentUpdate(vo);
	}
	
	public StudentVO studentDetailData(int hakbun) {
		return mapper.studentDetailData(hakbun);
	}
	
	public void studentDelete(int hakbun) {
		mapper.studentDelete(hakbun);
	}
}
