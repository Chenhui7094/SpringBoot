<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
	<%
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名test1
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		// MySQL配置时的用户名
		String user = "root";
		// Java连接MySQL配置时的密码
		String password = "root";

		try {
			// 1 加载驱动程序
			Class.forName(driver);
			// 2 连接数据库
			Connection conn = DriverManager.getConnection(url, user, password);
			// 3 用来执行SQL语句
			Statement statement = conn.createStatement();
			// 要执行的SQL语句
			String sql = "select * from login";

			ResultSet rs = statement.executeQuery(sql);
			String name = null;
			String mima = null;
			while (rs.next()) {
				name = rs.getString("userName");
				mima = rs.getString("passWord");
				out.println(name + "\t" + mima);
			}
			rs.close();
			statement.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
</body>
</html>