package user.player.manager.controller;

import java.util.List;
import java.util.Map;

import user.player.common.dto.IngreDTO;
import user.player.manager.service.ManagerService;

public class MangerController {

	private ManagerService managerService = new ManagerService();

	public String createNewIngre(Map<String, String> map) {

		boolean isCreate = managerService.createNewIngre(map);

		String msg;
		if (isCreate) {
			msg = "등록에 성공했습니다.";
		} else {
			msg = "등록에 실패했습니다.";
		}

		return msg;
	}

	public List<IngreDTO> findAllIngre() {

		List<IngreDTO> ingreList = managerService.findAllIngre();

		return ingreList;

	}

}
