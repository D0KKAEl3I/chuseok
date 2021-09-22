<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header> (과정평가형 정보처리산업기사) 백신접종예약 프로그램 ver 2021-08 </header>
	<nav>
		<ul>
			<li><a href="#">백신접종예약</a></li>
			<li><a href="/lookupresv">접종예약조회</a></li>
			<li><a href="#">접종인원통계</a></li>
			<li><a href="/">홈으로</a></li>
		</ul>
	</nav>
	<section>
		<h1>접종예약정보가 존재하지 않습니다</h1>
		<button onclick="redirect('/lookupresv')">돌아가기</button>
	</section>
	<footer>
		<p>HRDKIREA Copyright @ 2021 All rights reserved. Human Resources
			Development Service of Korea</p>
	</footer>
</body>
</html>