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
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"
      integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
  </head>
  <body>
    <div class="container-fluid bg-primary text-white p-3 mt-5">
      <div class="container">
        <h2 class="text-center">Contact</h2>
        <p class="text-center">We love our fans!</p>
        <div class="row">
          <div class="col-md-4">
            <p><i class="fa-solid fa-phone"></i> Phone : +91 6264100725</p>
            <p>
              <i class="fa-solid fa-envelope"></i> Email : raj24kush@gmail.com
            </p>
            <p><i class="fa-solid fa-signs-post"></i> Postal Code : 462020</p>
          </div>

          <div class="col-md-8">
            <form action="#">
              <div class="row">
                <div class="col-sm-6 form-group mt-1">
                  <input
                    type="text"
                    class="form-control"
                    placeholder="name"
                    required
                  />
                </div>
                <div class="col-sm-6 form-group mt-1">
                  <input
                    type="email"
                    class="form-control"
                    placeholder="email"
                    required
                  />
                </div>
              </div>

              <textarea
                  name=""
                  id=""
                  rows="5"
                  class="form-control mt-1"
                  placeholder="Enter your message.."
                > </textarea>

                <div class="row">
                    <div class="col-md-12 form-group mt-1">
                        <button type="button" class="btn btn-warning">send</button>
                    </div>
                </div>
            </form>
          </div>
        </div>
      </div>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
