public interface Calc3d {

    static double ballVolume(Ball ball){
        return (4/3)*ball.pi*(ball.getX()*ball.getX()*ball.getX());
    }
     static double cubeVolume(Cube cube){
        return cube.getX()*cube.b*cube.h;
     }
}
