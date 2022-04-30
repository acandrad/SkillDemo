import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    
    @Test 
    public void multiplyBy100Test() {
        assertEquals(400, SkillDemo.multiplyBy100(4));
    }
}
