public class Block
{
    double price;
    double quantity;
    public Block(double price, double quantity)
    {
        this.price = price;
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
    public double getQuantity()
    {
        return quantity;
    }
    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }
}
