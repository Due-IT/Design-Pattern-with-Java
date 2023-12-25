package example.shapes;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(){}

    public Rectangle(Rectangle target){     //clone 메서드 사용을 위해 생성자 정의
        super(target);
        if(target != null){
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone(){                   //주요 메서드
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Rectangle) || !super.equals(obj)) return false;
        Rectangle shape2 = (Rectangle) obj;
        return shape2.width == width && shape2.height == height;
    }
}
