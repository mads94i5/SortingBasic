package kea.spring2022.sorting;

public class Ball implements ComparableObject {
    private int brightness;

    public Ball() {
        this((int) Math.floor(Math.random()*16));
    }

    public Ball(int brightness) {
        this.brightness = brightness%16;
    }

    @Override
    public boolean sortedBy(ComparableObject otherObject) {
        if (otherObject instanceof Ball) {
            return brighterThan((Ball)otherObject);
        } else {
            return false;
        }
    }

    public boolean brighterThan(Ball otherBall) {
        if(otherBall.brightness < this.brightness) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return Integer.toString(brightness);
    }
}
