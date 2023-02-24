package user.player.common;

import java.util.List;
import java.util.Map;

import user.player.common.dto.IngreDTO;

public interface IngreMapper {

	int insertNewIngre(IngreDTO ingre);

	List<IngreDTO> selectAllingre();

	
}
