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

    <div class="product-preview-container">
    <c:forEach var="product" items="${products}" >
        <div class="col-sm-6">
            <div class="card" >

                <div class="card-body">
                    <h5 class="card-title">
                        <c:out value="${product.productName}"/>
                    </h5>
                    <p class="card-text">
                        <c:out value="${product.productPrice}"/>
                    </p>
                    <sf:form method="POST" modelAttribute="shopOrder" action="/products/buyNow?id=${product.productId}">
                        <sf:input path="quantity"/>
                        <button type="submit" class="btn btn-primary">Buy now</button>
                    </sf:form>
                </div>

            </div>
        </div>
    </c:forEach>
    </div>

    <custom:footer/>
</body>
</html>