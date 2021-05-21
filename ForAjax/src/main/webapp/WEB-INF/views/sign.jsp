<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signJSP</title>

</head>
<body>
	<div>${message }</div>
	<div>
		<h5>註冊</h5>
		<form action="signUp">
			<label>帳號：</label> <input type="text" name="sup_username" id=inName>
									<span id="ckResult">a</span><BR>
			<label>密碼：</label> <input type="text" name="sup_password"><BR>
			<label>性別：</label> <input type="text" name="sup_sex"><BR>
			<label>eMail：</label> <input type="text" name="sup_email"><BR>
			<input type="submit" value="註冊">
			<!-- <a href="signUp">註冊</a> -->
		</form>
	</div>
	<BR>
	<hr>
	<div>
		<h5>登入</h5>
		<form action="signIn">
			<label>帳號：</label> <input type="text" name="sin_username"><BR>
			<label>密碼：</label> <input type="text" name="sin_password"><BR>
			<input type="submit" value="登入">
			<!-- <a href="signIn">登入</a> -->
			<a href="forgot">忘記密碼</a>
		</form>
	</div>
	<BR>
	<hr>
	<div></div>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$("#inName").blur(function() {
				$.ajax({
					url : "http://localhost:8080/ForAjax/checkName",
					data : {
						strUsername : $("#inName").val()
					},
					type : "POST",
					dataType : "json",
					success : function(result) {
						console.log(result);
						/* alert(result); */
					},
					error:function(){
				        alert("error");
				        }
				});
			});
		});
	</script>

</body>
</html>