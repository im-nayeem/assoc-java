<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Student</title>

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

    <a href="init">View Students</a>
    <p>hello ${hello}</p>




</body>
</html>