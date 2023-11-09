// 65130500005 Kundids Khawmeesri
package com.example.mid_exam_005.servlet;

import com.example.mid_exam_005.model.PrimeHistory;
import com.example.mid_exam_005.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PrimeHistoryServlet", value = "/005/history")
public class PrimeHistoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("currentUser");
        PrimeHistory primeHistory = (PrimeHistory) session.getAttribute("history");
        request.setAttribute("currentUser", user);
        request.setAttribute("historyList", primeHistory.getPrimeList());
        request.setAttribute("noOfPrime", primeHistory.getNoOfPrime());
        request.getRequestDispatcher("/history.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
