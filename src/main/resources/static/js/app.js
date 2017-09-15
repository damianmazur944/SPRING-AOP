angular.module('demo', [])
    .controller('dealers', function ($scope, $http) {
        self = this;
        self.loadDealers = function() {
            $http.get('dealers/getAllDealers').then(function (response) {
                $scope.greeting = response.data;
            })
        }
        $scope.loadDealerCars = function(dealerId) {
            $http.get('cars/getDealerCars/'+dealerId).then(function (response) {
                $scope.dealerCars = response.data;
            })
        }
        self.loadDealers();

    });
