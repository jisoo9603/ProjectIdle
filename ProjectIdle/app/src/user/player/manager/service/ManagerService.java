package user.player.manager.service;

import static user.player.common.Template.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import user.player.common.ManagerMapper;
import user.player.common.dto.IngreDTO;

public class ManagerService {
	private ManagerMapper mapper;

	public boolean createNewIngre(Map<String, String> map) {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ManagerMapper.class);

		int result = mapper.insertNewIngre(map);

		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0 ? true : false;
	}

	public List<IngreDTO> findAllIngre() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ManagerMapper.class);

		List<IngreDTO> ingreList = mapper.selectAllIngre();

		sqlSession.close();

		return ingreList;
	}

}
