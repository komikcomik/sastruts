<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<html:errors/>
	<s:form method="post">
		名前 <html:text property="name" />
		所属 <html:text property="belonging" />
		その人の特徴 <html:text property="feature" />
		<s:submit property="regist" value="送信" />
		<s:submit property="registList" value="リストに登録" />
	</s:form>
</body>
</html>