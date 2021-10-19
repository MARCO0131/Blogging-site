package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Blog;
import com.daos.BlogDao;
import com.daos.BloggerDao;
import com.daos.CategoryDao;
import com.beans.Category;
import java.util.ArrayList;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .current{\n");
      out.write("        border-style: solid;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        background-color: gray;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<div class=\"col-lg-4\">\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"sidebar-item search\">\n");
      out.write("                    <form id=\"search_form\" name=\"gs\" method=\"GET\" action=\"#\">\n");
      out.write("                        <input type=\"text\" name=\"q\" class=\"searchText\" placeholder=\"type to search...\" autocomplete=\"on\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"sidebar-item recent-posts\">\n");
      out.write("                    <div class=\"sidebar-heading\">\n");
      out.write("                        <h2>Recent Posts</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <ul>\n");
      out.write("                            ");

                                BlogDao bd = new BlogDao();
                                ArrayList<Blog> blogList = bd.getBlogsByStatus("approved",0,3);
                                for (Blog blog : blogList) {
      out.write("\n");
      out.write("                            <li><a href=\"index.jsp?bid=");
      out.print(blog.getId());
      out.write("\">\n");
      out.write("                                    <h5>");
      out.print(blog.getTitle());
      out.write("</h5>\n");
      out.write("                                     </a>\n");
      out.write("                                    <span>");
      out.print(blog.getDate());
      out.write("</span>\n");
      out.write("                               </li>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"sidebar-item categories\">\n");
      out.write("                    <div class=\"sidebar-heading\">\n");
      out.write("                        <h2>Categories</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <ul>\n");
      out.write("                            ");

                                String cid = request.getParameter("cid");
                                System.out.println("cid : " + cid);
                            
      out.write("\n");
      out.write("                            <li><a href=\"index.jsp\" class=\"");
      out.print(cid == null ? "current" : "");
      out.write("\">- All Categories </a></li>\n");
      out.write("                                ");

                                    ArrayList<Category> clist = new CategoryDao().getAllCategories();
                                    for (Category c : clist) {
                                
      out.write("\n");
      out.write("                            <li>-<a href=\"index.jsp?cid=");
      out.print(c.getId());
      out.write("\" class=\"");
      out.print(cid != null && Integer.parseInt(cid) == c.getId() ? "current" : "");
      out.write("\"  > ");
      out.print(c.getName());
      out.write("</a> <span class=\"badge badge-secondary\">");
      out.print(new BlogDao().getBlogCountByCategory(c.getId()));
      out.write("</span> </li>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"sidebar-item tags\">\n");
      out.write("                    <div class=\"sidebar-heading\">\n");
      out.write("                        <h2>Tag Clouds</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Lifestyle</a></li>\n");
      out.write("                            <li><a href=\"#\">Creative</a></li>\n");
      out.write("                            <li><a href=\"#\">HTML5</a></li>\n");
      out.write("                            <li><a href=\"#\">Inspiration</a></li>\n");
      out.write("                            <li><a href=\"#\">Motivation</a></li>\n");
      out.write("                            <li><a href=\"#\">PSD</a></li>\n");
      out.write("                            <li><a href=\"#\">Responsive</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
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
