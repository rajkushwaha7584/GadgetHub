package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
      out.write("      crossorigin=\"anonymous\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"conatiner mt-5 mb-5\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("        <form action=\"#\" class=\"col-md-6 myform\">\n");
      out.write("          <div class=\"text-center\">\n");
      out.write("            <img\n");
      out.write("              src=\"/All_images/payment.png\"\n");
      out.write("              alt=\"\"\n");
      out.write("              height=\"100px\"\n");
      out.write("              width=\"100px\" />\n");
      out.write("            <h2 class=\"text-primary\">Payment Details</h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row mt-3\">\n");
      out.write("            <div class=\"form-group col-md-12\">\n");
      out.write("              <label for=\"card_holder_name\">Name of Card Holder</label>\n");
      out.write("              <input type=\"text\" id=\"card_holder_name\" class=\"form-control\" />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row mt-3\">\n");
      out.write("            <div class=\"form-group col-md-12\">\n");
      out.write("              <label for=\"card_number\">Credit Card Number</label>\n");
      out.write("              <input\n");
      out.write("                type=\"text\"\n");
      out.write("                id=\"card_number\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                placeholder=\"1234-1234-1234\" />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row mt-3\">\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"expiry_month\">Expiry Month</label>\n");
      out.write("              <input\n");
      out.write("                type=\"number\"\n");
      out.write("                id=\"expiry_month\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                min=\"1\"\n");
      out.write("                max=\"12\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"expiry_year\">Expiry Year</label>\n");
      out.write("              <input type=\"number\" id=\"expiry_year\" class=\"form-control\" />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row mt-3 mb-3\">\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"cvv\">Card CVV</label>\n");
      out.write("              <input type=\"number\" class=\"form-control\" id=\"cvv\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"\">&nbsp;</label>\n");
      out.write("              <button type=\"button\" class=\"btn btn-warning form-control\">\n");
      out.write("                Pay Rs: 20000\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("      crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
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
