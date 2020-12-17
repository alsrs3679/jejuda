//package com.jejuda;
//
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.JSchException;
//import com.jcraft.jsch.Session;
//
//@WebListener
//public class MyContextListener implements ServletContextListener {
//    static Session SSH_SESSION;
//    static JSch jsch = new JSch();
//
//    @Override
//    public void contextDestroyed(ServletContextEvent arg0) {
//        if(SSH_SESSION != null){
//            SSH_SESSION.disconnect();
//        }
//        if(jsch != null){
//            jsch = null;
//        }
//    }
//
//    @Override
//    public void contextInitialized(ServletContextEvent arg0) {
//
//        java.util.Properties config = new java.util.Properties();
//        config.put("StrictHostKeyChecking", "no");
//        System.out.println("--------------------르스너 진입-----------------------");
//
//        try {
//            SSH_SESSION = jsch.getSession("jejuda", "www.jejuda.net", 23);
//            SSH_SESSION.setPassword("qwe131");
//            SSH_SESSION.setConfig(config);
//            SSH_SESSION.connect();
//            SSH_SESSION.setPortForwardingL(8923, "127.0.0.1", 3306);
//        } catch (JSchException e) {
//            e.printStackTrace();
//        }
//    }
//
//}