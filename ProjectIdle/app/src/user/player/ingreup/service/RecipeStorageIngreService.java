package user.player.ingreup.service;

import static user.player.common.Template.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import user.player.common.RecipeStorageIngreMapper;
import user.player.common.dto.RecipeStorageIngreDTO;

public class RecipeStorageIngreService {
	
	private RecipeStorageIngreMapper mapper;

	public List<RecipeStorageIngreDTO> findRecipeStorageIngre(Map<String, String> map) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(RecipeStorageIngreMapper.class);
		
		List<RecipeStorageIngreDTO> recipeStorageIngreList = mapper.findRecipeStorageIngre(map);

		sqlSession.close();

		return recipeStorageIngreList;
	
	}

}
