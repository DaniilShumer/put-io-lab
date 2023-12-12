package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FailureOrErrorTest {
    @Test
    public void test1() {
        assertTrue(4 == 5);
    }

    @Test
    public void test2() {
        int m[] = {1,2,3};
        System.out.println(m[4]);
    }

    @Test
    public void test3() {
        try {
            assertTrue(4 == 5);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
