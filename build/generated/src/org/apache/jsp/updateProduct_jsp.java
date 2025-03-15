package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.gadgethub.dao.impl.*;
import in.gadgethub.pojo.*;
import in.gadgethub.dao.*;
import java.util.*;
import javax.servlet.ServletOutputStream;
import java.io.*;

public final class updateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html> \n");
      out.write("        <head> \n");
      out.write("            <title>Update Product</title> \n");
      out.write("            <meta charset=\"utf-8\"> \n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\"> \n");
      out.write("            <link rel=\"stylesheet\" href=\"mycss.css\"> \n");
      out.write("        </head> \n");
      out.write("    <body style=\"background-color: #E6F9E6;\"> \n");
      out.write(" \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \n");
      out.write(" \n");
      out.write("        ");
 
            String message=request.getParameter("message"); 
            ProductPojo product=(ProductPojo)request.getAttribute("product");
            
      out.write(" \n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div class=\"row justify-content-center\"> \n");
      out.write("                <form action=\"./UpdateProductServlet\" method=\"post\" class=\"col-md-6 col-md-offset-3 myform\"> \n");
      out.write("                    <div class=\"text-center\"> \n");
      out.write("                        <div class=\"form-group\"> \n");
      out.write("                            <img src=\"./ShowImageServlet?pid=");
      out.print( product.getProdId() );
      out.write("\" alt=\"Product Image\" height=\"100px\" /> \n");
      out.write("                            <h2 class=\"text-primary\">Product Update Form</h2> \n");
      out.write("                        </div> \n");
      out.write(" \n");
      out.write("                         ");
 
                        if (message!=null) {         
                        
      out.write(" \n");
      out.write("                        \n");
      out.write("                        <p style=\"color: blue;\"> \n");
      out.write("                        ");
      out.print(message);
      out.write(" \n");
      out.write("                        </p> \n");
      out.write("                        \n");
      out.write("                         ");
 
                            }
                            
      out.write(" \n");
      out.write("                    </div> \n");
      out.write(" \n");
      out.write("                    <div class=\"row\"> \n");
      out.write("                        <input type=\"hidden\" name=\"pid\" class=\"form-control\" value=\"");
      out.print(product.getProdId());
      out.write("\" id=\"last_name\" required> \n");
      out.write("                    </div> \n");
      out.write(" \n");
      out.write("                    <div class=\"row\"> \n");
      out.write("                        <div class=\"col-md-6 form-group\"> \n");
      out.write("                            <label for=\"last_name\">Product Name</label> \n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Product Name\" name=\"name\" class=\"form-control\" value=\"");
      out.print(product.getProdName() );
      out.write("\" id=\"last_name\" required> \n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"col-md-6 form-group\"> \n");
      out.write("                                 ");
 
                                String ptype=product.getProdType();
                                
      out.write(" \n");
      out.write("                            <label for=\"producttype\">Product Type</label> \n");
      out.write("                            <select name=\"type\" id=\"producttype\" class=\"form-control\" required> \n");
      out.write("                                <option value=\"mobile\" ");
      out.print(ptype.equalsIgnoreCase("mobile")?"selcted":"");
      out.write(">MOBILE</option> \n");
      out.write("                                <option value=\"tv\" ");
      out.print(ptype.equalsIgnoreCase("tv")?"selcted":"");
      out.write(">TV</option> \n");
      out.write("                                <option value=\"laptop\" ");
      out.print(ptype.equalsIgnoreCase("laptop")?"selcted":"");
      out.write(">LAPTOP</option> \n");
      out.write("                                <option value=\"tablet\" ");
      out.print(ptype.equalsIgnoreCase("tablet")?"selcted":"");
      out.write(">TABLET</option> \n");
      out.write("                                <option value=\"speaker\" ");
      out.print(ptype.equalsIgnoreCase("speaker")?"selcted":"");
      out.write(">SPEAKER</option> \n");
      out.write("                                <option value=\"other\" ");
      out.print(ptype.equalsIgnoreCase("other")?"selcted":"");
      out.write(">Some Other Appliances</option> \n");
      out.write("                            </select> \n");
      out.write("                        </div> \n");
      out.write("                    </div> \n");
      out.write(" \n");
      out.write("                    <div class=\"form-group\"> \n");
      out.write("                        <label for=\"last_name\">Product Description</label> \n");
      out.write("                        <textarea name=\"info\" class=\"form-control text-align-left\" id=\"last_name\" required>");
      out.print(product.getProdInfo());
      out.write("</textarea> \n");
      out.write("                    </div> \n");
      out.write(" \n");
      out.write("                    <div class=\"row\"> \n");
      out.write("                        <div class=\"col-md-6 form-group\"> \n");
      out.write("                            <label for=\"last_name\">Unit Price</label> \n");
      out.write("                            <input type=\"number\" value=\"");
      out.print(product.getProdPrice());
      out.write("\" placeholder=\"Enter Unit Price\" name=\"price\" class=\"form-control\" id=\"last_name\" required> \n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"col-md-6 form-group\"> \n");
      out.write("                            <label for=\"last_name\">Stock Quantity</label> \n");
      out.write("                            <input type=\"number\" value=\"");
      out.print(product.getProdQuantity());
      out.write("\" placeholder=\"Enter Stock Quantity\" class=\"form-control\" id=\"last_name\" name=\"quantity\" required> \n");
      out.write("                        </div> \n");
      out.write("                    </div> \n");
      out.write("                        <br/> \n");
      out.write(" \n");
      out.write("                    <div class=\"row text-center\"> \n");
      out.write("<!-- Separate Form for Cancel Button --> \n");
      out.write("                        <div class=\"col-md-6\"> \n");
      out.write("                            <form action=\"./AdminViewServlet\" method=\"get\"> \n");
      out.write("                                <button type=\"submit\" formaction=\"./AdminViewServlet\" class=\"btn btn-danger\">Cancel</button> \n");
      out.write("                            </form> \n");
      out.write("                        </div> \n");
      out.write(" \n");
      out.write("<!-- Submit Button for Update Product --> \n");
      out.write("                        <div class=\"col-md-6\"> \n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\">Update Product</button> \n");
      out.write("                        </div> \n");
      out.write("                    </div> \n");
      out.write("                </form> \n");
      out.write("            </div> \n");
      out.write("        </div> \n");
      out.write(" \n");
      out.write("        ");
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
      out.write(" \n");
      out.write("    </body> \n");
      out.write("</html>");
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
