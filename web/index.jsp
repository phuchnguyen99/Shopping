<%--
    Author: Phuc Nguyen
--%>
<%@ page contentType="text/html; charset-UTF-8" %>
<html ng-app="login_app">
    <head>
        <title>Login Page</title>
    </head>
    <body>
        <div ng-controller="userController as uc">
            <form name="userForm" ng-submit="uc.execute(userInfo)">
                <label>Username</label>
                <input type="text" name="username" ng-model="userInfo.username" ng-required="true"/>
                <span class="error-message" ng-show="userFrom.username.$error.required">Must enter username</span>
                <br>
                <label>Password</label>
                <input type="text" name="password" ng-model="userInfo.password" ng-required="true"/>
                <span class="error-message" ng-show="userForm.password.$error.required">Must enter password</span>
                <br>
                <label>User Type:</label>
                <select name="userType" ng-model="userInfo.userType" ng-required="true">
                    <option value="Customer">Customer</option>
                    <option value="Employee">Employee</option>
                </select>
                <br>
                <input type ="submit" value="Login" ng-disabled="userForm.$invalid" ng-click="uc.loginButtonVal=true"/>
                <input type="submit" value="Add User" ng-disabled="userForm.$invalid" ng-click="uc.addUserButtonVal=true"/>
            </form>
        </div>
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.5/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.28//angular-route.min.js"></script>
    <script type="text/javascript" src="http://localhost:8080/Shopping_war_exploded/js/login.js"></script>
</html>