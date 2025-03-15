package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.gadgethub.utility.*;
import java.util.*;
import in.gadgethub.pojo.ProductPojo;
import in.gadgethub.dao.impl.ProductDaoImpl;
import in.gadgethub.dao.impl.*;
import in.gadgethub.dao.*;
import in.gadgethub.pojo.*;
import javax.servlet.ServletOutputStream;
import java.io.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>");
      out.print(AppInfo.appName);
      out.write(" Application</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t\t<link\n");
      out.write("\t\t\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("\t\t\trel=\"stylesheet\"\n");
      out.write("\t\t/>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"mycss.css\" />\n");
      out.write("\t\t<link\n");
      out.write("\t\t\trel=\"stylesheet\"\n");
      out.write("\t\t\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("\t\t/>\n");
      out.write("\t</head>\n");
      out.write("\t<body style=\"background-color: #e6f9e6\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("     \n");
      out.write("                <div class=\"text-center m-3 text-primary h3\">");
      out.print(request.getAttribute("message") );
      out.write("</div>\n");
      out.write("\t\t<!-- Start of Product Items List -->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row text-center\">\n");
      out.write("\t\t\t\t");
 
                                   Map<String,Integer>mapList=(HashMap)request.getAttribute("map");
                                   String userName=(String)request.getAttribute("userName");
                                   List<ProductPojo>prodList=(ArrayList<ProductPojo>)request.getAttribute("products");
                                   for(ProductPojo product:prodList){
                                           int cartQty=mapList.get(product.getProdId());
                                
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t<div class=\"thumbnail mt-3 mb-3\">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./ShowImageServlet?pid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\talt=\"Product\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"height: 150px; max-width: 180px\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"mt-3\"\n");
      out.write("\t\t\t\t\t\t/>\n");
      out.write("\t\t\t\t\t\t<p class=\"productname\">");
      out.print(product.getProdName());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t");
 
                                                    String description=product.getProdInfo();
                                                    description=description.substring(0, Math.min(100, description.length()));
                                                
      out.write("\n");
      out.write("                                                <p class=\"productinfo\">");
      out.print(description );
      out.write("..</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"price\">Rs");
      out.print(product.getProdPrice());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t<form method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t");
if(cartQty==0){
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<button\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\tformaction=\"./AddToCartServlet?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=1\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-warning\"\n");
      out.write("\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t\tAdd to Cart\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t\t<button\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\tformaction=\"./AddToCartServlet?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=1\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary\"\n");
      out.write("\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t\tBuy Now\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t");
 }else{ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<button\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\tformaction=\"./AddToCartServlet?uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&pqty=0\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-danger\"\n");
      out.write("\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t\tRemove From Cart\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t\t<button\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\tformaction=\"cartDetails.jsp\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-success\"\n");
      out.write("\t\t\t\t\t\t\t>\n");
      out.write("\t\t\t\t\t\t\t\tCheckout\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("                                                        ");

                                                            }
                                                         
      out.write("               \n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- ENd of Product Items List -->\n");
      out.write("\n");
      out.write("\t\t");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <title>Bootstrap demo</title>\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\"\n");
      out.write("      integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container-fluid bg-primary text-white p-3 mt-5\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h2 class=\"text-center\">Contact</h2>\n");
      out.write("        <p class=\"text-center\">We love our fans!</p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <p><i class=\"fa-solid fa-phone\"></i> Phone : +91 6264100725</p>\n");
      out.write("            <p>\n");
      out.write("              <i class=\"fa-solid fa-envelope\"></i> Email : raj24kush@gmail.com\n");
      out.write("            </p>\n");
      out.write("            <p><i class=\"fa-solid fa-signs-post\"></i> Postal Code : 462020</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-md-8\">\n");
      out.write("            <form action=\"#\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6 form-group mt-1\">\n");
      out.write("                  <input\n");
      out.write("                    type=\"text\"\n");
      out.write("                    class=\"form-control\"\n");
      out.write("                    placeholder=\"name\"\n");
      out.write("                    required\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 form-group mt-1\">\n");
      out.write("                  <input\n");
      out.write("                    type=\"email\"\n");
      out.write("                    class=\"form-control\"\n");
      out.write("                    placeholder=\"email\"\n");
      out.write("                    required\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <textarea\n");
      out.write("                  name=\"\"\n");
      out.write("                  id=\"\"\n");
      out.write("                  rows=\"5\"\n");
      out.write("                  class=\"form-control mt-1\"\n");
      out.write("                  placeholder=\"Enter your message..\"\n");
      out.write("                > </textarea>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 form-group mt-1\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning\">send</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
