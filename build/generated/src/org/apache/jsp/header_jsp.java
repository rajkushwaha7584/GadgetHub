package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.gadgethub.dao.impl.*;
import in.gadgethub.dao.*;
import in.gadgethub.utility.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Logout Header</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"mycss.css\" />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("            />\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #e6f9e6\">\n");
      out.write("        ");

            String userType = (String) session.getAttribute("userType");
            if (userType == null) {

                //GUEST

      out.write("\n");
      out.write("\n");
      out.write("        <!-- Starting Navigation Bar -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-custom\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"LandingServlet\">\n");
      out.write("                    ");
      out.print(AppInfo.appName);
      out.write("\n");
      out.write("                </a>\n");
      out.write("                <button\n");
      out.write("                    class=\"navbar-toggler\"\n");
      out.write("                    type=\"button\"\n");
      out.write("                    data-bs-toggle=\"collapse\"\n");
      out.write("                    data-bs-target=\"#navbarNav\"\n");
      out.write("                    aria-controls=\"navbarNav\"\n");
      out.write("                    aria-expanded=\"false\"\n");
      out.write("                    aria-label=\"Toggle navigation\"\n");
      out.write("                    >\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                        <!--Category JSP file-->\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "category.jsp", out, false);
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"./LandingServlet\">Products</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"register.jsp\">Register</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        ");
 } else if (userType.equalsIgnoreCase("Customer")) {
            //String userName = (String) request.getAttribute("userName");
            String userName = (String) session.getAttribute("userName");
            CartDaoImpl cartDao = new CartDaoImpl();
            int notf = cartDao.getAllCartItems(userName).size();
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-custom\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"UserHomeServlet\">\n");
      out.write("                    ");
      out.print(AppInfo.appName);
      out.write("\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\n");
      out.write("                        aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                        <!--Category JSP file-->\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "category.jsp", out, false);
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"./UserHomeServlet\" class=\"nav-link\">Products</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            if (notf == 0) {
                        
      out.write("\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"./CartDetailsServlet\"><span\n");
      out.write("                                    class=\"glyphiconglyphicon-shopping-cart\"></span>Cart\n");
      out.write("                            </a></li>\n");
      out.write("\n");
      out.write("                        ");

                        } else {
                        
      out.write("\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"./CartDetailsServlet\"\n");
      out.write("                                                style=\"margin: 0px; padding: 0px;\" id=\"mycart\"><i\n");
      out.write("                                    data-count=\"");
      out.print(notf);
      out.write("\"\n");
      out.write("                                    class=\"fa fa-shopping-cart fa-3x icon-white badge\"\n");
      out.write("                                    style=\"background-color: #333; margin: 0px; padding: 0px; padding-bottom: 0px; padding-top: 5px;\">\n");
      out.write("                                </i></a></li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"./OrderServlet\">Orders</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"./UserProfileServlet\">Profile</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"./LogoutServlet\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        ");

         } else {
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-custom\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"./AdminViewServlet\">\n");
      out.write("                    ");
      out.print(AppInfo.appName);
      out.write("\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\n");
      out.write("                        aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"./AdminViewServlet\">Products</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "category.jsp", out, false);
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"./AdminStockServlet\">Stock</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"./ShippedItemServlet\">Shipped</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"./UnshippedItemServlet\">Orders</a></li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\"\n");
      out.write("                               aria-expanded=\"false\">\n");
      out.write("                                Update Item\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <li><a href=\"addProduct.jsp\" class=\"dropdown-item\">Add Product</a></li>\n");
      out.write("                                <li><a href=\"removeProduct.jsp\" class=\"dropdown-item\">Remove Product</a></li>\n");
      out.write("                                <li><a href=\"updateProductById.jsp\" class=\"dropdown-item\">Update Product</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"./LogoutServlet\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
}
        
      out.write("    \n");
      out.write("        <!-- End of Navigation Bar -->\n");
      out.write("\n");
      out.write("        <!--Company Header Starting  -->\n");
      out.write("        <div\n");
      out.write("            class=\"container-fluid text-center bg-warning mt-0 p-3\"\n");
      out.write("            style=\"--bs-bg-opacity: 0.5\"\n");
      out.write("            >\n");
      out.write("            <h2>");
      out.print(AppInfo.appName);
      out.write("</h2>\n");
      out.write("            <h6>We specialize in Electronics</h6>\n");
      out.write("            <form class=\"form-inline\" action=\"LandingServlet\" method=\"get\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input\n");
      out.write("                        type=\"text\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        name=\"search\"\n");
      out.write("                        placeholder=\"Search Items\"\n");
      out.write("                        required\n");
      out.write("                        />\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\" value=\"Search\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <p\n");
      out.write("                align=\"center\"\n");
      out.write("                style=\"\n");
      out.write("                color: blue;\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin-top: 5px;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("                \"\n");
      out.write("                id=\"message\"\n");
      out.write("                >\n");
      out.write("\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <!-- Company Header Ending -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
