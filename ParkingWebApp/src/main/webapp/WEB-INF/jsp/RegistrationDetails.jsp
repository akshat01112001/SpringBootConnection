<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <%=<link rel="stylesheet" href="layout.css">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device,initial-scale=1.0">
  <title>Registration Details</title>
  %>
</head>
<body>
  <%=<div class="heading">
    <table class="wrap">
      <fieldset>
        <legend>
          <h1>Registration Details</h1>
        </legend>
        <form action="saveDetails" method="post">
          <div class="mb-3">
            <label for="FirstName" class="form-label">First Name</label>
            <input required type="text" class="form-control" id="FirstName" name="FirstName"/>
          </div>
          <div class="mb-3">
            <label for="LastName" class="form-label">Last Name</label>
            <input required type="text" class="form-control" id="LastName" name="LastName"/>
          </div>
          <div class="mb-3">
            <label for="Username" class="form-label">Username</label>
            <input required type="text" class="form-control" id="UserName" name="Username"/>
          </div>
          <div class="mb-3">
            <label for="Password" class="form-label">Password</label>
            <input required type="password" class="form-control" id="Password">
          </div>
          <div class="mb-3">
            <label for="ConfirmedPassword" class="form-label">Confirm Password</label>
            <input required type="password" class="form-control" id="ConfirmedPassword">
          </div>
          <label>Gender</label>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
            <label class="form-check-label" for="flexRadioDefault1">
              Male
            </label>
          </div>
          <div class="form-check">
            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
            <label class="form-check-label" for="flexRadioDefault2">
              Female
            </label>
          </div>
          <div class="mb-3">
            <label for="InputEmail" class="form-label">Email address</label>
            <input required type="email" class="form-control" id="Email" name="Email"/>
          </div>
          <div class="mb-3">
            <label for="InputPhone" class="form-label">Phone Number</label>
            <input required type="phone" class="form-control" id="Phone" name="Phone"/>
          </div>
          <div class="mb-3">
            <label for="InputRegNbr" class="form-label">Car Registration No.</label>
            <input required type="text" class="form-control" id="CarReg" name="CarReg"/>
          </div>
          <div class="mb-3">
            <label for="InputUsername" class="form-label">Residential Address</label>
            <input required type="text" class="form-control" id="Address" name="Address"/>
          </div>

          <input type="submit" class="btn btn-primary" value="Submit"/>
        </form>
      </fieldset>
    </table>
  </div>
  %>
</body>

</html>
