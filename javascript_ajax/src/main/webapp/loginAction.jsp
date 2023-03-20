<%@ page contentType="text/plain; charset=UTF-8" %> <%-- 바디가 html로 되있으면 text/html, 텍스트면 plain.. --%>
<%
 String id =request.getParameter("id"); // body : `id=${userID}&pw=${userPw}`,이때설정할게 parameter이름
 String pw =request.getParameter("pw"); 
 System.out.println(id);
 System.out.println(pw);
 out.println(id+","+pw);
%>