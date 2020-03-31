package landeye;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端 SOCKET 文件传输
 */
public class FileServer  extends ServerSocket {

    private static final int SERVER_PORT = 8999; // 服务端端口
    private ServerSocket server;
    private DataInputStream dis;
    private FileOutputStream fos;

    public FileServer() throws Exception {
        server=new ServerSocket(SERVER_PORT);
    }

    public void task() throws IOException {
        System.out.println("======== 等待连接 ========");
        while(true){
            Socket socket = server.accept();
            System.out.println(" Ip:"+socket.getInetAddress()+"已连接");
            try {
                dis = new DataInputStream(socket.getInputStream());
                // 文件名和长度
                String fileName = dis.readUTF();
                long fileLength = dis.readLong();
                File directory = new File("/Users/gelijing/workspace/JavaProjects/landeye/a");
                if(!directory.exists()) {
                    directory.mkdir();
                }
                File file = new File(directory.getAbsolutePath() + File.separatorChar + fileName);

                fos = new FileOutputStream(file);
                System.out.println("file。。。。。。。。。。。。。。"+file);
                System.out.println("fileName。。。。。。。。。。。。。。"+fileName);

                System.out.println("======== 开始接收文件 ========");
                byte[] bytes = new byte[1024];
                int length = 0;
                while((length = dis.read(bytes, 0, bytes.length)) != -1) {
                    fos.write(bytes, 0, length);
                    fos.flush();
                }

                System.out.println("======== 文件接收成功 ========");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null)
                    fos.close();
                if(dis != null)
                    dis.close();
                socket.close();
                System.out.println("关闭socket");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }

    public static void main(String[] args) {
        try {
            FileServer server = new FileServer(); // 启动服务端
            server.task();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
