package in.ashok.dao;
import in.ashok.beans.Book;
import org.springframework.stereotype.Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
@Repository
public class BookDaoImpl implements  BookDao
{
    private static  String uname="root";
    private static String url="jdbc:mysql://localhost:3307/ashokit";
    private static String pwd="Balu@359";
    private static String driver="com.mysql.cj.jdbc.Driver";
    @Override
    public int insertBook(Book book)
    {
        try
        {
            Class.forName(driver);
           Connection con= DriverManager.getConnection(url, uname,pwd);
           PreparedStatement stmt=con.prepareStatement("Insert into Books values (?,?,?)");
           stmt.setInt(1,book.getBookId());
           stmt.setString(2,book.getBookName());
           stmt.setInt(3,book.getBookPrice());
           int i=stmt.executeUpdate();

           con.close();
           stmt.close();
            return i;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return 0;
    }
}
