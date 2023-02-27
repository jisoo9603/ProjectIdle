package user.player.realplay;

import java.util.List;
import java.util.Map;

import user.player.common.dto.PlayerRecipeDTO;


public interface RealPlayMapper {

	PlayerRecipeDTO getNewOrder(Map<String, String> map);
	


}
