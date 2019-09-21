<%--
Author: Phuc Nguyen
--%>
<%@ page contentType="text/html; charset-UTF-8" language="java" %>
<html ng-app="item_app">
    <head>
        <title>Index page</title>
    </head>
    <body>
        <div ng-controller="itemController">
            <button ng-click="getAllItems()">Get all items</button>
            <table cellpadding="2" cellspacing="2" border="1">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Remove Product</th>
                </tr>
                <tr ng-repeat="item in listItems">
                    <td>{{item.itemId}}</td>
                    <td>{{item.itemName}}</td>
                    <td>{{item.itemPrice}}</td>
                    <td> <button>Remove</button></td>
                </tr>
            </table>
        </div>
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.28//angular-route.min.js"></script>
    <script type="text/javascript" src="http://localhost:8080/Shopping_war_exploded/js/item.js"></script>
</html>