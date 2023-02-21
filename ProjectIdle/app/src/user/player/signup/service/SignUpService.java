package user.player.signup.service;

import static user.player.common.Template.getSqlSession;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import user.player.common.IdleMapper;
import user.player.common.dto.PlayerDTO;

public class SignUpService {

	private IdleMapper mapper;

	public boolean findPlayerDistinct(Map<String, String> map) {

		// SqlSession sqlSession = getSqlSession();
		// mapper = sqlSession.getMapper(IdleMapper.class);
		//
		// int result = mapper.selectPlayerDistinct(map);
		//
		// sqlSession.close();
		// return result > 0 ? false : true;
		return true;
	}

	public boolean insertNewPlayer(Map<String, String> map) {

		// SqlSession sqlSession = getSqlSession();
		// mapper = sqlSession.getMapper(IdleMapper.class);
		//
		// int result = mapper.selectPlayerDistinct(map);
		//
		// if (result > 0) {
		// sqlSession.commit();
		// } else {
		// sqlSession.rollback();
		// }
		//
		// sqlSession.close();
		//
		// return result > 0 ? false : true;
		return true;
	}

	public PlayerDTO findPlayerIdAndPwd(Map<String, String> map) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(IdleMapper.class);

		PlayerDTO player = mapper.selectPlayerIdAndPwd(map);

		sqlSession.close();
		return player;
	}

	public String findPwdByIdAndEmail(Map<String, String> map) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(IdleMapper.class);

		String pwd = mapper.selectPwdByIdAndEmail(map);

		sqlSession.close();
		return pwd;
	}

}
