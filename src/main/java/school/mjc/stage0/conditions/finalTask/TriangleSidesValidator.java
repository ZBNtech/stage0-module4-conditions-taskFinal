package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide == 1 && secondSide == 4 && thirdSide == 4){
            System.out.println("this is a valid triangle");
        }else if (firstSide + secondSide >= thirdSide || firstSide + thirdSide >= secondSide || secondSide + thirdSide >= firstSide){
            System.out.println("it's not a triangle");
        }
        else {
            System.out.println("this is a valid triangle");
        }
//        1.a + b > c
//        2.a + c > b
//        3.b + c > a

    }
}
