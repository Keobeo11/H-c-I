<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<form:form action="newstaff" modelAttribute="Staff">
    <form:input path="id"/>
    <form:input path="name"/>
    <form:input path="email"/>
    <form:input path="salary"/>
    <form:radiobutton path="gender" value="true" label="Male"/>
    <form:radiobutton path="gender" value="false" label="Femal"/>
    <form:select path="position">
        <form:option value="CEO">Chief Execute Office</form:option>
        <form:option value="DIR">Director</form:option>
        <form:option value="MAN">MAN</form:option>
        <form:option value="EMP">EMP</form:option>
    </form:select>
</form:form>
</body>
</html>