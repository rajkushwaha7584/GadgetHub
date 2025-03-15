<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
 pageEncoding="ISO-8859-1"%> 
 
<!DOCTYPE html> 
<html> 
<head> 
<title>Cart Details</title> 
<meta charset="utf-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"> 
 
<link rel="stylesheet" href="mycss.css"> 
</head> 
<body style="background-color: #E6F9E6;"> 
 
 
 <jsp:include page="header.jsp" /> 
 
 <div class="text-center h3 m-3 text-primary">Cart Items</div> 
 <div class="container"> 
 
  <table class="table table-hover"> 
   <thead> 
    <tr> 
     <th>Picture</th> 
     <th>Products</th> 
     <th>Price</th> 
     <th>Quantity</th> 
     <th>Add</th> 
     <th>Remove</th> 
     <th>Amount</th> 
    </tr> 
   </thead> 
   <tbody> 
    <% 
              /* Java Code */ 
    %> 
 
    <tr> 
     <td><img src="./ShowImageServlet?pid=<%=/* Java Code */%>" 
      style="width: 50px; height: 50px;"></td> 
     <td><%=/* Java Code */%></td> 
     <td><%=/* Java Code */%></td> 
     <td><form method="post" action="./UpdateToCartServlet"> 
       <input type="number" name="pqty" value="<%=/* Java Code */%>" 
        style="max-width: 70px;" min="0"><input type="hidden" 
        name="pid" value="<%=/* Java Code */%>"><input 
        type="submit" name="Update" value="Update" 
        style="max-width: 80px;"> 
      </form></td> 
     <td><a 
      href="CartDetailServlet?add=1&uid=<%=/* Java Code */%>&pid=<%=/* Java Code */%>&avail=<%=/* Java Code */%>&qty=<%=/* Java Code */%>"><i 
       class="fa fa-plus"></i></a></td> 
     <td><a 
      href="CartDetailServlet?add=0&uid=<%=/* Java Code */%>&pid=<%=/* Java Code */%>&avail=<%=/* Java Code */%>&qty=<%=/* Java Code */%>"><i 
       class="fa fa-minus"></i></a></td> 
     <td><%=/* Java Code */%></td> 
    </tr> 
 
    <% 
    } 
    } 
    %> 
 
    <tr style="background-color: grey; color: white;"> 
     <td colspan="6" style="text-align: center;">Total Amount to 
      Pay (in Rupees)</td> 
     <td><%=/* Java Code */%></td> 
    </tr> 
    <% 
    /* Java Code */ { 
    %> 
    <tr style="background-color: grey; color: white;"> 
     <td colspan="4" style="text-align: center;"> 
     <td><form method="post"> 
       <button formaction="UserHomeServlet" 
        style="background-color: black; color: white;">Cancel</button> 
      </form></td> 
     <td colspan="2" align="center"><form method="post"> 
       <button style="background-color: blue; color: white;" 
        formaction="payment.jsp?amount=<%=/* Java Code */%>">Pay Now</button> 
      </form></td> 
 
    </tr> 
    <% 
    } 
    %> 
   </tbody> 
  </table> 
 </div> 
 <!-- ENd of Product Items List --> 
 
 
 <%@ include file="footer.jsp"%> 
 
</body> 
</html>