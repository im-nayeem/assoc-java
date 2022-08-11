<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Student</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.0.2/css/bootstrap.css">

</head>
<body>
    <form method="post" action="add">
        <div class="mb-3">
            Name <input class="form-control" type="text" name="name"/>
        </div>
        <div class="mb-3">
            ID <input class="form-control" type="number"  name="id"/>
        </div>
        <div class="mb-3">
            Dept <input class="form-control" type="text"  name="dept"/>
        </div>
        <button type="submit" clas="btn btn-primary" value="submit">submit</button>
    </form>

    <a href="hello">View Students</a>
    <p>hello ${hello}</p>




    <script src="webjars/jquery/3.6.0/jquery.js"></script>
    <script src="webjars/bootstrap/5.0.2/js/bootstrap.js"></script>
</body>
</html>