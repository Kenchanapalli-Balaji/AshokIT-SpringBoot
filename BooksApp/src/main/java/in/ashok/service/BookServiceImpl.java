package in.ashok.service;

import in.ashok.beans.Book;
import in.ashok.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class BookServiceImpl implements  BookService
{
    @Autowired
    private BookDao bookDao;
    @Override
    public  void processBooks()
    {
        String filepath="C:\\Users\\Admin\\Desktop\\Learning Projects (1)\\Learning Projects\\Ashok IT Spring Boot\\BooksApp\\src\\main\\java\\book.txt";
        try
        {
            Stream<String> lines=Files.lines(Paths.get(filepath));
            lines.forEach(line->{
                String[] values=line.split(",");
                Book b=new Book();
                b.setBookId(Integer.parseInt(values[0]));
                b.setBookName(values[1]);
                b.setBookPrice(Integer.parseInt(values[2]));
                int cnt=bookDao.insertBook(b);
                if(cnt>0)
                    System.out.println("INserted Successfully");
            });
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
