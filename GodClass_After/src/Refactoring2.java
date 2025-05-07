public class Refactoring2 {
    public static void main(String[] args) {
        Location location = new Location(0, 0);
        Character npc = new NPC("하루NPC", location);
        npc.moveForward();
        npc.moveBack();
        npc.jump();

        Character player = new Player("하루플레이어", location);
        player.moveForward();
        player.moveBack();
        player.jump();
        ((Player) player).setState("슈퍼");
        player.jump();
    }
}

class Character{
    String name;
    Location location;

    public Character(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    void moveForward() {
        location.x++;
        System.out.println(this.name + "가 앞으로 이동합니다.");

    }
    void moveBack() {
        location.x--;
        System.out.println(this.name + "가 뒤로 이동합니다.");
    }

    void jump() {
        System.out.println(this.name + "가 5의 높이로 점프합니다.");
    }
}

class NPC extends Character{

    public NPC(String name, Location location) {
        super(name, location);
    }
}

class Player extends Character{
    String state;
    int HP;
    int MP;

    public Player(String name, Location location) {
        super(name, location);
        this.state = "일반";
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    void jump() {
        if (this.state.equals("슈퍼")) {
            System.out.println(this.name + "가 슈퍼상태로 10의 높이로 점프합니다.");
        } else {
            System.out.println(this.name + "가 5의 높이로 점프합니다.");
        }

    }
}

class Location {
    int x;
    int y;
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
