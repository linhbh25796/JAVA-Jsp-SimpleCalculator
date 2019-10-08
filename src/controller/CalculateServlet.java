package controller;

import model.Calculate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Integer.parseInt(request.getParameter("firstOperand"));
        float secondOperand = Integer.parseInt(request.getParameter("secondOperand"));
        char operator = request.getParameter("operator").charAt(0);
        Calculate calculate = new Calculate();
        calculate.setFirstOperand(firstOperand);
        calculate.setSecondOperand(secondOperand);
        calculate.setOperator(operator);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try{
            float result = calculate.calculate();
            writer.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
        }catch (Exception ex){
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
