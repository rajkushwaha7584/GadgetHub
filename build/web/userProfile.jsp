<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Bootstrap demo</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous" />
  </head>
  <body>
      <jsp:include page="header.jsp" />
    <div class="container mt-5">
      <div class="row mt-3 mb-3">
        <nav aria-label="breadcrumb" class="bg-warning rounded-3 p-3">
          <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Home</a></li>
            <li class="breadcrumb-item active" aria-current="page">Library</li>
          </ol>
        </nav>
      </div>

      <div class="row">
        <div class="col-lg-4">
          <div class="card mb-3">
            <div class="card-body text-center">
              <img
                src="/All_images/product.jfif"
                alt=""
                class="img-fluid w-25" />
              <h5>Hello User here</h5>
            </div>
          </div>

          <div class="card">
            <div class="card-body text-center">
              <h4>My Profile</h4>
            </div>
          </div>
        </div>

        <div class="col-lg-8">
          <div class="card">
            <div class="card-body">
              <div class="row border-bottom">
                <div class="col-sm-4">
                  <p>Full Name</p>
                </div>
                <div class="col-sm-8">
                  <p>Raj kushwaha</p>
                </div>
              </div>

              <div class="row border-bottom">
                <div class="col-sm-4">
                  <p>Email</p>
                </div>
                <div class="col-sm-8">
                  <p>raj24kush@gmail.com</p>
                </div>
              </div>

              <div class="row border-bottom">
                <div class="col-sm-4">
                  <p>Address</p>
                </div>
                <div class="col-sm-8">
                  <p>Patel Nagar Bhopal</p>
                </div>
              </div>

              <div class="row border-bottom">
                <div class="col-sm-4">
                  <p>Pincode</p>
                </div>
                <div class="col-sm-8">
                  <p>462022</p>
                </div>
              </div>

              <div class="row">
                <div class="col-sm-4">
                  <p>Phone</p>
                </div>
                <div class="col-sm-8">
                  <p>6264100725</p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
      <jsp:include page="footer.jsp" />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"></script>
  </body>
</html>
