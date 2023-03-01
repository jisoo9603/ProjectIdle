package user.player.common;

import java.util.Map;

import user.player.common.dto.PlayerDTO;

public interface PlayerMapper {

	int insertNewPlayer(PlayerDTO player);

	PlayerDTO selectPlayer(Map<String, String> map);


}
