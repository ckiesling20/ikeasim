public class ikeaRoom {
    private int foodThere;
    private int hoursThere;
    private String name;
    private String text;

    public ikeaRoom(int food, int hours, String name, String text){
        this.foodThere = food;
        this.hoursThere = hours;
        this.name = name;
        this.text = text;
    }

    public void visitRoom() {
            System.out.println(this.text);


    }

}
