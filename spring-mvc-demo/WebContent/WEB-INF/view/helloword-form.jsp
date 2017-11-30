<!DOCTYPE html>
<html>
<head>
   <title>Hello Word Page</title>
</head>

<body>
	<div>
	<h2>Binding with Servlet</h2><br>
	<form action="processFormVersionTwo" method="GET">
	   <input type="text" name="studentName" placeholder="What's your name?"/>
	   <input type="submit" value="ARA"/>
	</form>
	</div>
	<hr/>
	<div>
	<h2>Binding with RequestParam Annotation</h2><br>
	<form action="processFormVersionThree" method="GET">
	   <input type="text" name="studentName" placeholder="What's your name?"/>
	   <input type="submit" value="ARA"/>
	</form>
	</div>
	
</body>

</html>