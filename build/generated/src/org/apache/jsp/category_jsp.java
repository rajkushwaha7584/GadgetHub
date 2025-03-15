package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.gadgethub.dao.impl.ProductDaoImpl;
import java.util.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("\t\t<title>Categories of the Products</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<li class=\"nav-item dropdown\" style=\"position: relative\">\n");
      out.write("\t\t\t<a\n");
      out.write("\t\t\t\tclass=\"nav-link dropdown-toggle\"\n");
      out.write("\t\t\t\thref=\"#\"\n");
      out.write("\t\t\t\tid=\"dropdownMenuLink\"\n");
      out.write("\t\t\t\trole=\"button\"\n");
      out.write("\t\t\t\tdata-bs-toggle=\"dropdown\"\n");
      out.write("\t\t\t\taria-expanded=\"false\"\n");
      out.write("\t\t\t>\n");
      out.write("\t\t\t\tCategory\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("\t\t\t\t");
 
                                    ProductDaoImpl productDao=new ProductDaoImpl();
                                    List<String> productType=productDao.getAllProductsType();
                                    for(String type:productType){
                                        String str=type.substring(0,1).toUpperCase().substring(1).toLowerCase();
                                
      out.write("\n");
      out.write("                                <li><a href=\"LandingServlet?type");
      out.print(type);
      out.write("\" Class=\"dropdown-item\">");
      out.print(str);
      out.write("</a></li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\t\t</li>\n");
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
