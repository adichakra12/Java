<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="position: absolute; left: 800px;">
		<h1>Send an Omikuji!</h1>
			<div style="border: 2px solid black; padding: 10px;">
				<form action="/submit" method="post">
					<p>Pick any number from 5 to 25</p>
					<input type="number" name="years" min="5" max="25"/>
					<p>Enter the name of any city.</p>
					<input type="text" name="city"/>
					<p>Enter the name of any real person.</p>
					<input type="text" name="person">
					<p>Enter professional endeavor or hobby</p>
					<input type="text" name="profession"/>
					<p>Enter any type of living thing.</p>
					<input type="text" name="thing"/>
					<p>Say something nice to someone:</p>
					<input type="text" name="letter"/>
					<p style="font-style: italic;">Send and show a friend</p>
					<button>Send</button>
				</form>
			</div>
	</div>
</body>
</html>