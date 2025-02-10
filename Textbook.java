public class Textbook extends Book
{
    private int edition;
    public Textbook(String title, double price, int ed)
    {
        super(title, price);
        edition = ed;
    }
    public int getEdition()
    {
        return edition;
    }
    public String getBookInfo()
    {
        return super.getBookInfo() + "-" + edition;
    }
    public boolean canSubstituteFor(Textbook other)
    {
        if(getTitle().equals(other.getTitle()))
        {
            return edition >= other.edition;
        }
        return false;
    }
}