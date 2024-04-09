package jdbc;

import java.util.List;

public class ProductServiceImpl implements Service {
	
	private DAO dao; //인터페이스
	
	public ProductServiceImpl() {
		dao = new ProductDAOImpl(); //dao 인터페이스의 구현체
	}

	@Override
	public int register(ProductVO p) {
		// 실제구현영역
		System.out.println("register serviceImpl success");
		// 각 DAO에게 저장을 요청(DAO의 갯수만큼 각각 요청해야함)
		// dao 요청시 sql구문과 비슷하게 메서드명을 작성하는 것이 일반적
		return dao.insert(p);
	}

	@Override
	public List<ProductVO> getList() {
		// TODO Auto-generated method stub
		System.out.println("list serviceImpl success");
		return dao.selectList();
	}

	@Override
	public ProductVO getDetail(int pno) {
		// TODO Auto-generated method stub
		System.out.println("getDetail serviceImpl success");
		return dao.selectOne(pno);
	}

	@Override
	public int update(ProductVO p) {
		// TODO Auto-generated method stub
		System.out.println("update serviceImpl success");
		return dao.update(p);
	}

	@Override
	public int delete(int pno) {
		// TODO Auto-generated method stub
		System.out.println("delete serviceImpl success");
		return dao.delete(pno);
	}
}
