<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<html:errors/>
	<s:form method="post">
		お名前をどうぞ!
		<html:text property="name" />
		<s:submit property="echo" value="送信" />
	</s:form>
	<s:form method="post">
		お名前をどうぞ(夜)!
		<html:text property="name" />
		<s:submit property="evening" value="送信" />
	</s:form>
</body>
</html>