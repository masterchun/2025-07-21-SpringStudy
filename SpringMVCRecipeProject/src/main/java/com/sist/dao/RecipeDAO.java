package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.RecipeMapper;
import com.sist.vo.RecipeVO;

@Repository
public class RecipeDAO {
	@Autowired
	private RecipeMapper mapper;
	
	public List<RecipeVO> recipeListData(int start, int end) {
		return mapper.recipeListData(start, end);
	}
	
	public int recipeTotalPage() {
		return mapper.recipeTotalPage();
	}
}
