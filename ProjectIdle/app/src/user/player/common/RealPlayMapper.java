package user.player.common;

import java.util.List;

import user.player.common.dto.PlayerDTO;
import user.player.common.dto.PlayerRecipeDTO;


public interface RealPlayMapper {

	List<String> searchRecipeByRandomRecipeCode(PlayerDTO player);
	
}
