import commonpref.ComLongPrefix;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CommonPrefixTest {

    ComLongPrefix comLongPrefix;

    @BeforeClass(alwaysRun = true)
    public void initializeTestBaseSetup() {
        comLongPrefix = new ComLongPrefix();
    }

    @Test(description="test Example 1",
            enabled=true,
            groups={"all","example","regression"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=0
    )
    public void testExample1(){
        String[] example1 = {"music","muse","mule"};
        //Output: “mu”
        String[] example2 = {"dog","","car"};
        //Output: ""
        String[] example3 = {"miss", "mission","mistake", "misunderstand"};
        //Output: "mis"
        Assert.assertEquals(comLongPrefix.commonPrefix(example1), "mu", "response doesn't match to 'mu'");
    }

    @Test(description="test Example 1",
            enabled=true,
            groups={"all","example","regression"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=0
    )
    public void testExample2(){
        String[] example2 = {"dog","","car"};
        //Output: ""
        Assert.assertEquals(comLongPrefix.commonPrefix(example2), "", "response doesn't match to ''");
    }

    @Test(description="test Example 1",
            enabled=true,
            groups={"all","example","regression"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=0
    )
    public void testExample3(){
        String[] example3 = {"miss", "mission","mistake", "misunderstand"};
        //Output: "mis"
        Assert.assertEquals(comLongPrefix.commonPrefix(example3), "mis", "response doesn't match to 'mis'");
    }

}
