package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home | Movie Theatre Website</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/myStyle.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"images/cine_bodyBG.jpg\");\n");
      out.write("                background-position: center 0;\n");
      out.write("                backface-visibility: visible;\n");
      out.write("                background-color: #030202!important;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            button[type=submit] {\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: white;\n");
      out.write("                color: Black;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 2px 2px;\n");
      out.write("                border: none;\n");
      out.write("                max-width: 220px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                display:block;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            button[type=submit]:hover {\n");
      out.write("                background-color: DeepSkyBlue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <li><a class=\"active\" href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"showtime.jsp\">Show Time</a></li>\n");
      out.write("            <li><a href=\"ticket.jsp\">Ticket Price</a></li>\n");
      out.write("            <li><a href=\"concession.jsp\">Concession</a></li>\n");
      out.write("            <li><a href=\"gossipNews.jsp\">Gossip & News</a></li>\n");
      out.write("            <li><a href=\"about.jsp\">About Movie Theatre</a></li>\n");
      out.write("            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            <li><a href=\"loginPageAdmin.jsp\">Admin Panel</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        </br>\t\t\n");
      out.write("        </br>\n");
      out.write("\n");
      out.write("        <div class=\"slideshow-container\">\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <div class=\"numbertext\">1 / 5</div>\n");
      out.write("                <img src=\"images/endgam.jpg\" style=\"width:100%; height:410px;\">\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2> Avengers Endgame</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <div class=\"numbertext\">2 / 5</div>\n");
      out.write("                <img src=\"images/X-men.jpg\" style=\"width:100%; height:410px;\">\n");
      out.write("                <div class=\"carousel-caption\"><h2>Dark Phoenix</h2></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <div class=\"numbertext\">3 / 5</div>\n");
      out.write("                <img src=\"images/durgeshh.jpg\" style=\"width:100%; height:410px;\">\n");
      out.write("                <div class=\"carousel-caption\"><h2>Durgeshgorer Guptodhon</h2></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <div class=\"numbertext\">4 / 4</div>\n");
      out.write("                <img src=\"images/fast.jpg\" style=\"width:100%; height:410px;\">\n");
      out.write("                <div class=\"carousel-caption\"><h2>Fast & Furious Presents: Hobbs & Shaw</h2></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <div class=\"numbertext\">5 / 5</div>\n");
      out.write("                <img src=\"images/spiderman.jpg\" style=\"width:100%; height:410px;\">\n");
      out.write("                <div class=\"carousel-caption\"><h2>Spider-Man: Far From Home</h2></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div style=\"text-align:center\">\n");
      out.write("            <span class=\"dot\"></span> \n");
      out.write("            <span class=\"dot\"></span> \n");
      out.write("            <span class=\"dot\"></span>\n");
      out.write("            <span class=\"dot\"></span>\n");
      out.write("            <span class=\"dot\"></span>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        </br>\n");
      out.write("\n");
      out.write("        <script src=\"myScript.js\"></script>\n");
      out.write("        <div class=\"homes\">\n");
      out.write("            <div>\n");
      out.write("                <nav>\n");
      out.write("                    ");

                        session = request.getSession(false);
                        System.out.println(session);
                        if (session != null) {
                            if (session.getAttribute("name") != null) {
      out.write("\n");
      out.write("                    <h4>Welcome \n");
      out.write("                        ");

                            String name = (String) session.getAttribute("name");
                            out.print(name);
                        
      out.write("\n");
      out.write("                    </h4>\n");
      out.write("                    <form action=\"logoutController\" method=\"post\">\n");
      out.write("                        <input type =\"submit\" value= \"logout\">\n");
      out.write("                    </form>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    <a href=\"loginPage.jsp\">Login to buy ticket.</a>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    <a href=\"register.jsp\">New here? Click here to register.</a>                           \n");
      out.write("                    ");
}
                        }
      out.write("\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <article>\n");
      out.write("\n");
      out.write("                <ul style=\"margin-left:0px;\">\n");
      out.write("                    <li class=\"active\"><a data-toggle=\"tab\" href=\"#sectionA\">Now Showing</a></li>\n");
      out.write("                    <li><a data-toggle=\"tab\" href=\"buyTicket.jsp\">Buy Ticket</a></li>\n");
      out.write("                    <li><a data-toggle=\"tab\" href=\"#sectionB\">Coming Soon</a></li>\n");
      out.write("                    <li><a data-toggle=\"tab\" href=\"#sectionD\">Music</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div id = \"sectionA\" style=\"margin-left:0px\" class=\"dv\">\n");
      out.write("                    <img src=\"images/endgam.jpg\" style=\"width:100%; height:50%; text-align: center;\">\n");
      out.write("                    <input style=\"margin-left:35%\" type=\"submit\" value=\"Details\" onclick=\"alert('Avengers Endgame  is Showing Now!!!!!')\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <h2 style=\"text-align:center\">Coming Soon!!!</h2>\n");
      out.write("                <h4 style=\"text-align:center\">Click Photo To Open In Full Size</h4>\n");
      out.write("\n");
      out.write("               <div id=\"sectionB\"style=\"margin-left:0px\" class=\"dv\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/Gemini Man.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(1)\" class=\"hover-shadow cursor\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/terminatorr.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(2)\" class=\"hover-shadow cursor\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/froz.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(3)\" class=\"hover-shadow cursor\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/marjavan.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(4)\" class=\"hover-shadow cursor\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                </br>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/star.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(5)\" class=\"hover-shadow cursor\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/war.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(6)\" class=\"hover-shadow cursor\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/zoombie.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(7)\" class=\"hover-shadow cursor\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/midway.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(8)\" class=\"hover-shadow cursor\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"myModal\" class=\"modal\">\n");
      out.write("                    <span class=\"close cursor\" onclick=\"closeModal()\">&times;</span>\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                        <div class=\"myGallerySlides\">\n");
      out.write("                            <div class=\"numbertext\">1 / 8</div>\n");
      out.write("                            <img src=\"images/Gemini Man.jpg\" style=\"width:100%\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"myGallerySlides\">\n");
      out.write("                            <div class=\"numbertext\">2 / 8</div>\n");
      out.write("                            <img src=\"images/terminatorr.jpg\" style=\"width:100%\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"myGallerySlides\">\n");
      out.write("                            <div class=\"numbertext\">3 / 8</div>\n");
      out.write("                            <img src=\"images/froz.jpg\" style=\"width:100%\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"myGallerySlides\">\n");
      out.write("                            <div class=\"numbertext\">4 / 8</div>\n");
      out.write("                            <img src=\"images/marjavan.jpg\" style=\"width:100%\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"myGallerySlides\">\n");
      out.write("                            <div class=\"numbertext\">5 / 8</div>\n");
      out.write("                            <img src=\"images/star.jpg\" style=\"width:100%\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"myGallerySlides\">\n");
      out.write("                            <div class=\"numbertext\">6 / 8</div>\n");
      out.write("                            <img src=\"images/war.jpg\" style=\"width:100%\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"myGallerySlides\">\n");
      out.write("                            <div class=\"numbertext\">7 / 8</div>\n");
      out.write("                            <img src=\"images/zoombie.jpg\" style=\"width:100%\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"myGallerySlides\">\n");
      out.write("                            <div class=\"numbertext\">8 / 8</div>\n");
      out.write("                            <img src=\"images/midway.jpg\" style=\"width:100%\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\n");
      out.write("                        <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\n");
      out.write("\n");
      out.write("                        <div class=\"caption-container\">\n");
      out.write("                            <p id=\"caption\"></p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("\n");
      out.write("                <h2 style=\"text-align:center\">Now Showing - Trailers</h2>\n");
      out.write("                <h4 style=\"text-align:center\">View Full Size To Have Better Resolution</h4>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <video width=\"100%\" controls>\n");
      out.write("                            <source src=\"video/Aynabaji Original Series 2017 _ Dondo Somash _ Full Drama.mp4\" type=\"video/mp4\">\n");
      out.write("                            Your browser does not support HTML5 video.\n");
      out.write("                        </video>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            Video courtesy of \n");
      out.write("                            <a href=\"https://www.youtube.com/\" target=\"_blank\">YouTube</a>.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <video width=\"100%\" controls>\n");
      out.write("                            <source src=\"video/Aynabaji Original Series 2017 _ Ke _ Keno _ Kivabe _ _ Full Drama.mp4\" type=\"video/mp4\">\n");
      out.write("                            Your browser does not support HTML5 video.\n");
      out.write("                        </video>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            Video courtesy of \n");
      out.write("                            <a href=\"https://www.youtube.com/\" target=\"_blank\">YouTube</a>.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <video width=\"100%\" controls>\n");
      out.write("                            <source src=\"video/Aynabaji Original Series 2017 _ March Mash e Shooting _ Full Drama.mp4\" type=\"video/mp4\">\n");
      out.write("                            Your browser does not support HTML5 video.\n");
      out.write("                        </video>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            Video courtesy of \n");
      out.write("                            <a href=\"https://www.youtube.com/\" target=\"_blank\">YouTube</a>.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <video width=\"100%\" controls>\n");
      out.write("                            <source src=\"video/Aynabaji Original Series 2017 _ Mukhomukhi _ Full Drama.mp4\" type=\"video/mp4\">\n");
      out.write("                            Your browser does not support HTML5 video.\n");
      out.write("                        </video>\n");
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                            Video courtesy of \n");
      out.write("                            <a href=\"https://www.youtube.com/\" target=\"_blank\">YouTube</a>.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </article>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            Copyright | CSE4226 | Section A2\n");
      out.write("        </footer>\n");
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
