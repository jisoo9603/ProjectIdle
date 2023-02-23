package user.player.common;

import java.util.Map;

import user.player.common.dto.PlayerDTO;

public interface SignMapper {

	int insertNewPlayer(PlayerDTO player);

	PlayerDTO selectPwdByIdAndEmail(Map<String, String> map);

	PlayerDTO selectPlayer(Map<String, String> map);

}
