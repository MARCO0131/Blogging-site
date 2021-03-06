package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.BloggerDao;
import com.daos.BlogDao;
import com.beans.Blog;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"TemplateMo\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>MNIT Blog Project</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-stand-blog.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("TemplateMo 551 Stand Blog\n");
      out.write("\n");
      out.write("https://templatemo.com/tm-551-stand-blog\n");
      out.write("\n");
      out.write("-->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <!-- ***** Preloader Start ***** -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"jumper\">\n");
      out.write("            <div></div>\n");
      out.write("            <div></div>\n");
      out.write("            <div></div>\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("    <!-- include header.jsp -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <!-- Banner Starts Here -->\n");
      out.write("    <div class=\"main-banner header-text\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"owl-banner owl-carousel\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Banner Ends Here -->\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"blog-posts\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-8\">\n");
      out.write("            <div class=\"all-blog-posts\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <!-- change the following conents only -->\n");
      out.write("                 ");

                     int pg =  request.getParameter("pg")==null? 0 : Integer.parseInt(request.getParameter("pg")); 
                     int start,stop=3;
                     start = pg*stop;
                     String cid = request.getParameter("cid"); 
                     BlogDao bd = new BlogDao();
                      ArrayList<Blog> blogList=new ArrayList<Blog>();
                     if(cid==null){
                     //show all approved blogs
                      blogList = bd.getBlogsByStatus("approved",start,stop);
                     }
                     if (cid!=null) {
                         //filter the blogs by category
                          blogList =bd.getBlogsByCategory(Integer.parseInt(cid), "approved");
                     }
                     if(request.getParameter("bid")!= null){
                       Blog blog = bd.getBlogDetailById(Integer.parseInt(request.getParameter("bid"))); 
                       blogList = new ArrayList<Blog>(); 
                       blogList.add(blog); 
                     }
                     
                     
                     for(Blog blog : blogList){
      out.write("\n");
      out.write("                     \n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                  <div class=\"blog-post\">\n");
      out.write("                    <div class=\"blog-thumb\">\n");
      out.write("                        <img src=\"");
      out.print(blog.getPoster());
      out.write("\" alt=\"\" style=\"width:100%;height:300px;border-width:1px;border-style: double;border-radius: 10px;\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"down-content\">\n");
      out.write("                      \n");
      out.write("                        <a href=\"postDetails.jsp?id=");
      out.print(blog.getId());
      out.write("\"><h4>");
      out.print(blog.getTitle());
      out.write("</h4></a>\n");
      out.write("                      <ul class=\"post-info\">\n");
      out.write("                          <li><a href=\"postDetails.jsp?id=");
      out.print(blog.getId());
      out.write('"');
      out.write('>');
      out.print((new BloggerDao().getById(blog.getBloggerId())).getName());
      out.write("</a></li>\n");
      out.write("                        <li><a href=\"postDetails.jsp?id=");
      out.print(blog.getId());
      out.write('"');
      out.write('>');
      out.print(blog.getDate());
      out.write("</a></li>\n");
      out.write("                        <li><a href=\"postDetails.jsp?id=");
      out.print(blog.getId());
      out.write("\">12 Comments</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                      <p>");
      out.print(blog.getDescription().length()>200?blog.getDescription().substring(0,200):blog.getDescription());
      out.write("  \n");
      out.write("                          <br/>\n");
      out.write("                          <a rel=\"nofollow\" href=\"postDetails.jsp?id=");
      out.print(blog.getId());
      out.write("\" target=\"_parent\" class=\"btn btn-success\"> View Detail</a></p>\n");
      out.write("                      <div class=\"post-options\">\n");
      out.write("                        <div class=\"row\"> \n");
      out.write("                          <div class=\"col-6\">\n");
      out.write("                            <ul class=\"post-tags\">\n");
      out.write("                              <li><i class=\"fa fa-tags\"></i></li>\n");
      out.write("                              <li><a href=\"#\">Beauty</a>,</li>\n");
      out.write("                              <li><a href=\"#\">Nature</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-6\">\n");
      out.write("                            <ul class=\"post-share\">\n");
      out.write("                              <li><i class=\"fa fa-share-alt\"></i></li>\n");
      out.write("                              <li><a href=\"#\">Facebook</a>,</li>\n");
      out.write("                              <li><a href=\"#\"> Twitter</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("                  <div class=\"col col-md-12\">\n");
      out.write("                      <span style=\"float:right\"> <a href=\"index.jsp?pg=");
      out.print(pg+1);
      out.write("\" class=\"btn btn-primary ");
      out.print((start+stop)>= bd.getBlogCount("approved")? "disabled":"");
      out.write("\"> NEXT </a> </span>\n");
      out.write("                      \n");
      out.write("                      <span style=\"float:left\"> <a href=\"index.jsp?pg=");
      out.print(pg-1);
      out.write("\" class=\"btn btn-primary ");
      out.print(start==0?"disabled":"");
      out.write("\"> PREVIOUS </a> </span>\n");
      out.write("                  </div>\n");
      out.write("                     \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("                \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Additional Scripts -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl.js\"></script>\n");
      out.write("    <script src=\"assets/js/slick.js\"></script>\n");
      out.write("    <script src=\"assets/js/isotope.js\"></script>\n");
      out.write("    <script src=\"assets/js/accordions.js\"></script>\n");
      out.write("\n");
      out.write("    <script language = \"text/Javascript\"> \n");
      out.write("      cleared[0] = cleared[1] = cleared[2] = 0; //set a cleared flag for each field\n");
      out.write("      function clearField(t){                   //declaring the array outside of the\n");
      out.write("      if(! cleared[t.id]){                      // function makes it static and global\n");
      out.write("          cleared[t.id] = 1;  // you could use true and false, but that's more typing\n");
      out.write("          t.value='';         // with more chance of typos\n");
      out.write("          t.style.color='#fff';\n");
      out.write("          }\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </body>\n");
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
