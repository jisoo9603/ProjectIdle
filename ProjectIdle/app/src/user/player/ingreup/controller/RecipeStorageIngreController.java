package user.player.ingreup.controller;

import java.util.List;
import java.util.Map;

import user.player.common.dto.RecipeStorageIngreDTO;
import user.player.ingreup.service.RecipeStorageIngreService;

public class RecipeStorageIngreController {
	private RecipeStorageIngreService recipeStorageIngreService = new RecipeStorageIngreService();
	
	public List<RecipeStorageIngreDTO> findRecipeStorageIngre(Map<String, String> map) {
		
		List<RecipeStorageIngreDTO> recipeStorageIngreDTO = recipeStorageIngreService.findRecipeStorageIngre(map);
		
		return recipeStorageIngreDTO;
	}

}
