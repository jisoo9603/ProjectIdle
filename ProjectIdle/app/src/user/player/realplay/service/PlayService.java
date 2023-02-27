package user.player.realplay.service;

import static user.player.common.Template.getSqlSession;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import user.player.common.dto.PlayerRecipeDTO;
import user.player.realplay.RealPlayMapper;

public class PlayService {

	private RealPlayMapper mapper;

	public PlayerRecipeDTO getOrderMenuInPlayer(Map<String, String>map) {
		SqlSession  sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(RealPlayMapper.class);
		
		PlayerRecipeDTO playerReceip = mapper.getNewOrder(map);
		
		sqlSession.close();
		
		return playerReceip;
	}

}
