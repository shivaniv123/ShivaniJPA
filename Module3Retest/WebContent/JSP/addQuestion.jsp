<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quiz Application</title>
</head>
<body>
	
		<h1 style="color: #0066CC">Gear Quiz Bank Maintainence</h1>
		<br />
		<br />

		<!--This code below displays the form to add a Donation to the database	-->
		<h3>Add Question</h3> <a href="index.obj">Home</a>
		<c:url var="myAction" value="/add.obj"></c:url>
		<form:form action="${myAction}" method="post" modelAttribute="quiz">
			

            <div>
				<form:label path="quesTopic">Select Topic :</form:label>
				<div>
					<form:select path="quesTopic" >
										<form:errors path="quesTopic" style="color:red"/>
					
						<form:option value="">--- Select ---</form:option><!-- drop-down -->
						<form:options items="${quesTopic}" />
					</form:select>
				</div>
			</div>
			<div>
				<form:label path="quesCat">Select Topic :</form:label>
				<div>
					<form:select path="quesCat" >
										<form:errors path="quesCat" style="color:red"/>
					
						<form:option value="">--- Select ---</form:option><!-- drop-down -->
						<form:options items="${quesCat}" />
					</form:select>
				</div>
			</div>
			<div>
				<label for="ques">Question</label>
				<div>
					<form:input path="ques" id="ques"  placeholder="Question"/><!--path indicate the variable in entites file  -->
					<form:errors path="ques" style="color:red"/>
				</div>
			</div>
			
				
			<div>
				<label for="option1">option1</label>
				<div>
					<form:input path="option1" id="option1"  placeholder="option1"/><!--path indicate the variable in entites file  -->
					<form:errors path="option1" style="color:red"/>
				</div>
			</div>
			
			<div>
				<label for="option2">option2</label>
				<div>
					<form:input path="option2" id="option2"  placeholder="option2"/><!--path indicate the variable in entites file  -->
					<form:errors path="option2" style="color:red"/>
				</div>
			</div>
						<div>
				<label for="option3">option3</label>
				<div>
					<form:input path="option3" id="option3"  placeholder="option3"/><!--path indicate the variable in entites file  -->
					<form:errors path="option3" style="color:red"/>
				</div>
			</div>
			<div>
				<label for="option4">option4</label>
				<div>
					<form:input path="option4" id="option4"  placeholder="option4"/><!--path indicate the variable in entites file  -->
					<form:errors path="option4" style="color:red"/>
				</div>
			</div>
			<div>
				<label for="ans">Answer</label>
				<div>
					<form:input path="ans" id="ans"  placeholder="ans"/><!--path indicate the variable in entites file  -->
					<form:errors path="ans" style="color:red"/>
				</div>
			</div>
			
			<div>
				<label for="remarks">remarks</label>
				<div>
					<form:input path="remarks" id="remarks"  placeholder="remarks"/><!--path indicate the variable in entites file  -->
					<form:errors path="remarks" style="color:red"/>
				</div>
			</div>
			
			<div>
				<label for="review">review</label>
				<div>
					<form:input path="review" id="review"  placeholder="review"/><!--path indicate the variable in entites file  -->
					<form:errors path="review" style="color:red"/>
				</div>
			</div>
			<div>
					<button type="submit">Add Question</button>
				</div>
				
			

		</form:form>
		<br>
	
</body>
</html>