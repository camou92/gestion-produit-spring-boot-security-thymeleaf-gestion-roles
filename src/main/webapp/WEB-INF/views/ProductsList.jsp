<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Products List</title>
    </head>
    <body>
        <header>
            <h1>Products List</h1>
        </header>
        <main>
              <table >
                <tr>
                  <th>Product Id</th><th>Product Name</th><th>Product Price</th><th>Create Date</th>
                </tr>
                <c:forEach items="${productsJsp}" var="product">
                    <tr>
                        <td>${product.idProduct}</td>
                        <td>${product.nameProduct}</td>
                        <td>${product.priceProduct}</td>
                        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${product.dateCreate}"/></td>
                        <td><a OnClick="return confirm('Are you sure to delete this item ?')"
                        href="deleteProduct?id=${product.idProduct}">Delete</a></td>
                        <td><a href="showProduct?id=${product.idProduct}">Edit</a></td>
                    </tr>
                    </c:forEach>
              </table>
        </main>
        <footer>
            <a href="createProduct">Product Creation</a>
        </footer>
    </body>
</html>
