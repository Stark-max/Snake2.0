public class Main {
    public static void main(String[] args) {
        Room room = new Room(20, 20, new Snake(10, 10));
        room.getSnake().setDirection(SnakeDirection.DOWN);
        room.createMouse();
        room.run();
        System.out.println("Hello world!");
    }
}