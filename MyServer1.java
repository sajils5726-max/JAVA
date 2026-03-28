import java.io.*;
import java .net.*;
public class MyServer1
{
    public static void main(String[]args)throws IOException
    {
        DatagramSocket dSocket= new DatagramSokect(9000);
        byte[]buf=new byte[256];
        DatagramPackect packet=new DatagramPackect(buf,buf.length);
        dSocket.recieive(packect);

    }
    