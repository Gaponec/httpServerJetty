package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.*;
import servlets.adminPage.AdminPageAuth;
import servlets.adminPage.AdminPageBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        //creating servlet
        Test testServlet = new Test();
        Frontend frontend = new Frontend();

        //Market Servlets
        MarketPageServlet marketPageServlet = new MarketPageServlet();
        AdminPageBuilder adminPageBuilder = new AdminPageBuilder();
        AdminPageAuth adminPageAuth = new AdminPageAuth();

        Server server = new Server(8080);
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(contextHandler);

        contextHandler.addServlet(new ServletHolder(testServlet),"/test");
        contextHandler.addServlet(new ServletHolder(frontend),"/mirror");
        contextHandler.addServlet(new ServletHolder(marketPageServlet), "/");
        contextHandler.addServlet(new ServletHolder(adminPageBuilder),"/admin/");
        contextHandler.addServlet(new ServletHolder(adminPageAuth),"/admin");

        server.join();
        System.out.println("Server started");
        server.start();
    }
}
