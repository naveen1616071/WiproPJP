package Encapsulation;
class Author
{
	String name;
	String email;
	char gender;
	
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	}
	class Book{
		String name;
		Author author;
		double price;
		int qtyInStock;
		Book(String name,Author author,double price,int qtyInStock){
			this.name=name;
			this.author=author;
			this.price=price;
			this.qtyInStock=qtyInStock;
		}
		void setName(String name) {
			this.name=name;
		}
		String getName() {
			return name;
		}
		void setAuthor(Author author)
		{
			this.author=author;
		}
		Author getAuthor() {
			return author;
		}
		void setPrice(double price) {
			this.price=price;
		}
		double getPrice() {
			return price;
		}
		void setQtyInStock(int qtyInStock) {
			this.qtyInStock=qtyInStock;
			}
		int getQtyInStock() {
			return qtyInStock;
			}
	}

public class Program_1 {

	public static void main(String[] args) {
		Author author=new Author("Naveen","naveen@gmail.com",'M');
		
		Book book1=new Book("History of Java",author,1234.75,5000);
		
		System.out.println("Name of the book is:"+book1.getName());
        System.out.println("Author Name of the book is:"+book1.getAuthor().name);
        System.out.println("Price of the book is:"+book1.getPrice());
        System.out.println("Available Quantity:"+book1.getQtyInStock());
	}

}
