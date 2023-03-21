<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="ko">

<head>
<meta charset="utf-8" />
<meta name="viewport"
  content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<title>Yorizori Cookbook</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Bootstrap icons-->
<link
  href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
  rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="/css/styles.css" rel="stylesheet" />
</head>

<body>
  <%-- Navigation --%>
  <%--이렇게 포함시킨 JSP 파일은 해당 JSP 페이지를 처리하는 시점에 그 내용이 포함됩니다. 
  이를 통해 코드의 재사용성을 높이고 유지보수를 용이하게 할 수 있습니다. --%>
  <jsp:include page="/WEB-INF/views/include/nav.jsp" />

  <%-- Section --%>
  <section class="py-5">
    <div class="container">
      <div class="page-header">
        <h2>회원 목록</h2>
      </div>

      <div class="row">
        <form action="/member/search.do" method="get">
          <div class="input-group mb-3">
            <input type="text" name="keyword" class="form-control"
              placeholder="회원 이름 검색" aria-label="Recipient's username"
              aria-describedby="button-addon2">
            <button class="btn btn-outline-secondary" type="submit"
              id="button-addon2">검색</button>
          </div>
        </form>


        <div class="col">
          <a href="/member/signup.do" class="btn btn-primary float-end">회원
            등록</a>
        </div>
      </div>
      <hr class="my-4">
      <div>
        <table class="table">
          <thead>
            <tr>
              <th>아이디</th>
              <th>이름</th>
              <th>이메일</th>
              <th>가입일자</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${list}" var="member">
              <tr>
                <td><a href="#">${member.id}</a></td>
                <td>${member.name}</td>
                <td><a href="mailto:${member.email}">${member.email}</a></td>
                <td>${member.regdate}</td>
              </tr>
            </c:forEach>


          </tbody>
        </table>
      </div>
      <nav aria-label="Page navigation example">
        <ul class="pagination justify-content-center">
          <li class="page-item disabled"><a class="page-link"
            href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
          </a></li>
          <li class="page-item"><a class="page-link" href="#">1</a></li>
          <li class="page-item active" aria-current="page"><a
            class="page-link" href="#">2</a></li>
          <li class="page-item"><a class="page-link" href="#">3</a></li>
          <li class="page-item"><a class="page-link" href="#"
            aria-label="Next"> <span aria-hidden="true">&raquo;</span>
          </a></li>
        </ul>
      </nav>
    </div>


  </section>

  <%-- Footer --%>
  <jsp:include page="/WEB-INF/views/include/footer.jsp" />

  <!-- Bootstrap core JS-->
  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  <!-- Core theme JS-->
  <script src="/js/scripts.js"></script>
</body>

</html>