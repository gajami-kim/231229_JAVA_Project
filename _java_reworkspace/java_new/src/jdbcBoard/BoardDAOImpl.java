package jdbcBoard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements DAO {
	
	//DB연결
	private Connection conn;
	private PreparedStatement pst;
	private String query="";

	public BoardDAOImpl() {
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}
	
	@Override
	public int insert(BoardVO b) {
		System.out.println("insert DAOImpl success");
		query = "insert into Board(title, writer, content) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getWriter());
			pst.setString(3, b.getContent());
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert Error!");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<BoardVO> selectList() {
		System.out.println("list DAOImpl success");
		query ="select * from board order by bno desc";
		List<BoardVO> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(new BoardVO(
						rs.getInt("bno"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content")
						));
			}
			return list;
		} catch (SQLException e) {
			System.out.println("list Error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(BoardVO b) {
		System.out.println("list DAOImpl success");
		query = "update board set title=?, content=?, moddate=now() where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getContent());
			pst.setInt(3, b.getBno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update Error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public BoardVO selectOne(int bno) {
		System.out.println("selectOne DAOImpl success");
		query = "select * from board where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new BoardVO(
						rs.getInt("bno"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("writer"),
						rs.getString("regdate"),
						rs.getString("moddate")
						);
			}
		} catch (SQLException e) {
			System.out.println("detail Error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete(int bno) {
		System.out.println("selectOne DAOImpl success");
		query = "delete from board where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("delete Error");
			e.printStackTrace();
		}
		return 0;
	}

}
