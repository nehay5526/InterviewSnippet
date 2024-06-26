public class Money {
    int amount;
    String currencyCode;
    Money(int amoount,String currencyCode){
        this.amount=amoount;
        this.currencyCode=currencyCode;
    }
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        boolean balanced = income.equals(expenses);
        System.out.println(balanced);
    }
    @Override
public boolean equals(Object o) {
    if (o == this)//reflexive: an object must equal itself
        return true;
    if (!(o instanceof Money))
        return false;
    Money other = (Money)o;
    boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
      || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
    return this.amount == other.amount && currencyCodeEquals;
}
    
}
