package in.groww.bootcamp.rectangle;

class Rectangle {
    private final int length;
    private final int breadth;

    private Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    static Rectangle createRectangle(int length, int breadth) {
        return new Rectangle(length, breadth);
    }

    static Rectangle createSquare(int side) {
        return createRectangle(side, side);
    }
}
