package user.player.common;

import java.util.Map;

import user.player.common.dto.IngreDTO;

public interface IngreMapper {

	int insertNewIngre(IngreDTO ingre);

	IngreDTO selectIngre(Map<String, String> map);
	
}
