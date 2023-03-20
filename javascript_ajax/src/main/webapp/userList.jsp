<%@page import="com.google.gson.GsonBuilder"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ezen.ajax.User"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.InputStreamReader"%>
<%@ page contentType="application/json; charset=UTF-8" %>
<%
//List<User> = userService.findAll();
List<User> list = new ArrayList<>();
list.add(new User("bangry", "1111", 30, "서울시 노원구"));
list.add(new User("bangry", "1111", 30, "서울시 노원구"));
list.add(new User("bangry", "1111", 30, "서울시 노원구"));
list.add(new User("bangry", "1111", 30, "서울시 노원구"));
list.add(new User("bangry", "1111", 30, "서울시 노원구"));

//Gson gson = new Gson();
Gson gson = new GsonBuilder().setPrettyPrinting().create(); //new Gson이랑 비슷
String jsonList = gson.toJson(list);
out.println(jsonList);
%>