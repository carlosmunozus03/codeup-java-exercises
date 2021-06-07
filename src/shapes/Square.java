//package shapes;
//
//public class Square extends Rectangle {
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    private double side;
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//        // this.side = this.getLength();
//    }
//
//    public double getArea() {
////        this.setSide(this.getWidth());
////        return this.getSide() * this.getSide();
//        return Math.pow(this.getSide(), 2);
//    }
//
//    public double getPerimeter() {
////        this.setSide(this.getWidth());
//        return 4 * this.getSide();
//    }
//
////    public void setLength(double side){
////        super.length = side;
////        super.width = side;
////    }
////    public void setWidth(double side){
////        super.length = side;
////        super.width = side;
////    }
////    public double getArea(){
////        return Math.pow(super.length, 2);
////    }
////    public double getPerimter(){
////        return super.length * 4;
////    }
//
//
//}

package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
}