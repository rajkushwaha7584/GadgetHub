<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="in.gadgethub.dao.impl.*, in.gadgethub.pojo.*,in.gadgethub.dao.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Admin Home</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

        <link rel="stylesheet" href="mycss.css">
    </head>
    <body style="background-color: #E6F9E6;">

        <jsp:include page="header.jsp" />

        <div class="text-center text-primary h3 m-3">Shipped Orders</div>
        <div class="container-fluid">
            <div class="table-responsive ">
                <table class="table table-hover table-sm">
                    <thead>
                        <tr>
                            <th>TransactionId</th>
                            <th>ProductId</th>
                            <th>Username</th>
                            <th>Address</th>
                            <th>Quantity</th>
                            <th>Amount</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            List<OrdersPojo> orders = (List<OrdersPojo>) request.getAttribute("orders");
                            Map<String, String> user_Id = (Map<String, String>) request.getAttribute("user_Id");
                            Map<String, String> user_address = (Map<String, String>) request.getAttribute("user_address");
                            int count = 0;
                            for (OrdersPojo order : orders) {
                                String transId = order.getOrderId();
                                String prodId = order.getProdId();
                                int quantity = order.getQuantity();
                                int shipped = order.getShipped();
                                String userId = user_Id.get(transId);
                                String userAddr = user_address.get(userId);
                                if (shipped != 0) {
                                    count++;
                        %>
                        <tr>
                            <td><%=transId%></td>
                            <td><a href="./updateProduct.jsp?prodid=<%=prodId%>"><%=prodId%></a></td>
                            <td><%=userId%></td>
                            <td><%=userAddr%></td>
                            <td><%=quantity%></td>
                            <td>Rs. <%=order.getAmount()%></td>
                            <td class="text-primary">SHIPPED</td>
                        </tr>
                        <%
                                }
                            }
                        %>
                        <%
                            if (count == 0) {
                        %>
                        <tr style="background-color: grey; color: white;">
                            <td colspan="7" style="text-align: center;">No Items
                                Available</td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>

        <%@ include file="footer.jsp"%>
    </body>
</html>
