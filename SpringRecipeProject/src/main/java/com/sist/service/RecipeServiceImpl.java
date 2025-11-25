package com.sist.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.dao.RecipeDAO;
import com.sist.vo.RecipeVO;

@Service("rService")
public class RecipeServiceImpl implements RecipeService {
	@Autowired
	private RecipeDAO rDao;

	@Override
	public List<RecipeVO> recipeListData(Map map) {
		// TODO Auto-generated method stub
		return rDao.recipeListData(map);
	}

	@Override
	public int recipeCountData(Map map) {
		// TODO Auto-generated method stub
		return rDao.recipeCountData(map);
	}
}
