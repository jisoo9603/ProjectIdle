package user.player.ingreup.controller;


import java.util.List;

import user.player.common.dto.RecipeDTO;
import user.player.ingreup.service.RecipeService;

public class RecipeController {
	private RecipeService recipeService = new RecipeService();
	
	public List<RecipeDTO> findAllrecipe() {
		
		List<RecipeDTO> recipeDTO = recipeService.findAllrecipe();
		
		return recipeDTO;
	}

}
