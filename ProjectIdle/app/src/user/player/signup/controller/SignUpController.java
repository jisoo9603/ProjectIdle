package user.player.signup.controller;

import java.util.Map;

import user.player.common.dto.PlayerDTO;
import user.player.signup.service.SignUpService;

public class SignUpController {

	private SignUpService signUpService = new SignUpService();

	public String findUserDistinct(Map<String, String> map) {

		String message;

		if (signUpService.findPlayerDistinct(map)) {
			message = "사용 가능 합니다.";
		} else {
			message = "이미 사용 중 입니다.";
		}

		return message;
	}

	public boolean insertNewPlayer(Map<String, String> map) {

		return signUpService.insertNewPlayer(map);

	}

	public PlayerDTO findPlayerIdAndPwd(Map<String, String> map) {

		PlayerDTO player = signUpService.findPlayerIdAndPwd(map);

		return player;
	}

	public String findPwdByIdAndEmail(Map<String, String> map) {

		String pwd = signUpService.findPwdByIdAndEmail(map);
		if (pwd != null) {
			return pwd;
		} else {
			return "일치하는 비밀번호가 없습니다.";
		}

	}

}
