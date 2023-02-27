package user.player.ingreup.controller;

import java.util.List;
import java.util.Map;

import user.player.common.dto.IngreDTO;
import user.player.ingreup.service.IngreService;


public class IngreController {
	private IngreService ingreService = new IngreService();

	public boolean insertNewIngre(Map<String, String>map) {

		IngreDTO ingre = new IngreDTO();
		ingre.setNo(Integer.parseInt(map.get("no")));
		ingre.setName(map.get("name"));
		ingre.setPrice(Integer.parseInt(map.get("price")));
		ingre.setImg(map.get("image"));

		boolean isCreate = ingreService.insertNewIngre(ingre);

		return isCreate;
	}

	public List<IngreDTO> findAllingre() {

		
		List<IngreDTO> ingreDTO = ingreService.findAllingre();
		
		return ingreDTO;
		
		
	}
	
	

}