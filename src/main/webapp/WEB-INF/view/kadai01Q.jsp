<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Kadai01dto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記の内容で登録します。よろしいですか？</p>
	<%
	

			Kadai01dto k1 = (Kadai01dto)session.getAttribute("input_data");
	%>
	名前：<%=k1.getName() %><br>
	年齢：<%=k1.getAge() %><br>
	性別：<%=k1.getType() %><br>
	電話番号：<%=k1.getNumber()%><br>
	メールアドレス：<%=k1.getMail() %><br>
	パスワード：********<br>
	<a href="kadai01in">OK</a><br>
	<a href="kadai01">戻る</a>
</body>
</html>