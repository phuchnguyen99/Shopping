var item_app = angular.module('item_app', []);
item_app.controller('itemController', function ($scope, $http) {
   $scope.listItems =[];
   $scope.getAllItems = function () {
      $http.get('http://localhost:8080/Shopping_war_exploded/rest/item/getAllItems').then(function (response) {
          $scope.listItems = response.data;
          console.log("successfully call obtainAllItems " + response.data);
      }, function (reason) {
          console.log("fail to call obtainAllItems " + reason.status);
      })
   } ;
});
