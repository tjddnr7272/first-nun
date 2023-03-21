<%@ page contentType="text/html; charset=utf-8"%>

<html lang="ko">

<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	<title>Yorizori Cookbook</title>
	<!-- Favicon-->
	<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
	<!-- Bootstrap icons-->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
	<!-- Core theme CSS (includes Bootstrap)-->
	<link href="../css/styles.css" rel="stylesheet" />
</head>

<body>
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="#!">Yorizori Cookbook</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
					<li class="nav-item"><a class="nav-link active" aria-current="page" href="#">HOME</a></li>
					<li class="nav-item"><a class="nav-link" href="">요리책 목록</a></li>
					<li class="nav-item"><a class="nav-link"  href="/cookbook/register.do">요리책 등록</a></li>
				</ul>
				<form class="row row-cols-lg-auto g-3 align-items-center" method="post" action="#">
					<div class="col-12">
						<input type="text" size="8" maxlength="8" class="form-control" id="id" placeholder="아이디">
					</div>
					<div class="col-12">
						<input type="password" size="8" maxlength="8" class="form-control" id="passwd" placeholder="비밀번호">
					</div>
					<div class="col-12">
						<div class="form-check">
							<input class="form-check-input" id="saveid" type="checkbox"> <label class="form-check-label"
								for="saveid">아이디 저장</label>
						</div>
					</div>
					<div class="col-12">
						<button type="submit" class="btn btn-primary">로그인</button>
					</div>
					<div class="col-12">
						<a href="#" class="btn btn-warning">회원가입</a>
					</div>
				</form>
			</div>
		</div>
	</nav>
	<!-- Header-->
	<header class="bg-dark py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder text-warning">요리조리 요리책 서비스</h1>
				<p class="lead fw-normal text-white-50 mb-0">세상의 모든 레시피가 여기에</p>
			</div>
		</div>
	</header>
	<!-- Section-->
	<section class="py-5">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">

					<div class="col-auto h2">요리책 등록</div>
					<!-- cookbook Form -->
					<form action="/cookbook/register.do" method="post">
          
						<div class="row mb-3">
							<label for="book_name" class="col-sm-2 col-form-label">요리책명</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="book_name" name="book_name">
							</div>
						</div>
						<div class="row mb-3">
							<label for="author" class="col-sm-2 col-form-label">등록자</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" placeholder="김기정(bangry)" disabled id="book_author">
							</div>
						</div>

						<div class="row mb-3">
							<label for="book_desc" class="col-sm-2 col-form-label">설명</label>
							<div class="col-sm-10">
								<textarea class="form-control" id="book_desc" name="book_desc" rows="5"></textarea>
							</div>
						</div>

						<div class="row mb-3">
							<div class="col-4">
								<a href="#" class="btn btn-warning">요리책 목록</a>
							</div>

							<div class="col-md-4 offset-md-4" style="text-align: right;">
								<button type="submit" class="btn btn-primary">등 록</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- Footer-->

	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Yorizori
				Website 2023</p>
		</div>
	</footer>

	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>

</html>