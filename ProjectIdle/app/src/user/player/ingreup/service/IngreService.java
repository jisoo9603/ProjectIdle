package user.player.ingreup.service;

import static user.player.common.Template.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import user.player.common.IngreMapper;
import user.player.common.dto.IngreDTO;


public class IngreService {
	
	private IngreMapper mapper;
	
	public boolean insertNewIngre(IngreDTO ingre) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(IngreMapper.class);
		
		int result = mapper.insertNewIngre(ingre);

		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0 ? true : false;
		
	}
	

	public List<IngreDTO> findAllingre() {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(IngreMapper.class);
		
		List<IngreDTO> ingreList = mapper.selectAllingre();

		sqlSession.close();

		return ingreList;
		
	}


}
