package com.sjsu.mybus.client;
 
import com.sjsu.mybus.model.BusDAO;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name="GuestServlet", urlPatterns={"/guest"})
public class GuestServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
 
    // Injected DAO EJB:
    @EJB BusDAO busDao;
 
    @Override
    protected void doGet(
        HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Display the list of guests:
        request.setAttribute("busses", busDao.getBuses());
        request.getRequestDispatcher("/bus_list.jsp").forward(request, response);
    }
 
//    @Override
//    protected void doPost(
//        HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
// 
//        // Handle a new guest:
//        String name = request.getParameter("name");
//        if (name != null)
//            guestDao.persist(new Bus(name));
// 
//        // Display the list of guests:
//        doGet(request, response);
//    }
}