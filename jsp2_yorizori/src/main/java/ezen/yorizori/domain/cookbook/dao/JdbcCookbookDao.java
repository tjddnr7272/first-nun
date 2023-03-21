package ezen.yorizori.domain.cookbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.eclipse.jdt.internal.compiler.batch.Main;

import ezen.yorizori.domain.common.factory.DaoFactory;
import ezen.yorizori.domain.cookbook.dto.Cookbook;
import ezen.yorizori.domain.member.dao.MemberDao;
import ezen.yorizori.domain.member.dto.Member;

public class JdbcCookbookDao implements CookbookDao {
	
	private DataSource dataSource;

	// 생성자 추가하여 DataSource 초기화 하는거라 함
	public JdbcCookbookDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void create(Cookbook cookbook) throws SQLException { 
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    StringBuilder sb = new StringBuilder();
	    sb.append(" INSERT INTO cookbook (book_id, name, describe, author_id)").append(" VALUES(cookbook_seq.NEXTVAL, ?, ?, ?)");
	    try {
	        con = dataSource.getConnection();
	        con.setAutoCommit(false);
	        pstmt = con.prepareStatement(sb.toString());
	        pstmt.setString(1, cookbook.getBookname());
	        pstmt.setString(2, cookbook.getExplanation());
	        pstmt.setString(3, cookbook.getAuthorId()); // 새로 추가된 줄입니다.
	        pstmt.executeUpdate();
	        con.commit();
	    } catch (SQLException e) {
	        try {
	            if (con != null) con.rollback(); // rollback에 대한 예외 처리 추가
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	        throw e;
	    } finally {
	        try {
	            if (pstmt != null) pstmt.close();
	            // 사용 후 커넥션 반납 (닫는 것 아님. 반납임!)
	            if(con != null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	// 테스트를 위한 임시 main
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    CookbookDao dao = DaoFactory.getInstance().getCookbookDao();

	    // 'authorId' 값을 적절하게 설정해 주자. 예를 들어, "bangry" 또는 
	    //"gildong"과 같은 실제 데이터베이스에 있는 작성자 ID를 사용할 수 있음!!
	    String authorId = "bangry";
	    Cookbook cookbook = new Cookbook("bookname", "explanation", authorId);
	    dao.create(cookbook);

	    System.out.println("Cookbook 생성 완료");
	}


			
		

		
		
	}

