//package com.jichu;
//
//import com.jcraft.jsch.ChannelSftp;
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.Session;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
///**
// * @description:
// * @author: chao.zhang
// * @create: 2021-06-29 16:43
// **/
//public class FtpUtil {
//    /**
//     * 服务器ip地址
//     **/
//    private static final String hostname = "101.201.125.219";
//    /**
//     * 登录服务器用户名
//     **/
//    private static final String username = "root";
//    /**
//     * 登录服务器密码
//     **/
//    private static final String password = "";
//    /**
//     * 要上传到的服务器路径
//     **/
//    private static final String pathname = "/data/file/报告单文件上传";
//    /**
//     * FTPClient对象
//     **/
//    private static ChannelSftp ftpClient = null;
//    /**
//     *
//     */
//    private static Session sshSession = null;
//
//    /**
//     * 连接服务器
//     *
//     * @param host
//     * @param port
//     * @param userName
//     * @param password
//     * @return
//     * @throws Exception
//     */
//    public static ChannelSftp getConnect(String host, String port, String userName, String password)
//            throws Exception {
//        try {
//            JSch jsch = new JSch();
//            // 获取sshSession
//            sshSession = jsch.getSession(userName, host, Integer.parseInt(port));
//            // 添加s密码
//            sshSession.setPassword(password);
//            Properties sshConfig = new Properties();
//            sshConfig.put("StrictHostKeyChecking", "no");
//            sshSession.setConfig(sshConfig);
//            // 开启sshSession链接
//            sshSession.connect();
//            // 获取sftp通道
//            ftpClient = (ChannelSftp) sshSession.openChannel("sftp");
//            // 开启
//            ftpClient.connect();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new Exception("连接sftp服务器异常。。。。。。。。");
//        }
//        return ftpClient;
//    }
//
//    /**
//     * 上传
//     *
//     * @param upload_path 上传文件路径
//     * @param ftp_path    服务器保存路径
//     * @param newFileName 新文件名
//     * @throws Exception
//     */
//    public static void uploadFile(String upload_path, String ftp_path, String newFileName) throws Exception {
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream(new File(upload_path));
//            ftpClient.cd(ftp_path);
//            ftpClient.put(fis, newFileName);
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new Exception("Upload file error.");
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    throw new Exception("close stream error.");
//                }
//            }
//        }
//    }
//
//    /**
//     * 关闭
//     *
//     * @throws Exception
//     */
//    public static void close() throws Exception {
//        try {
//            ftpClient.disconnect();
//            sshSession.disconnect();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new Exception("close stream error.");
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        System.out.println("------start--------");
//        //联接
//        getConnect(hostname, "22", username, password);
//        //上传
//        uploadFile("/Users/zhangchao/Desktop/titu/tt.pdf", pathname, "tt2.pdf");
//        //关闭
//        close();
//        System.out.println("------end--------");
//    }
//
//}
