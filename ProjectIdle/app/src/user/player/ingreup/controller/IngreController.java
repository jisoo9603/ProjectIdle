package user.player.ingreup.controller;

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
	
	public String NewfindIngre(Map<String, String> map) {

		IngreDTO ingre = IngreService.NewfindIngre(map);

		String message;

		if (ingre != null) {
			message = "당신의 비밀번호는 " + ingre.getPass() + "입니다.";
		} else {
			message = "일치하는 비밀번호가 없습니다.";
		}

		return message;
	}

	public void findAllingre() {
		// TODO Auto-generated method stub
		
	}

}