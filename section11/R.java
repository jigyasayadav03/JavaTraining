package section11;



class Rectangle{
    float length;
    float breadth;
    Rectangle(){
        this(19,20);
        System.out.println("area and perineter  of rectangle is");
             
    }
    Rectangle(int x , int y ){
   
    length=x;
    breadth=y;
    }
   
    float area(){
        return length*breadth;
    }
    float perimeter(){
        return 2*(length+breadth);
    }
}
public class R{
    public static void main(String[] args) {
        Rectangle r;
        r = new Rectangle();
        System.out.println("area is :"+r.area());
              System.out.println("area is :"+r.perimeter());
    }
}
