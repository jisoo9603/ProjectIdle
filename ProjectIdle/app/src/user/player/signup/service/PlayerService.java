package user.player.signup.service;

import static user.player.common.Template.getSqlSession;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import user.player.common.PlayerMapper;
import user.player.common.dto.PlayerDTO;

public class PlayerService {

	private PlayerMapper mapper;

	public boolean insertNewPlayer(PlayerDTO player) {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PlayerMapper.class);

		int result = mapper.insertNewPlayer(player);

		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();

		return result > 0 ? true : false;
	}

	public PlayerDTO findPlayer(Map<String, String> map) {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(PlayerMapper.class);

		PlayerDTO player = mapper.selectPlayer(map);

		sqlSession.close();

		return player;
	}

}
