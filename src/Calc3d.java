public interface Calc3d {

    static double ballVolume(Ball ball){
        return (4/3)*ball.pi*(ball.r*ball.r*ball.r);
    }
     static double cubeVolume(Cube cube){
        return cube.a*cube.b*cube.h;
     }
}
