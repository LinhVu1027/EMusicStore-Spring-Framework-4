/**
 * Created by AllenWalker on 9/29/16.
 */

var cartApp = angular.module("cartApp", []);

cartApp.controller("cartCtrl", function ($scope, $http) {

    $scope.refreshCart = function() {
        $http.get('/eMusicStore/rest/cart/' + $scope.cartId).success(function(data) {
            $scope.cart = data;
        });
    };

    $scope.clearCart = function() {
        $http.delete('/eMusicStore/rest/cart/' + $scope.cartId).success($scope.refreshCart());
    };

    $scope.initCartId = function(cartId) {
        $scope.cartId = cartId;
        $scope.refreshCart(cartId);
    };

    $scope.addToCart = function(productId) {
        $http({
            method: 'PUT',
            url: '/eMusicStore/rest/cart/add/' + productId
        }).then(function successCallback(response) {
            $scope.refreshCart();
            alert("Product successfully added to the cart!");
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    $scope.removeFromCart = function(productId) {
        $http({
            method: 'PUT',
            url: '/eMusicStore/rest/cart/remove/' + productId
        }).then(function successCallback(response) {
            $scope.refreshCart();
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    $scope.calGrandTotal = function() {
        var grandTotal = 0;

        for (var i = 0; i < $scope.cart.cartItems.length; i++) {
            grandTotal += $scope.cart.cartItems[i].totalPrice;
        }

        return grandTotal;
    }
    
});