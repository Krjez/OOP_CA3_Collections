public class Block
{
    int quantity;
    double price;
    public Block(int quantity, double price)
    {
        this.quantity = quantity;
        this.price = price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
}
