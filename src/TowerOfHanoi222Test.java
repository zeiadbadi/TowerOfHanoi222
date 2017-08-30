import static org.junit.Assert.*;

public class TowerOfHanoi222Test {

    TowerOfHanoi222 towerOfHanoi1 = new TowerOfHanoi222();

    @org.junit.Test

    public void moveDisks() throws Exception {
        for (int i = 3; i < 12; i++) {

            assertEquals("Expected " +((int) Math.pow(2, i) - 1), ((int) Math.pow(2, i) - 1), towerOfHanoi1.moveDisks(i, 'A', 'B', 'C'));

            towerOfHanoi1.setCount(0);


        }

    }

}