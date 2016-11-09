/**
 * 
 */
'use strict';

// Register `phoneDetail` component, along with its associated controller and template
angular.
  module('login').
  component('login', {
    templateUrl: 'app/login/login.template.html',
    controller: ['$scope',
      function LoginController($scope) {
        var self = this;
        $scope.onLogin = function () {
            console.log('Attempting login with username ' + $scope.vm.username + ' and password ' + $scope.vm.password);

            $scope.vm.submitted = true;

            if ($scope.form.$invalid) {
                return;
            }

            else{
            	 window.location.replace('http://localhost:8080/LifeLine/#!/phones');
            }

        };
       
      }
    ]
  });