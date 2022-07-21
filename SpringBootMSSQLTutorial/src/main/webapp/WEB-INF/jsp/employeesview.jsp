<%@ include file="common/header.jspf"%>

<div class="container">
 <div>
  <a type="button" class="btn btn-primary btn-md" href="/add-todo">Add Employee</a>
 </div>
 <br>
 <div class="panel panel-primary">
  <div class="panel-heading">
   <h3>List of Employee's</h3>
  </div>
  <div class="panel-body">
   <table class="table table-striped">
    <thead>
     <tr>
      <th width="40%">First Name</th>
      <th width="40%">Last Name</th>
      <th width="60%">Email ID</th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${employees}" var="employee">
      <tr>
       <td>${employee.firstName}</td>
       <td>${employee.lastName}</td>
       <td>${employee.emailID}</td>
       <td><a type="button" class="btn btn-success">Update</a></td>
       <td><a type="button" class="btn btn-warning">Delete</a></td>
      </tr>
     </c:forEach>
     </tbody>
   </table>
  </div>
 </div>

</div>
<%@ include file="common/footer.jspf"%>