<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	以下の内容で登録しました。
	名前：<bean:write name="personListDto" property="personForm.name"/>	<br>
	所属：<bean:write name="personListDto" property="personForm.belonging"/>	<br>
	特徴：<bean:write name="personListDto" property="personForm.feature"/><br>
	<c:out value="${personListDto.personForm.name}" default="ない"/>
</body>
</html>

