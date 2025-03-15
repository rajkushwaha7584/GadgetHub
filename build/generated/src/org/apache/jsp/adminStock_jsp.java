package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.gadgethub.dao.impl.*;
import in.gadgethub.dao.*;
import in.gadgethub.pojo.*;
import javax.servlet.ServletOutputStream;
import java.io.*;
import java.util.*;

public final class adminStock_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Product Stocks</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"mycss.css\">\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\n");
      out.write("\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"text-center text-primary h3 m-3\">Stock Products</div>\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"table-responsive \">\n");
      out.write("\t\t\t<table class=\"table table-hover table-sm\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>Image</th>\n");
      out.write("\t\t\t\t\t\t<th>ProductId</th>\n");
      out.write("\t\t\t\t\t\t<th>Name</th>\n");
      out.write("\t\t\t\t\t\t<th>Type</th>\n");
      out.write("\t\t\t\t\t\t<th>Price</th>\n");
      out.write("\t\t\t\t\t\t<th>Sold Qty</th>\n");
      out.write("\t\t\t\t\t\t<th>Stock Qty</th>\n");
      out.write("\t\t\t\t\t\t<th colspan=\"2\" class=\"text-center\">Actions</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
					
					List<ProductPojo>products=(List<ProductPojo>)request.getAttribute("products");
                                        OrderDao orderDao=new OrderDaoImpl();
                                        for(ProductPojo product:products){
					
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td><img src=\"./ShowImageServlet?pid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 50px; height: 50px;\"></td>\n");
      out.write("\t\t\t\t\t\t<td><a\n");
      out.write("\t\t\t\t\t\thref=\"./updateProduct.jsp?prodid=");
      out.print(product.getProdId());
      out.write('"');
      out.write('>');
      out.print(product.getProdId());
      out.write("</a></td>\n");
      out.write("\t\t\t\t\t\t");

						String name=product.getProdName();
                                                name=name.substring(0,Math.min(name.length(),25));
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(name);
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(product.getProdType().toUpperCase());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(product.getProdPrice());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(orderDao.getSoldQuantity(product.getProdId()));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(product.getProdQuantity());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<form method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\tformaction=\"./UpdateProductByIdServlet?prodid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary\">Update</button>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<form method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\"\n");
      out.write("                                                                        formaction=\"./RemoveProductServlet?prodid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-danger\">Remove</button>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\n");
      out.write("\t\t\t\t\t");

					if(products.isEmpty()) {
					
      out.write("\n");
      out.write("\t\t\t\t\t<tr style=\"background-color: grey; color: white;\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"7\" style=\"text-align: center;\">No Items\n");
      out.write("\t\t\t\t\t\t\tAvailable</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
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
      out.write("</body>\n");
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
