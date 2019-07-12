<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute = "hotel">
	<label>Best Viewed in Chrome for selecting dates </label><br>
	<label>Book </label><label>${hotel.name}</label><br>
	</form:form>
	
	<table>
		<form:form modelAttribute="book" action="saveBooking.obj"
			method="post">
			<tr align="center">
				<td colspan=2><h3>Enter your details</h3></td>
			</tr>
			
		
			
			<tr>
				<td><label for="name">Name</label></td>
				<td><form:input path="customerName" id="name"
						placeholder="Name" />
				<lebel><form:errors path="customerName"></form:errors></lebel>
				</td>
			</tr>
			<tr>
				<td><label for="hotelId">Hotel Id</label></td>
				<td><form:input path="hotelId" id="hotelId"
						placeholder="Hotel Id" value="${book.hotelId}" />
				<lebel><form:errors path="hotelId"></form:errors></lebel>
				</td>
			</tr>
			
			<tr>
				<td><label for="fromDate">Booking From</label></td>
				<td><form:input type="date" path="fromDate" id="fromDate"
						placeholder="From Date" />
				</td>
			</tr>
			
			<tr>
				<td><label for="toDate">Check out</label></td>
				<td><form:input type="date" path="toDate" id="toDate"
						placeholder="To Date" />
				</td>
			</tr>
			
			<tr>
				<td><label for="noOfRooms">No of Rooms</label></td>
				<td><form:input path="noOfRooms" id="noOfRooms"
						placeholder=" no of rooms" />
				<lebel><form:errors path="noOfRooms"></form:errors></lebel>
				</td>
			</tr>
			
			<tr>
				<td colspan=2>
					<button type="submit">Book</button>
				</td>
			</tr>
			<c:if test="${message ne null}">
				<tr align="center">
					<td colspan=2><label style="color: blue;">"${message}"</label></td>
				</tr>
			</c:if>

		</form:form>
	</table>
</body>
</html>