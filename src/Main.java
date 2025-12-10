import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main
    {

    static class Book 
    {
        private String title;
        private String author;

        public Book(String title, String author) 
        {
            this.title = title;
            this.author = author;
        }

        public String getTitle()
        {
            return title;
        }
    }

    static class Reader {
        private String fullName;
        private String ticketNumber;
        private String faculty;
        private String birthDate;
        private String phone;

        public Reader(String fullName, String ticketNumber, String faculty,
                      String birthDate, String phone)
        {
            this.fullName = fullName;
            this.ticketNumber = ticketNumber;
            this.faculty = faculty;
            this.birthDate = birthDate;
            this.phone = phone;
        }

        public void takeBook(int count)
        {
            System.out.println(fullName + " взяв " + count + " книги.");
        }

        public void takeBook(String... books) 
        {
            System.out.print(fullName + " взяв книги: ");
            System.out.println(String.join(", ", books));
        }

        public void takeBook(Book... books)
        {
            System.out.print(fullName + " взяв книги: ");
            List<String> titles = new ArrayList<>();
            for (Book b : books) {
                titles.add(b.getTitle());
            }
            System.out.println(String.join(", ", titles));
        }

        public void returnBook(int count) 
        {
            System.out.println(fullName + " повернув " + count + " книги.");
        }

        public void returnBook(String... books)
        {
            System.out.print(fullName + " повернув книги: ");
            System.out.println(String.join(", ", books));
        }

        public void returnBook(Book... books)
        {
            System.out.print(fullName + " повернув книги: ");
            List<String> titles = new ArrayList<>();
            for (Book b : books)
                {
                titles.add(b.getTitle());
            }
            System.out.println(String.join(", ", titles));
        }

        @Override
        public String toString() 
        {
            return fullName + ", " + ticketNumber + ", " + faculty + ", "
                    + birthDate + ", " + phone;
        }
    }


    public static void main(String[] args)
        {

        Reader[] readers = {
                new Reader("Петров В. В.", "12345", "ФІТ", "12.03.2000", "0661234567"),
                new Reader("Іванов І. І.", "54321", "ФЕЕ", "01.11.1999", "0979876543")
        };

        Book b1 = new Book("Пригоди", "Автор 1");
        Book b2 = new Book("Словник", "Автор 2");
        Book b3 = new Book("Енциклопедія", "Автор 3");


        readers[0].takeBook(3);
        readers[0].takeBook("Пригоди", "Словник", "Енциклопедія");
        readers[0].takeBook(b1, b2, b3);

        readers[0].returnBook(3);
        readers[0].returnBook("Пригоди", "Словник", "Енциклопедія");
        readers[0].returnBook(b1, b2, b3);

        List<String> readerInfo = new ArrayList<>();
        for (Reader r : readers) {
            readerInfo.add(r.toString());
        }

        try (PrintWriter writer = new PrintWriter("readers.txt"))
            {
            for (String info : readerInfo) {
                writer.println(info);
            }
            System.out.println("Дані записано у файл readers.txt");
        } catch (Exception e) {
            System.out.println("Помилка запису файлу: " + e.getMessage());
        }
    }
}
