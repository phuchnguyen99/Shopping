var login_app = angular.module('login_app',['ngRoute']);
login_app.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode({
       enabled: true,
       requireBase: false
    });
}]);

login_app.controller('userController', ['$scope', '$http',
                        function ($scope, $http) {
    var uc = this;
    var user_url = 'http://localhost:8080/Shopping_war_exploded/rest/user';
    var config = {
        'Content-Type' : 'application/json'
    };

    uc.buildHttpRequest = function(method, location, data)
    {
        $http({
            method : method,
            url : user_url + location,
            data : data,
            headers : config
        }).then(function successCallback(response) {
            $scope.data = response.data;
        }, function errorCallback(reason) {
            console.log(reason.message);
        })
    };

    uc.resetButtonValues = function(){
        uc.loginButtonVal = false;
        uc.addUserButtonVal = false;
    };

    uc.execute = function(userInfo)
    {
        var user_data = {
            username : userInfo.username,
            password : userInfo.password,
            userType : userInfo.userType
        };

        if(uc.loginButtonVal)
        {
            var User = $resource
          uc.buildHttpRequest('POST', '/getUser', user_data);
        }
        else if(uc.addUserButtonVal)
        {
            uc.buildHttpRequest('POST', '/addUser', user_data)
        }
        uc.resetButtonValues();
    }
}]);
