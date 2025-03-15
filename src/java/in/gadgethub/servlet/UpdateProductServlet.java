/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.servlet;

import in.gadgethub.dao.ProductDao;
import in.gadgethub.dao.impl.ProductDaoImpl;
import in.gadgethub.pojo.ProductPojo;
import java.io.IOException;
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
public class UpdateProductServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        String userName=(String)session.getAttribute("userName");
        String password=(String)session.getAttribute("password");
        String userType=(String)session.getAttribute("userType");
        if(userType==null || !userType.equalsIgnoreCase("admin")){
           response.sendRedirect("login.jsp?message=Access denied ! Please login as admin");
        }else if(userName==null||password==null){
            response.sendRedirect("login.jsp?message=Session expired ! Please login again");
         }
        String prodId=request.getParameter("pid");
        String prodName=request.getParameter("name");
        String prodType=request.getParameter("type");
        String prodinfo=request.getParameter("info");
        Double prodPrice=Double.parseDouble(request.getParameter("price"));
        Integer prodQuantity=Integer.parseInt(request.getParameter("quantity"));
        ProductPojo products=new ProductPojo();
        products.setProdId(prodId);
        products.setProdName(prodName);
        products.setProdInfo(prodinfo);
        products.setProdPrice(prodPrice);
        products.setProdQuantity(prodQuantity);
        products.setProdType(prodType);
        
        ProductDaoImpl productDao=new ProductDaoImpl();
        String status=productDao.updateProductWithoutImage(prodId,products);
        RequestDispatcher rd=request.getRequestDispatcher("updateProduct.jsp?message="+status);
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
