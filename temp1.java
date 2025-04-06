enum status{
    fine,hazzy,ill,allGood ; 
}
enum laptop{
    lenovo(100) , apple(1000) , samsung(700) ; 
    int price ; 
    laptop(int price){
        this.price = price; 
    }
}
class temp1{
    public static void main(String s[]){
        System.out.println("sakshammm ");
        status ss =  status.ill; 
        System.out.println(ss);
    }
    
}