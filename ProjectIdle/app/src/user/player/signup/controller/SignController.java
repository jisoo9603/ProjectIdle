package user.player.signup.controller;

import java.util.Map;

import user.player.common.dto.PlayerDTO;
import user.player.signup.service.SignService;

public class SignController {
	private SignService signService = new SignService();

	public boolean insertNewPlayer(Map<String, String> map) {

		PlayerDTO player = new PlayerDTO();
		player.setName(map.get("name"));
		player.setId(map.get("id"));
		player.setPass(map.get("pwd"));
		player.setEmail(map.get("email"));

		boolean isCreate = signService.insertNewPlayer(player);

		return isCreate;

	}

	public String findPwdByIdAndEmail(Map<String, String> map) {

		PlayerDTO player = signService.findPwdByIdAndEmail(map);

		String message;

		if (player != null) {
			message = "당신의 비밀번호는 " + player.getPass() + "입니다.";
		} else {
			message = "일치하는 비밀번호가 없습니다.";
		}

		return message;
	}

}
