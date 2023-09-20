package Usermanagement.web;

import Usermanagement.dao.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO userDAO;
    public UserServlet() {
        super();
        this.userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String action = request.getServletPath();

        // here put the getUser and getAllUsers logic

        switch (action) {
            case "/new" :
                break;
            case "/insert" :
                break;
            case "/delete" :
                break;
            case "/edit" :
                break;
            case "/update" :
                break;
            default:
                break;
        }
    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
        this.doGet(request, response);
        // Here put the insert user
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
    }
}