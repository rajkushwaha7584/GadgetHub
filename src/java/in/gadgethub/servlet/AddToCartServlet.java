/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.servlet;

import in.gadgethub.dao.CartDao;
import in.gadgethub.dao.impl.CartDaoImpl;
import in.gadgethub.dao.impl.DemandDaoImpl;
import in.gadgethub.dao.impl.ProductDaoImpl;
import in.gadgethub.pojo.CartPojo;
import in.gadgethub.pojo.Demandpojo;
import in.gadgethub.pojo.ProductPojo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rj851
 */
public class AddToCartServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userName");
        String password = (String) session.getAttribute("password");
        String userType = (String) session.getAttribute("userType");
        if (userType == null || password == null || userName == null || !userType.equalsIgnoreCase("customer")) {
            response.sendRedirect("login.jsp?message=Access denied ! Please login first");
            return;
        }
        CartDaoImpl cartDao = new CartDaoImpl();
//        Map<String, Integer> map = new HashMap<>();
//        for (ProductPojo product : products) {
//            int qty = cartDao.getCartItemCount(userName, product.getProdId());
//            map.put(product.getProdId(), qty);
//        }
        String userId = userName;
        String prodId = request.getParameter("pid");
        int pQty = Integer.parseInt(request.getParameter("pqty"));
        String action = request.getParameter("action");

        ProductDaoImpl productDao = new ProductDaoImpl();
        ProductPojo productPojo = productDao.getProductDetails(prodId);
        int avQty = productDao.getProductQuantity(prodId);
        int cartQty = cartDao.getCartItemCount(userId, prodId);
        pQty += cartQty;
        if (action != null) {
            cartDao.updateProductInCart(new CartPojo(userId, prodId, pQty));
            RequestDispatcher rd = request.getRequestDispatcher("./CartDetailsServlet");
            rd.forward(request, response);
        } else if (pQty == cartQty) {
            String status = cartDao.removeProductFromCart(userId, prodId);
            List<ProductPojo> products = productDao.getAllProducts();
            Map<String, Integer> map = new HashMap<>();
            for (ProductPojo product : products) {
                int qty = cartDao.getCartItemCount(userName, product.getProdId());
                map.put(product.getProdId(), qty);
            }
            session.setAttribute("products", products);
            session.setAttribute("map", map);
            RequestDispatcher rd = request.getRequestDispatcher("userHome.jsp");
            //pw.println("<script>document.getElementById('message').innerHTML='" + status + "'</script>");
            request.setAttribute("message", status);
            rd.forward(request, response);

        } else if (avQty < pQty) {
            String status = null;
            if (avQty == 0) {
                status = "Product out of stock!";
            } else {
                cartDao.updateProductInCart(new CartPojo(userId, prodId, avQty));
                status = "Only " + avQty + " no of " + productPojo.getProdName() + " are available, so we are adding only " + avQty + " products in your cart";
            }
            DemandDaoImpl demand = new DemandDaoImpl();
            Demandpojo demandPojo = new Demandpojo(userId, prodId, pQty - avQty);
            boolean flag = demand.addProduct(demandPojo);
            if (flag) {
                status += "<br/>Later we will mail you when " + productPojo.getProdName() + " will be available";
            }
            RequestDispatcher rd = request.getRequestDispatcher("./CartDetailsServlet");
            //pw.println("<script>document.getElementById('message').innerHTML='" + status + "'</script>");
            //rd.include(request, response);
            request.setAttribute("message", status);
            rd.forward(request, response);
        } else {
            String status = cartDao.updateProductInCart(new CartPojo(userId, prodId, pQty));
            List<ProductPojo> products = productDao.getAllProducts();
            Map<String, Integer> map = new HashMap<>();
            for (ProductPojo product : products) {
                int qty = cartDao.getCartItemCount(userName, product.getProdId());
                map.put(product.getProdId(), qty);
            }
            session.setAttribute("products", products);
            session.setAttribute("map", map);
            RequestDispatcher rd = request.getRequestDispatcher("userHome.jsp");
            //pw.println("<script>document.getElementById('message').innerHTML='" + status + "'</script>");
            //rd.include(request, response);
            request.setAttribute("message", status);
            rd.forward(request, response);
        }

    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}





