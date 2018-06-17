public class LineCalc {

    double lineLenght(Line2D line2D) {
        if (line2D.y > line2D.getX()) return line2D.y - line2D.getX();
        return line2D.getX() - line2D.y;
    }
}

