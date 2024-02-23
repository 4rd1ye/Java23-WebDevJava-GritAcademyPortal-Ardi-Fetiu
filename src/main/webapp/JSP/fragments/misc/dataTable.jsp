<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<table id="data">
    <c:forEach items="${data}" var="dataPunkt">
        <tr>
            <c:forEach items="${dataPunkt}" var="dataPunktKolumn">
                <td>${dataPunktKolumn}</td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>

</body>
</html>
