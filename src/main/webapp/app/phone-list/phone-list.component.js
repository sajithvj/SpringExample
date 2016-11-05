'use strict';

// Register `phoneList` component, along with its associated controller and template
angular.
  module('phoneList').
  component('phoneList', {
    templateUrl: 'app/phone-list/phone-list.template.html',
    controller: ['Phone','$http',
      function PhoneListController(Phone,$http) {
    	var self=this;
       // this.phones = Phone.query();
        self.orderProp = 'age';
        $http.get('app/phones/phones.json').then(function(response) {
            self.phones = response.data;
          });
      }
    ]
  });
