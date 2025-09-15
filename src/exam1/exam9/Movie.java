package exam1.exam9;

public class Movie extends Item  {


    String director;
    String actor;

    Movie( String name, int price , String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    public void print() {
        super.print();
        System.out.println("- 감독:" + this.director + " 배우:" + this.actor);
    }

}
