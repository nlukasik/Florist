<!DOCTYPE html>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="custom" uri="/WEB-INF/custom.tld"%>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
                  integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta charset="UTF-8">
</head>
<body>
    <custom:header/>

    <sf:form method="POST" modelAttribute="order" action="/order">
        <div class="form-group">
            <label for="exampleInput">Imie</label>
            <sf:input path="name" class="form-control" type="text"/>
        </div>
        <div class="form-group">
            <label for="exampleInput">Nazwisko</label>
            <sf:input path="lastName" class="form-control" type="text"/>
        </div>
        <div class="form-group">
            <label for="exampleInput">Adres email</label>
            <sf:input path="email" class="form-control" type="text"/>
        </div>
        <div class="form-group">
            <label for="exampleInput">Adres wysylki</label>
            <sf:input path="address" class="form-control" type="text"/>
        </div>
        <button type="submit" class="btn btn-primary">Zamow</button>
    </sf:form>

    <custom:footer/>
</body>
</html>