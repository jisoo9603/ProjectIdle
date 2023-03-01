package user.player.realplay.controller;

import java.util.List;

import user.player.common.dto.PlayerDTO;
import user.player.common.dto.PlayerRecipeDTO;
import user.player.realplay.service.PlayService;

public class PlayController {
	
	private final PlayService playService;
	
	public PlayController() {
		this.playService = new PlayService();
	}

	public List<String> searchRecipeByRandomRecipeCode(PlayerDTO player) {
		List<String> playRecipeList = playService.searchRecipeByRandomRecipeCode(player);
		
		if(playRecipeList != null) {
			System.out.println(playRecipeList);
		}else {
			System.out.println("No");
		}
		return playRecipeList;
	}
	
//	
}
