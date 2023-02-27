package user.player.ingreup.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import user.player.common.RecipeMapper;
import user.player.common.dto.RecipeDTO;

import static user.player.common.Template.getSqlSession;

public class RecipeService {
	
	private RecipeMapper mapper;

	public List<RecipeDTO> findAllrecipe() {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(RecipeMapper.class);
		
		List<RecipeDTO> recipeList = mapper.selectAllrecipe();

		sqlSession.close();

		return recipeList;
	
	}

}
