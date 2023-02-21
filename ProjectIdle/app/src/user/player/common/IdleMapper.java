package user.player.common;

import java.util.Map;

import user.player.common.dto.PlayerDTO;

public interface IdleMapper {

	int selectPlayerDistinct(Map<String, String> map);

	PlayerDTO selectPlayerIdAndPwd(Map<String, String> map);

	String selectPwdByIdAndEmail(Map<String, String> map);

}
