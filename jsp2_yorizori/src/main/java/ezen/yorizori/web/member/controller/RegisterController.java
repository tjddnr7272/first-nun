package ezen.yorizori.web.member.controller;

import java.io.IOException;

import javax.management.RuntimeErrorException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ezen.yorizori.domain.common.factory.DaoFactory;
import ezen.yorizori.domain.member.dao.MemberDao;
import ezen.yorizori.domain.member.dto.Member;
import ezen.yorizori.domain.member.service.MemberService;
import ezen.yorizori.domain.member.service.MemberServiceImpl;

/**
 * 회원 등록 화면 요청 처리 / 회원 등록 처리 컨트롤러 서블릿
 */

// 두가지 작업을 동시에 한다
@WebServlet(value = {"/member/signup.do", "/member/register.do"})
public class RegisterController extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   // 비즈니스 객체 사용
   private MemberService memberService = new MemberServiceImpl();
 
   /**
    * 등록 화면 처리 
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //RDB,OPEN API 필요시 사용(모델 사용 X)
      //단순히 회원 가입 화면으로 포워드
      RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/member/registForm.jsp");
      rd.forward(request, response);
   }



/**
 * 회원 등록 처리 
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//jsp가 아니기 때문에 usebean 태그를 못씀..
	// 회원 가입 화면에서 Post 방식으로 전달된 사용자 정보(파라메터) 수신
	// 유효성 검증은 편의상 생략
	
	//한글 꺠지지 않게
	// 가입한 정보들을 받는다!->DB 	테이블에 이동
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	int age = Integer.parseInt(request.getParameter("age"));
	// 잘나오는지 찍어보자
//	System.out.println(id);
//	System.out.println(name);
//	System.out.println(age);
	
	
//	// 서버처리가 없다면?!
//	MemberDao dao = DaoFactory.getInstance().getMemberDao();
//	dao.create(null);
	
	
	// 모델을 이용하여 DB 처리
	// 비즈니스 객체를 이용하여 회원 등록
	// DTO 객체 생성
	//이 코드는 회원 가입 정보를 받아와서 회원 객체(Member)를 생성하고, 
	//MemberService 인터페이스를 구현한 MemberServiceImpl 클래스의 registerMember 메소드를 호출하여 해당 회원을 DB에 등록하는 부분입니다.
	
	Member member = new Member();
	member.setId(id);      
	member.setPassword(password);
	member.setName(name);
	member.setEmail(email);
	member.setAge(age);
	
	//memberService.registerMember(member)를 호출하여 MemberServiceImpl 클래스의 registerMember 메소드를 실행합니다. 
	//이 메소드는 입력받은 회원 정보를 DB에 등록합니다.
		memberService.registerMember(member);
//		throw new RuntimeException(e.getMessage());
	
	
	// 정상 등록이 완료 되면 로그인 화면 페이지로 JSP로 SendRedirect
	response.sendRedirect("/member/login.do");
	
	
	
}
}

