public class Textbook
{
    private int edition;
    private Book b;
    public Textbook(String title, double price, int ed)
    {
        edition = ed;
        b = new Book(title, price);
    }
    public int getEdition()
    {
        return edition;
    }
    public boolean canSubstituteFor(Textbook book)
    {
        if(b.getTitle().equals("book.getTitle()"))
        {
            if(b.getEdition() > book.getEdition())
            {
                return true;
            }
        }
        return false;
    }
}