<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>View Customer Details</h1>
<h2>Details Submitted as follows :</h2>
<%-- <h3>Customer ID : ${cid} </h3>
<h4>Customer Name : ${cname} </h4>
<h5>Customer Email : ${cemail} </h5> --%>

<form action="getdetails" method="post">
<input type="number" name="cid">
<input type="submit" value="submit">
</form>
</body>
</html>