/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import database.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author jose
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/usuario/*"})
public class UsuarioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String action = request.getPathInfo();
            UsuarioDAO udao = new UsuarioDAO();
            HttpSession session = request.getSession();
            Usuario actualUser;
            String username;
            String password;
            String name;
            String last_name;
            String email;
            int regs_afectados;
            
            switch (action) {
                case "/loginUser":
                    username = request.getParameter("username");
                    password = request.getParameter("password");
                    // verificar si existe el usuario y si coincide la clave
                    boolean existeUsuario = udao.login(username, password);
                    session.setAttribute("isLogin", existeUsuario);
                    session.setAttribute("actualUsername", username);
                    response.sendRedirect("/homebanking/views/user.jsp");
                    break;
                
                case "/logoutUser":
                    session.setAttribute("isLogin", false);
                    session.setAttribute("actualUsername", "");
                    response.sendRedirect("/homebanking/");
                    break;
                    
                case "/createUser":
                    username = request.getParameter("username");
                    if( udao.getUserByUsername(username) == null){
                        password = request.getParameter("password");
                        name = request.getParameter("name");
                        last_name = request.getParameter("last_name");
                        email = request.getParameter("email");
                        actualUser = new Usuario(username,password,name,last_name,email);
                        regs_afectados = udao.createUser(actualUser);
                    }
                    else {
                        regs_afectados = 2;
                    }
                    
                    session.setAttribute("uCreado", regs_afectados);
                    response.sendRedirect("/homebanking/views/userCreado.jsp");
                    break;
                    
                case "/viewUser":
                    username = (String) session.getAttribute("actualUsername");
                    actualUser = udao.getUserByUsername(username);
                    
                    session.setAttribute("actualUser", actualUser);
                    response.sendRedirect("/homebanking/views/edicion.jsp");
                    break;
                    
                case "/deleteUser":
                    username = (String) session.getAttribute("actualUsername");
                    regs_afectados = udao.deleteUser(username);
                    session.setAttribute("isLogin", false);
                    session.setAttribute("actualUsername", "");
                    response.sendRedirect("/homebanking/");
                    break;
                
                case "/updateUser":
                    username = (String) session.getAttribute("actualUsername");
                    password = request.getParameter("password");
                    name = request.getParameter("name");
                    last_name = request.getParameter("last_name");
                    email = request.getParameter("email");
                    actualUser = new Usuario(username, password, name, last_name, email);
                    regs_afectados = udao.updateUser(actualUser);
                    
                    session.setAttribute("actualUser", actualUser);
                    response.sendRedirect("/homebanking/views/edicion.jsp");
                    
                    break;
                
                default:
                    break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
