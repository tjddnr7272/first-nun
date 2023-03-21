package ezen.yorizori.web.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ezen.yorizori.domain.cookbook.dto.Cookbook;
import ezen.yorizori.domain.cookbook.service.CookbookService;
import ezen.yorizori.domain.cookbook.service.CookbookServiceImpl;
import ezen.yorizori.domain.member.dto.Member;
import ezen.yorizori.domain.member.service.MemberService;
import ezen.yorizori.domain.member.service.MemberServiceImpl;


/**
 * 요리책 등록 화면 요청 처리 / 요리책 등록 처리 컨트롤러 서블릿
 */

@WebServlet("/cookbook/register.do")
public class CBRegisterController extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   // 비즈니스 객체 사용
   private CookbookService cookbookService = new CookbookServiceImpl();
   
   
 
   /**
    * 등록 화면 처리 
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/cookbook/cookbookForm.jsp");
      rd.forward(request, response);
   }
	   
   
   /**
    * 요리책 등록 처리 
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	//jsp가 아니기 때문에 usebean 태그를 못씀..
   	// 회원 가입 화면에서 Post 방식으로 전달된 사용자 정보(파라메터) 수신
   	// 유효성 검증은 편의상 생략
   	
   	//한글 꺠지지 않게
   	// 가입한 정보들을 받는다!->DB 	테이블에 이동
   	request.setCharacterEncoding("utf-8");
   	String cbname = request.getParameter("book_name");
   	String explanation = request.getParameter("book_desc");

   
   	// 잘나오는지 찍어보자
   	System.out.println(cbname);
   	System.out.println(explanation);
   	
   	
//   	// 서버처리가 없다면?!
//   	MemberDao dao = DaoFactory.getInstance().getMemberDao();
//   	dao.create(null);
   	
   	
   	// 모델을 이용하여 DB 처리
   	// 비즈니스 객체를 이용하여 레시피 등록
   	// DTO 객체 생성
   	//이 코드는 요리책 등록 정보를 받아와서 요리책 객체 등록정보를 생성하고, 
   	//MemberService 인터페이스를 구현한 MemberServiceImpl 클래스의 registerMember 메소드를 호출하여 해당 회원을 DB에 등록하는 부분입니다.
   	
   	Cookbook cookbook = new Cookbook();
   	cookbook.setBookname(cbname);
   	cookbook.setExplanation(explanation);
//   	
//   	//memberService.registerMember(member)를 호출하여 MemberServiceImpl 클래스의 registerMember 메소드를 실행합니다. 
//   	//이 메소드는 입력받은 회원 정보를 DB에 등록합니다.
   		cookbookService.registerBook(cookbook);
//   		throw new RuntimeException(e.getMessage());
//   	
//   	
//   	// 정상 등록이 완료 되면 로그인 화면 페이지로 JSP로 SendRedirect
   	response.sendRedirect("/member/login.do");
//   	
   	
   
}
}



