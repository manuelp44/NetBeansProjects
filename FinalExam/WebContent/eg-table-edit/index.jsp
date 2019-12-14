<html>
<head>
   <link rel="stylesheet" href="eg-table-edit/css/bootstrap.min.css">
   <title>Angular Custom Table Edit</title>
        <style>
      #mytable input{
          width:100%;
        }
</style>
</head>
<body ng-app="myApp" ng-controller="MainController">
 
      <h1 align="center" style="color:#428bca">Customer Registration Form</h1>

<div class="container">
     <div class="row">
      <button type="button" style="float:right;margin-bottom: 10px;" class="btn btn-info " ng-click="addEmployee()">Add Customer</button>
            <div class="col-md-12">

                <div class="table-responsive">
                  <form  id="empform"  ng-submit="submitEmployee()">
                    <table id="mytable" class="table table-bordered">

                        <thead>
                        <th style="width:5%;">SNO</th>
                        <th style="width:10%;">First Name</th>
                        <th style="width:15%;">Last Name</th>
                        <th style="width:10%;">Age</th>
                        <th style="width:10%;">gender</th>
                        <th style="width:15%;">Address</th>
            			<th style="width:15%;">City</th>
            			<th style="width:15%;">State</th>
            			<th style="width:25%;">Actions</th>                     
                        </thead>

                        <tbody>
                 
              <tr ng-repeat="emp in empoyees">
                <td>{{$index+1}}</td>
                <td>
                   <input  name="empId{{$index}}" ng-model="emp.empId" 
                   ng-disabled="!enabledEdit[{{$index}}]"/>
                  
                </td>
                <td>
                    <input name="firstName{{$index}}" ng-model="emp.firstName"  ng-disabled="!enabledEdit[{{$index}}]"/>
                 </td>
                <td>
                   <input name="lastName{{$index}}" ng-model="emp.lastName"  ng-disabled="!enabledEdit[{{$index}}]">
                </td>
                <td>
                   <input name="age{{$index}}" ng-model="emp.age"  ng-disabled="!enabledEdit[{{$index}}]" />
                </td>
                <td>
                  <input name="gender{{$index}}" ng-model="emp.gender"  ng-disabled="!enabledEdit[{{$index}}]"/>
                </td>
                 <td>
                  <input name="address{{$index}}" ng-model="emp.address"  ng-disabled="!enabledEdit[{{$index}}]"/>
                </td>
                <td>
                  <input name="city{{$index}}" ng-model="emp.city"  ng-disabled="!enabledEdit[{{$index}}]"/>
                </td>
                <td>
                  <input name="state{{$index}}" ng-model="emp.state"  ng-disabled="!enabledEdit[{{$index}}]"/>
                </td>
                <td >
                  <div class="buttons">
                    <button class="btn btn-primary" ng-click="editEmployee($index)">Edit</button>
                    <button class="btn btn-danger" ng-click="deleteEmployee($index)">Delete</button>
                  </div>  
                </td>
              </tr>
              
                        </tbody>

                    </table>
                      <input type="submit" class="btn btn-primary" value="Submit" />
                   </form>
                    <div class="clearfix"></div>
                 </div>

            </div>
  
  </div>
 
</body>

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/angular.min.js"></script>
    <script type="text/javascript" src="js/app.js"></script>
   
</html>