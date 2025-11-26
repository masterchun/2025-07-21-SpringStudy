package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.*;
import com.sist.vo.*;

@Repository
public class BoardDAO {
	@Autowired
	private BoardMapper mapper;
	
	public List<BoardVO> boardListData(int start, int end) {
		return mapper.boardListData(start, end);
	}
	
	public int boardTotalPage() {
		return mapper.boardTotalPage();
	}
	
	public void boardInsert(BoardVO vo) {
		mapper.boardInsert(vo);
	}
	
	public BoardVO boardDetail(int no) {
		mapper.hitIncrement(no);
		return mapper.boardDetail(no);
	}
	
	public String boardDelete(int no, String pwd) {
		String res = "no";
		String db_pwd = mapper.boardGetPassword(no);
		if(db_pwd.equals(pwd)) {
			res = "yes";
			mapper.boardDelete(no);
		}
		return res;
	}
	
	public BoardVO boardUpdateData(int no) {
		return mapper.boardDetail(no);
	}
	
	public boolean boardUpdate(BoardVO vo) {
		boolean res = false;
		String db_pwd = mapper.boardGetPassword(vo.getNo());
		if(db_pwd.equals(vo.getPwd())) {
			res = true;
			mapper.boardUpdate(vo);
		}
		return res;
	}
}
