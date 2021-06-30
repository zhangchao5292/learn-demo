//package com.jichu;
//
//
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPClientConfig;
//import org.apache.commons.net.ftp.FTPFile;
//import org.apache.commons.net.ftp.FTPReply;
//
//import java.io.*;
//
///**
// * @description:
// * @author: chao.zhang
// * @create: 2021-06-29 16:31
// **/
//public class UploadFTPClient {
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
//    private static final String password = "shgemple$2020";
//    /**
//     * 要上传到的服务器路径
//     **/
//    private static final String pathname = "/data/file/报告单文件上传";
//    /**
//     * 要上传到服务器的文件的名称
//     **/
//    private static final String fileName = "downloadpage.json";
//    /**
//     * 登录服务器端口
//     **/
//    private static final int port = 22;
//
//    /**
//     * 上传文件（可供Action/Controller层使用） author tzq 2017年9月18日 boolean
//     */
//    public static String uploadFile(InputStream inputStream) {
//        FTPClientConfig ftpClientConfig = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
//        FTPClient ftpClient = new FTPClient();
//        ftpClient.configure(ftpClientConfig);
//        ftpClient.setControlEncoding("UTF-8");
//        try {
//            // 连接FTP服务器
//            ftpClient.connect(hostname, port);
//            // 登录FTP服务器
//            ftpClient.login(username, password);
//            // 是否成功登录FTP服务器
//            int replyCode = ftpClient.getReplyCode();
//            if (!FTPReply.isPositiveCompletion(replyCode)) {
//                return "";
//            }
//
//            ftpClient.enterLocalPassiveMode();
//
//            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
//            ftpClient.setFileTransferMode(FTPClient.BINARY_FILE_TYPE);
//            ftpClient.makeDirectory(pathname);
//            ftpClient.changeWorkingDirectory(pathname);
//            ftpClient.storeFile(fileName, inputStream);
//            inputStream.close();
//            ftpClient.logout();
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        } finally {
//            if (ftpClient.isConnected()) {
//                try {
//                    ftpClient.disconnect();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return pathname + fileName;
//    }
//
//    /**
//     * 删除 author tzq 2017年9月18日 boolean
//     */
//    public static boolean deleteFile() {
//        boolean flag = false;
//        FTPClient ftpClient = new FTPClient();
//        try {
//            // 连接FTP服务器
//            ftpClient.connect(hostname, port);
//            // 登录FTP服务器
//            ftpClient.login(username, password);
//            // 验证FTP服务器是否登录成功
//            int replyCode = ftpClient.getReplyCode();
//            if (!FTPReply.isPositiveCompletion(replyCode)) {
//                return flag;
//            }
//            // 切换FTP目录
//            ftpClient.changeWorkingDirectory(pathname);
//            ftpClient.dele(fileName);
//            ftpClient.logout();
//            flag = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (ftpClient.isConnected()) {
//                try {
//                    ftpClient.logout();
//                } catch (IOException e) {
//
//                }
//            }
//        }
//        return flag;
//    }
//
//    /**
//     * 下载 author tzq 2017年9月18日 boolean
//     */
//    public static boolean downloadFile(String localpath) {
//        boolean flag = false;
//        FTPClient ftpClient = new FTPClient();
//        try {
//            // 连接FTP服务器
//            ftpClient.connect(hostname, port);
//            // 登录FTP服务器
//            ftpClient.login(username, password);
//            // 验证FTP服务器是否登录成功
//            int replyCode = ftpClient.getReplyCode();
//            if (!FTPReply.isPositiveCompletion(replyCode)) {
//                return flag;
//            }
//            // 切换FTP目录
//            ftpClient.changeWorkingDirectory(pathname);
//            FTPFile[] ftpFiles = ftpClient.listFiles();
//            for (FTPFile file : ftpFiles) {
//                if (fileName.equalsIgnoreCase(file.getName())) {
//                    File localFile = new File(localpath + "/" + file.getName());
//                    OutputStream os = new FileOutputStream(localFile);
//                    ftpClient.retrieveFile(file.getName(), os);
//                    os.close();
//                }
//            }
//            ftpClient.logout();
//            flag = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (ftpClient.isConnected()) {
//                try {
//                    ftpClient.logout();
//                } catch (IOException e) {
//
//                }
//            }
//        }
//        return flag;
//    }
//
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("/Users/zhangchao/Desktop/titu/tt.pdf");
//        uploadFile(new FileInputStream(file));
//    }
//}
