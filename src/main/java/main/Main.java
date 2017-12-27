package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.Frontend;
import servlets.Test;

public class Main {
    public static void main(String[] args) throws Exception {
        //creating servlet
        Test testServlet = new Test();
        Frontend frontend = new Frontend();

        Server server = new Server(8080);
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(contextHandler);

        contextHandler.addServlet(new ServletHolder(testServlet),"/test");
        contextHandler.addServlet(new ServletHolder(frontend),"/mirror");

        server.join();
        System.out.println("Server started");
        server.start();
    }
}
