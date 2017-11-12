<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	以下の内容が登録済みです。<br/>
	<c:forEach items="${plist}" var="person">
		<c:out value="${person.name}" default="取れなかった"/>
		<c:out value="${person.belonging}" default="取れなかった"/>
		<c:out value="${person.feature}" default="取れなかった"/><br/>
	</c:forEach>
</body>
</html>
