var app = angular.module('myApp',[]);
app.controller('myCtrl',function($scope,$http){
	
	$http.get("product")
	.then(function(response){
		$scope.data=response.data;
	});
	
	$scope.sort=function(keyname){
		$scope.sortKey=keyname;
		$scope.reverse=!$scope.reverse;
	}
	$scope.loadData = function (){ 
		 		$http.get("data").then(function(response) { 
		        $scope.Data = response.data; 

});
	};
	$scope.loadDataById = function (pid){ 
		 		$http.get("dataById/"+pid).then(function(response) { 
		 				$scope.Data = response.data; 
				}); 
		 	}; 
		 $scope.addItemToCart =function (itemId) { 
		 
		 
		 		$http.put("addItem/"+itemId).success(function () { 
		 				alert("Item added to the cart! check on view cart"); 
		 		}).error(function(){ 
		 				alert("Error"); 
		 		}); 
		     
		 }; 
		 $scope.removeItemFromCart = function (itemId) { 
		     $http.put("removeItem/"+itemId).success(function (data) { 
		     	alert("Item Removed"); 
		         $scope.refreshCartItems(); 
		     }).error(function(){ 
		     	alert("Error"); 
		     }); 
		 }; 
		 $scope.GrandTotalOfItems = function () { 
		     var grandTotal=0; 
		     for (var i=0; i<$scope.cart.item.length; i++) { 
		         grandTotal+=$scope.cart.item[i].totalPrice; 
		    } 
		 
		 
		     return grandTotal; 
		 }; 
		 $scope.refreshCartItems = function () { 
		     $http.get("refreshCart").success(function (data) { 
		        $scope.cart=data; 
		     }); 
		 }; 
		 $scope.clearCartItems = function () { 
		 	$http['delete']("clearCartItems").success(function (data) { 
		 		alert("cart Emptied"); 
		 		$scope.refreshCartItems(); 
		 	 
		 	}); 
		 }; 
		 $scope.retrieveCart = function () { 
		     $scope.refreshCartItems(); 
		 };	 
		 }); 

	