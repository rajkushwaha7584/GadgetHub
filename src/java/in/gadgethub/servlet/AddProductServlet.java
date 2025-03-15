/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.servlet;

import in.gadgethub.dao.impl.ProductDaoImpl;
import in.gadgethub.pojo.ProductPojo;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author rj851
 */
@MultipartConfig(maxFileSize = 161777215)
public class AddProductServlet extends HttpServlet {

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
        RequestDispatcher rd=null;
        String status="Product Registration Failed";
        String prodName=request.getParameter("name");
        String prodType=request.getParameter("type");
        String prodInfo=request.getParameter("info");
        double prodPrice=0.0;
        int prodQuantity=0;
        String priceParam=request.getParameter("price");
        if (priceParam!=null) {
            try {
                prodPrice=Double.parseDouble(priceParam);
            } catch (Exception e) {
                status="Invalid unit price";
                request.setAttribute("message", status);
                rd=request.getRequestDispatcher("addProduct.jsp");
                rd.forward(request, response);
                return;
            }
        }else{
            status="Price cann't be left blank";
            request.setAttribute("message", status);
            rd=request.getRequestDispatcher("addProduct.jsp");
            rd.forward(request, response);
            return;
        }
//        ==============
        String qtyParam=request.getParameter("price");
        if (qtyParam!=null) {
            try {
                prodQuantity=Integer.parseInt(qtyParam);
            } catch (Exception e) {
                status="Invalid unit price";
                request.setAttribute("message", status);
                rd=request.getRequestDispatcher("addProduct.jsp");
                rd.forward(request, response);
                return;
            }
        }else{
            status="Quantity cann't be left blank";
            request.setAttribute("message", status);
            rd=request.getRequestDispatcher("addProduct.jsp");
            rd.forward(request, response);
            return;
        }
        //This is fatching the file
        
        Part part=request.getPart("image");
        InputStream img=part.getInputStream();
        ProductDaoImpl productDao=new ProductDaoImpl();
        ProductPojo product=new ProductPojo(null,prodName,prodType,prodInfo,prodPrice,prodQuantity,img);
        status=productDao.addProductId(product);
        request.setAttribute("message", status);
            rd=request.getRequestDispatcher("addProduct.jsp");
            rd.forward(request, response);
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




