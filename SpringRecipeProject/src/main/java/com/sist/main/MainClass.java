package com.sist.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.service.RecipeService;
import com.sist.vo.RecipeVO;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("application-*.xml");
		Scanner scan = new Scanner(System.in);
		System.out.print("쉐프(1) 또는 레시피(2) 입력 : ");
		int column = scan.nextInt();
		String[] strColumn = {"", "chef", "title"};
		System.out.print("검색어 입력 : ");
		String ss = scan.next();
		
		Map map = new HashMap();
		map.put("column", strColumn[column]);
		map.put("ss", ss);
		
		RecipeService rs = (RecipeService) app.getBean("rService");
		List<RecipeVO> list = rs.recipeListData(map);
		int count = rs.recipeCountData(map);
		
		System.out.println("검색 결과 : " + count);
		for(RecipeVO vo:list) {
			System.out.println(vo.getChef() + " " + vo.getTitle());
		}
	}
}
