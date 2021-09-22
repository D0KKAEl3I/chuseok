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
			<li><a href="/vaccresv">접종예약조회</a></li>
			<li><a href="#">접종인원통계</a></li>
			<li><a href="/">홈으로</a></li>
		</ul>
	</nav>
	<section>
		<h4>백신접종예약</h4>
		<form method="post" action="/vaccresv">
			<table>
				<tr>
					<td>접종예약번호</td>
					<td><input>예) 20210001</td>
				</tr>
				<tr>
					<td>주민번호</td>
					<td><input>예) 710101-1000001</td>
				</tr>
				<tr>
					<td>백신코드</td>
					<td><input>예) V001 ~ V003</td>
				</tr>
				<tr>
					<td>병원코드</td>
					<td><input>예) H001</td>
				</tr>
				<tr>
					<td>예약일자</td>
					<td><input>예) 20211231</td>
				</tr>
				<tr>
					<td>예약시간</td>
					<td><input>예) 1230</td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">등록</button>
						<button type="reset">다시쓰기</button>
					</td>
				</tr>
			</table>
		</form>
	</section>
	<footer>
		<p>HRDKIREA Copyright @ 2021 All rights reserved. Human Resources
			Development Service of Korea</p>
	</footer>
</body>
</html>