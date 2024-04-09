package jdbcBoard;

import java.util.List;

public class BoardServiceImpl implements Service {
	
	private DAO dao;

	public BoardServiceImpl() {
		dao = new BoardDAOImpl();
	}
	
	@Override
	public int register(BoardVO b) {
		System.out.println("register serviceImpl success");
		return dao.insert(b);
	}

	@Override
	public List<BoardVO> getList() {
		System.out.println("list serviceImpl success");
		return dao.selectList();
	}

	@Override
	public int modify(BoardVO b) {
		System.out.println("modify serviceImpl success");
		return dao.update(b);
	}

	@Override
	public BoardVO getDetail(int bno) {		
		System.out.println("detail serviceImpl success");
		return dao.selectOne(bno);
	}

	@Override
	public int delete(int bno) {
		System.out.println("delete serviceImpl success");
		return dao.delete(bno);
	}
}
