import org.testng.annotations.Test;
import java.sql.*;

public class Main {
    @Test
    void testConnection() throws InterruptedException, SQLException {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.run("Thread1");
        myThread1.join();
        myThread2.run("Thread2");
        myThread2.join();
        myThread3.run("Thread3");
        myThread3.join();

    }
}
