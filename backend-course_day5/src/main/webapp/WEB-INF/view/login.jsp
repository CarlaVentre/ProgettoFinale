<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="custom" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<custom:mainLayout title="signup">
<h1>Effettua il login</h1>

<c:if test="${not empty error }">
	${error }
	</c:if>
	<form:form method="POST" modelAttribute="customer">
		<form:label path="id">ID: </form:label>
		<form:input path="id" type="text" />	
		<form:errors path="id" type="text" />	
		<br>
		<form:label path="password">Password: </form:label>
		<form:input path="password" type="password" />
		<form:errors path="password" type="text" />
		<br>
		<input type="submit" value="Submit" />
	</form:form>
	<br>
	<a href="/signup">SignUp</a>	

</custom:mainLayout>