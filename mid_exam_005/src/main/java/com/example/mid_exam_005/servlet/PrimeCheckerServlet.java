// 65130500005 Kundids Khawmeesri
package com.example.mid_exam_005.servlet;

import com.example.mid_exam_005.model.Prime;
import com.example.mid_exam_005.model.PrimeHistory;
import com.example.mid_exam_005.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PrimeCheckerServlet", value = "/005/is_prime")
public class PrimeCheckerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("history") == null ) {
            PrimeHistory history = new PrimeHistory();
            session.setAttribute("history", history);
        }
        request.getRequestDispatcher("/primerChecker.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("currentUser");
        int number = Integer.parseInt(request.getParameter("number"));
        if (request.getParameter("number").equals("")) {
            request.setAttribute("error", "number can't be empty");
            doGet(request, response);
        }else if(number < 2) {
            request.setAttribute("error", "number can't less than 2");
            doGet(request, response);
        }else {
            PrimeHistory primeHistory = (PrimeHistory) session.getAttribute("history");
            Prime prime = new Prime(primeHistory.getPrimeList().size() + 1, number, "");
            prime.checkPrime();
            primeHistory.setUser(user);
            primeHistory.addHistory(prime);
            if (prime.checkPrime()) {
                request.setAttribute("msg", "is a prime number");
            }else {
                request.setAttribute("msg", "is not a prime number");
            }
            request.setAttribute("calculated", number);
            request.getRequestDispatcher("/primerChecker.jsp").forward(request, response);
        }
    }
}
