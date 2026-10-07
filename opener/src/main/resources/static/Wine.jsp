<html>
<head>
    <title>Wine Application</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #f8f5f2, #f1e8df);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            font-family: Arial, sans-serif;
        }
        .card {
            border: none;
            border-radius: 18px;
            box-shadow: 0 12px 40px rgba(108, 74, 50, 0.12);
        }
        .btn-primary {
            background: linear-gradient(135deg, #8b3f2a, #c77a52);
            border: none;
        }
        .btn-primary:hover {
            background: linear-gradient(135deg, #7a3524, #b76745);
        }
        .form-control:focus {
            border-color: #c77a52;
            box-shadow: 0 0 0 0.2rem rgba(199, 122, 82, 0.15);
        }
        .alert {
            border-radius: 12px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <div class="card p-4">
                <div class="text-center mb-4">
                    <h2 class="fw-bold text-dark">Wine Application</h2>
                    <p class="text-muted mb-0">Add wine details</p>
                </div>

                <form action="wine" method="post">
                    <div class="mb-3">
                        <label class="form-label">Company Name</label>
                        <input type="text" class="form-control" name="companyName" value="${wineDTO.companyName}">
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Company Address</label>
                        <input type="text" class="form-control" name="companyAddress" value="${wineDTO.companyAddress}">
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Manufacturer Name</label>
                        <input type="text" class="form-control" name="manufacturerName" value="${wineDTO.manufacturerName}">
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Manufacture Date</label>
                        <input type="date" class="form-control" name="manufactureDate" value="${wineDTO.manufactureDate}">
                    </div>

                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label class="form-label">Age</label>
                            <input type="number" class="form-control" name="age" value="${wineDTO.age}">
                        </div>
                        <div class="col-md-6 mb-3">
                            <label class="form-label">Price</label>
                            <input type="number" step="0.01" class="form-control" name="price" value="${wineDTO.price}">
                        </div>
                    </div>

                    <button type="submit" class="btn btn-primary w-100">Submit</button>
                </form>

                <c:if test="${not empty validationErrors}">
                    <div class="alert alert-danger mt-3 mb-0">
                        <c:forEach items="${validationErrors}" var="wine">
                            <div>${wine.defaultMessage}</div>
                        </c:forEach>
                    </div>
                </c:if>

                <c:if test="${not empty wineMessage}">
                    <div class="alert alert-success mt-3 mb-0">${wineMessage}</div>
                </c:if>
            </div>
        </div>
    </div>
</div>
</body>
</html>