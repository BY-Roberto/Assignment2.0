import org.junit.*;

public class JUnitTest {
    int[] emArray = {};
    int [] nullArray = null;
    int[] findArray = {6, 9, 100, 20, -8, -9};
    @Test
    public void test_findMax() {


        findMaxMin.findMax(emArray);
        Assert.assertEquals(null, findMaxMin.findMax(emArray));
        Assert.assertEquals(null, findMaxMin.findMax(nullArray));
        Assert.assertEquals( 100, (int) findMaxMin.findMax(findArray));
    }

    @Test
    public void test_findMin() {
        findMaxMin.findMax(emArray);
        Assert.assertEquals(null, findMaxMin.findMin(emArray));
        Assert.assertEquals(null, findMaxMin.findMin(nullArray));
        Assert.assertEquals( -9, (int) findMaxMin.findMin(findArray));
    }
}
