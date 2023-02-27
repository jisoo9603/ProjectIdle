 package user.player.common;

import java.util.List;
import java.util.Map;

import user.player.common.dto.RecipeStorageIngreDTO;

public interface RecipeStorageIngreMapper {

	public List<RecipeStorageIngreDTO> findRecipeStorageIngre(Map<String, String> map);
	
}
