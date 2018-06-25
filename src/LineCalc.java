public class LineCalc {

    double lineLenght(Line2D line2D) {
        if (line2D.y > line2D.x) return line2D.y - line2D.x;
        return line2D.x - line2D.y;
    }
}

