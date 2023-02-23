package user.player.signup.service;

import static user.player.common.Template.getSqlSession;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import user.player.common.SignMapper;
import user.player.common.dto.PlayerDTO;

public class SignService {

	private SignMapper mapper;

	public boolean insertNewPlayer(PlayerDTO player) {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SignMapper.class);

		int result = mapper.insertNewPlayer(player);

		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();

		return result > 0 ? true : false;
	}

	public PlayerDTO findPwdByIdAndEmail(Map<String, String> map) {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SignMapper.class);

		PlayerDTO player = mapper.selectPwdByIdAndEmail(map);

		sqlSession.close();

		return player;
	}
}
