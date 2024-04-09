package jdbcBoard;

import java.util.List;

public interface Service {

	int register(BoardVO b);

	List<BoardVO> getList();

	int modify(BoardVO b);

	BoardVO getDetail(int bno);

	int delete(int bno);

}
