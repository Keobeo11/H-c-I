<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class="container">
    <h2>Thông Tin Tài Khoản</h2>
    <div class="form-group">
        <label>Email:</label>
        <p th:text="${email}"></p>
    </div>
    <div class="form-group">
        <label>Mật khẩu:</label>
        <p th:text="${password}"></p>
    </div>
</div>
</body>
</html>