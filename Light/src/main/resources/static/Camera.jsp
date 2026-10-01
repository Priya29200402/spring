<html>
<head>
    <title>Camera</title>
</head>
<body>
<pre>
        <form action="camera">
            Brand: <input type="text" name="brand" value="${cameraDTO.brand}">
            Model: <input type="text" name="model" value="${cameraDTO.model}">
            SensorType: <input type="text" name="sensorType" value="${cameraDTO.sensorType}">
            Price: <input type="text" name="price" value="${cameraDTO.price}">
        <input type="submit" value="submit">
            <i>${cameraMessage}</i>
        </form>

        <c:forEach items = "${validationErrors}" var = "objectError">
            <p style="color:red">${objectError.defaultMessage}</p>
        </c:forEach>

    </pre>
</body>
</html>