var app = angular.module('myApp', []);


app.controller("MainController",['$scope',function($scope){

   $scope.data = [{ firstName:"Jayaram",lastName:"Prida",age:"23",
	                   gender:"male",address:"asdf",city:"Katy",state:"Texas"},
	               ];


	$scope.empoyees = angular.copy( $scope.data);
	 $scope.enabledEdit =[];

    $scope.addEmployee = function(){
	    var emp ={ firstName:"",lastName:"",age:"",
	                   gender:"",address:"",city:"",state:"",empId:"",disableEdit:false};
		$scope.empoyees.push(emp);
		 $scope.enabledEdit[$scope.empoyees.length-1]=true;
	}
	$scope.editEmployee = function(index){
		console.log("edit index"+index);
		$scope.enabledEdit[index] = true;
	}
	$scope.deleteEmployee = function(index) {
		  $scope.empoyees.splice(index,1);
	}
	
	$scope.submitEmployee = function(){

		console.log("form submitted:"+angular.toJson($scope.empoyees ));
	}
	
}]);
