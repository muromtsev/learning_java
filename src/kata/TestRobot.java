package kata;

import java.math.*;
import java.util.Arrays;

public class TestRobot {

    public static void main(String[] args) {
        Robot robot = new Robot(1,55, Direction.DOWN);
        moveRobot(robot, -30, 106);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {


        if (robot.getY() != toY) {
            while (robot.getDirection() != ((robot.getY() < toY)? Direction.UP :  Direction.DOWN)) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() != toX) {
            while (robot.getDirection() != ((robot.getX() < toX) ? Direction.RIGHT : Direction.LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        System.out.println("Ending позиция " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
    }
//    public static void moveRobot(Robot robot, int toX, int toY)
//
//    {
//        if (robot.getDirection() == Direction.DOWN) {
//            robot.turnRight();
//            robot.turnRight();
//
//        } else if (robot.getDirection() == Direction.LEFT) {
//            robot.turnRight();
//
//        } else if (robot.getDirection() == Direction.RIGHT) {
//            robot.turnLeft();
//
//        }
//
//        System.out.println("Direction: " + robot.getDirection());
//        System.out.println("Begin Y: " + robot.getY());
//        System.out.println("Begin X: " + robot.getX());
//
//        while (robot.getY() != toY) {
//            if (robot.getDirection() == Direction.DOWN && toY > 0) {
//                robot.turnLeft();
//                robot.turnLeft();
//            } else if (robot.getDirection() == Direction.UP && toY < 0) {
//                robot.turnRight();
//                robot.turnRight();
//            } else if (robot.getDirection() == Direction.RIGHT && toY > 0) {
//                robot.turnLeft();
//            } else if (robot.getDirection() == Direction.LEFT && toY > 0) {
//                robot.turnRight();
//            }
//
//            robot.stepForward();
//        }
//
//        while (robot.getX() != toX) {
//            if (robot.getDirection() == Direction.UP && toX < 0) {
//                robot.turnLeft();
//            } else if (robot.getDirection() == Direction.UP && toX > 0) {
//                robot.turnRight();
//            } else if (robot.getDirection() == Direction.DOWN && toX < 0) {
//                robot.turnRight();
//            } else if (robot.getDirection() == Direction.DOWN && toX > 0) {
//                robot.turnLeft();
//            }
//            robot.stepForward();
//
//        }
//
//        System.out.println("Before X: " + robot.getX());
//        System.out.println("Before Y: " + robot.getY());
//
//    }

}
