<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<div>


		<h1>Student Directory</h1>



		<form:form modelAttribute="student" action="save.obj" method="post">
			<div>
				<label for="fname">First Name</label>
				<div>
					<form:input path="firstName" id="fname" required="true" placeholder="First Name" /><!--path indicate the variable in entites file  -->
				</div>
			</div>
			<div>
				<label for="lname">Last Name</label>
				<div>
					<form:input path="lastName" id="lname" required="true" placeholder="Last Name" />
				</div>
			</div>
			<div>
				<label for="gend">Gender</label>
				<div>
					<form:select path="gender" required="true">
						<form:option value="">Please Select gender</form:option><!-- drop-down -->
						<form:options items="${gender}" />
					</form:select>
				</div>
			</div>
			<div>
				<label for="phn">PhoneNo</label>
				<div>
					<form:input path="phnNo" id="phnNo" required="true" placeholder="PhnNo" />
				</div>
			</div>
			<div>
				<div>
					<button type="submit">Add</button>
				</div>
			</div>
		</form:form>
		<!-- alert logic -->
		<c:if test="${param.message ne null}">
			<div>
				${param.message}
			</div>
		</c:if>
		
		<h3>Current List of Students:</h3>
		<c:if test="${stuList ne null}">
			<table>
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>gender</th>
					<th>Phone No</th>
				</tr>
				<c:forEach items="${stuList}" var="student">
					<tr>
						<th>${student.studentId}</th>
						<th>${student.firstName}</th>
						<th>${student.lastName}</th>
						<th>${student.gender}</th>
						<th>${student.phnNo}</th>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>