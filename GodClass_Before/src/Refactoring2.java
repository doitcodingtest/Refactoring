public class Refactoring2 {
    public static void main(String[] args) {
        Location location = new Location(0, 0);
        NPC npc = new NPC("하루NPC", location);
        npc.moveForward();
        npc.moveBack();
        npc.jump();

        Player player = new Player("하루플레이어", location);
        player.moveForward();
        player.moveBack();
        player.jump();
        player.setState("슈퍼");
        player.jump();
    }
}

class NPC {
    String name;
    Location location;

    public NPC(String name, Location location) {
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
        System.out.println(this.name + "가 높이 5만큼 점프합니다.");
    }
}

class Player {
    String name;
    String state;
    Location location;
    int HP;
    int MP;
    public Player(String name, Location location) {
        this.name = name;
        this.location = location;
        this.state = "일반";
    }

    public void setState(String state) {
        this.state = state;
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
        if (this.state.equals( "슈퍼")) {
            System.out.println(this.name + "가 슈퍼상태로 높이 10만큼 점프합니다.");
        } else {
            System.out.println(this.name + "가 높이 5만큼 점프합니다.");
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
