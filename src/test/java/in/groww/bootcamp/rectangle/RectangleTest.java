package in.groww.bootcamp.rectangle;

import org.junit.jupiter.api.Test;

import static in.groww.bootcamp.rectangle.Rectangle.createRectangle;
import static in.groww.bootcamp.rectangle.Rectangle.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void expectAreaToBe30GivenLength6AndBreadth5() {
        Rectangle rectangle = createRectangle(6, 5);
        assertEquals(30, rectangle.area());
    }

    @Test
    void expectAreaToBe48GivenLength8AndBreadth6() {
        Rectangle rectangle = createRectangle(8, 6);
        assertEquals(48, rectangle.area());
    }

    @Test
    void expectAreaToBe25GivenSide5() {
        Rectangle square = createSquare(5);
        assertEquals(25, square.area());
    }
}
