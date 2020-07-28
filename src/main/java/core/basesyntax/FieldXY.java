package core.basesyntax;

/**
 * <p>На игровом поле находится робот. Позиция робота на поле описывается двумя
 * целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх.(Помните, как рисовали
 * графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Ваша задача — привести робота в заданную точку игрового поля.
 * Реализуйте метод moveRobot()</p>
 */
public class FieldXY {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        Direction directionX;
        if (robot.getX() < toX) {
            directionX = Direction.RIGHT;
        } else {
            directionX = Direction.LEFT;
        }
        while (!robot.getDirection().equals(directionX)) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        Direction directionY;
        if (robot.getY() < toY) {
            directionY = Direction.UP;
        } else {
            directionY = Direction.DOWN;
        }
        while (!robot.getDirection().equals(directionY)) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }
}


