package common;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateUtilTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        String date = "";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test1() {
//        fail("Not yet implemented");
        String date = DateUtil.format("2022-01-01", "yyyy-MM-dd", "yyyy MM dd");
        Assert.assertEquals("2022 01 01", date);
    }

    @Test
    public void test2() {
        String date = DateUtil.format("01 02 2022", "MM dd yyyy", "yyyy-MM-dd");
        Assert.assertEquals("2022-01-02", date);
    }

    @Test
    public void test3() {
        String date = DateUtil.format("03012022", "ddMMyyyy", "yyyy-MM-dd");
        Assert.assertEquals("2022-01-03", date);
    }

    @Test
    public void test4() {
        String date = DateUtil.format("20220104", "yyyyMMdd", "yyyy-MM-dd");
        Assert.assertEquals("2022-01-04", date);
    }

    @Test
    public void test5() {
        String date = DateUtil.format("20220105", "yyyyMMdd", "yyyy/MM/dd");
        Assert.assertEquals("2022/01/05", date);
    }

    @Test
    public void test6() {
        String date = DateUtil.format("20220105", "yyyyMMdd", "yyyy/MM/dd");
        Assert.assertEquals("2022/01/05", date);
    }

    @Test
    public void test7() {
        String date = DateUtil.format("2023.03.12", "yyyy.MM.dd", "MMddyyyy");
        Assert.assertEquals("03122023", date);
    }

    @Test
    public void test8() {
        String date = DateUtil.format("2023.03.12", "yyyy.MM.dd", "MMddyyyy");
        Assert.assertEquals("03122023", date);
    }

    @Test
    public void test9() {
        String date = DateUtil.format("03.12.2023", "MM.dd.yyyy", "yyyy/MM/dd");
        Assert.assertEquals("2023/03/12", date);
    }

    @Test
    public void test10() {
        String date = DateUtil.format("20231301", "yyyyMMdd", "yyyy/MM/dd");
        Assert.assertEquals("20231301", date);
    }
}
