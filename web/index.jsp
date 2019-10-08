<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/8/2019
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Calculator simple</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form method="post" action="/calculate">
    <fieldset>
        <legend>Calculator</legend>
        <label> First operand:</label>
        <input type="text" name="firstOperand"><br>
        <label> Operator:</label>
        <select name="operator">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
        </select>
        <br>
        <label>Second operand:</label>
        <input type="text" name="secondOperand">
        <input type="submit" value="Calculate">
    </fieldset>
</form>
</body>
</html>


<%--<html>--%>
<%--<head>--%>
<%--    <title>Calculator</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Simple Calculator</h1>--%>
<%--<form method="post" action="/calculate">--%>
<%--    <fieldset>--%>
<%--        <legend>Calculator</legend>--%>
<%--        <table>--%>
<%--            <tr>--%>
<%--                <td>First operand: </td>--%>
<%--                <td><input name="first-operand" type="text"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Operator: </td>--%>
<%--                <td>--%>
<%--                    <select name="operator">--%>
<%--                        <option value="+">Addition</option>--%>
<%--                        <option value="-">Subtraction</option>--%>
<%--                        <option value="*">Multiplication</option>--%>
<%--                        <option value="/">Division</option>--%>
<%--                    </select>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Second operand: </td>--%>
<%--                <td><input name="second-operand" type="text"/></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td></td>--%>
<%--                <td><input type="submit" value="Calculate"/></td>--%>
<%--            </tr>--%>
<%--        </table>--%>
<%--    </fieldset>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>