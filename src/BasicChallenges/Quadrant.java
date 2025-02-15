package BasicChallenges;

public class Quadrant {

    public static int quadrantPosition(int x, int y){

        // Given a point in a Euclidean plane (x, y)
        // this function determines in which quadrant it is located.
        if(x > 0 && y > 0){
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {return 4;}
    }

    public static void main(String[] args){

        System.out.println(quadrantPosition(0,-2));
    }
}