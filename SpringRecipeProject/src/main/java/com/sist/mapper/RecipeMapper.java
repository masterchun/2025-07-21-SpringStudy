package com.sist.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.RecipeVO;

public interface RecipeMapper {
	@Select("SELECT * FROM recipe WHERE ${column} LIKE '%'||#{ss}||'%'")
	public List<RecipeVO> recipeListData(Map map);
	
	@Select("SELECT COUNT(*) FROM recipe WHERE ${column} LIKE '%'||#{ss}||'%'")
	public int recipeCountData(Map map);
}
