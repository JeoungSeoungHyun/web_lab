<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>로그인 페이지</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>

	<div class="container mt-3">
		<h2>로그인 페이지</h2>
		<hr />
		<form action="success.jsp" onsubmit="return vaild();">
			<div class="mb-3 mt-3">
				<input type="text" class="form-control" id="id"
					placeholder="Enter id" name="id">
			</div>
			<div class="mb-3">
				<input type="text" class="form-control" id="name"
					placeholder="Enter name" name="name">
			</div>
			<div class="mb-3">
				<input type="password" class="form-control"  id="password"
					placeholder="Enter password" name="password">
			</div>
			<div class="form-check mb-3">
				<label class="form-check-label"> <input
					class="form-check-input" type="checkbox" name="remember">
					Remember me
				</label>
			</div>
			<button type="reset" class="btn btn-success">리셋</button>
			<button type="submit" class="btn btn-primary">로그인</button>
		</form>
	</div>

	<script>
		function vaild(){
			let user = {
					id: $("#id").val(),
					name: $("#name").val(),
					password : $("#password").val()
			}
			
			if(user.id != 'cos'){
				alert("아이디가 일치하지 않습니다.");
				return false;
			}
			if(user.password != '1234'){
				alert("비밀번호가 일치하지 않습니다.");
				return false;
			}
			return true;
		}
	</script>

</body>
</html>
