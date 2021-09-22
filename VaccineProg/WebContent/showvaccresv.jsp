<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./global.css">
<link rel="stylesheet" type="text/css" href="./table.css">
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
		<h4>예약번호   의 접종예약조회</h4>
			<table>
				<tr>
					<td>이름</td>
					<td>주민번호</td>
					<td>성별</td>
					<td>전화번호</td>
					<td>예약일자</td>
					<td>예약시간</td>
					<td>병원명</td>
					<td>대표전화</td>
					<td>병원주소</td>
					<td>백신종류</td>
				</tr>
				<tr>
					<td><%= request.getAttribute("pname") %></td>
					<td><%= request.getAttribute("jumin") %></td>
					<td><%= request.getAttribute("gender") %></td>
					<td><%= request.getAttribute("tel") %></td>
					<td><%= request.getAttribute("resvdate") %></td>
					<td><%= request.getAttribute("resvtime") %></td>
					<td><%= request.getAttribute("hospname") %></td>
					<td><%= request.getAttribute("hosptel") %></td>
					<td><%= request.getAttribute("hospaddr") %></td>
					<td><%= request.getAttribute("vcode") %></td>
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