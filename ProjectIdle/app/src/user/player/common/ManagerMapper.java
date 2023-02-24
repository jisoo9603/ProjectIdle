package user.player.common;

import java.util.List;
import java.util.Map;

import user.player.common.dto.IngreDTO;

public interface ManagerMapper {

	int insertNewIngre(Map<String, String> map);

	List<IngreDTO> selectAllIngre();

}
