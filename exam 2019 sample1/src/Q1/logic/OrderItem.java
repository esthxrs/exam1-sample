package Q1.logic;

public class OrderItem {
    private Item item;
    private int itemAmount;
    public OrderItem(Item item, int itemAmount){
        setItem(item);
        setItemAmount(itemAmount);
    }

    public void increaseItemAmount(int amount){
        if(amount >=0) {
            setItemAmount(getItemAmount() + amount);
        }
    }

    public int calculateTotalPrice(){
        return item.getPricePerPiece()*getItemAmount();
    }

    public void setItemAmount(int itemAmount){
        this.itemAmount = Math.max(itemAmount, 0);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemAmount() {
        return itemAmount;
    }
}
