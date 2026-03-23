public class Book{
    private  String title;
    private String author;
    private double price;


    public String GetAuthor(){
            return author;
    }

    public String GetTitle(){
        return title;
    }

    public double GetPrice(){
        return price;
    }

    public void SetAuthor(String author){
        this.author=author;
    }
    
    public void SetTitle(String title){
        this.title=title;
    }

    public void SetPrice(double price){
        if(price < 0){
            System.out.println("Error: Price must be greater than zero!");
        }
        else{
            this.price=price;
        }
    }

    public static void main(String [] args){
        Book b=new Book();
        b.SetAuthor("Temesgen");
        b.SetTitle("Weyalaw");
        b.SetPrice(-10);
        
        System.out.println("Author: "+ b.GetAuthor());
        System.out.println("Title: "+ b.GetTitle());
        System.out.println("Price: $"+ b.GetPrice());

    }

}
