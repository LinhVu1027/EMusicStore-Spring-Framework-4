<%@ include file="/WEB-INF/views/template/header.jsp" %>

<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Administrator Page</h1>
            <p class="lead">This is the administrator page!</p>
        </div>

        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <h2>
                Welcome: ${pageContext.request.userPrincipal.name} | <form action="<c:url value="/logout"/>" method="post">
                <input type="submit" value="Logout" />
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
            </h2>
        </c:if>

        <h3>
            <a href="<c:url value="/admin/product-inventory"/>">Product Inventory</a>
        </h3>

        <p>Here you can view, check and modify the product inventory!</p>

        <br/>

        <h3>
            <a href="<c:url value="/admin/customer"/>">Customer Management</a>
        </h3>

        <p>Here you can view, the customer information!</p>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>
