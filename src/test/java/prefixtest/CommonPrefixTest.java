package prefixtest;

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

    @Test(description="test numbers 1",
            enabled=true,
            groups={"all","example","regression", "numbers"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testNumbers1(){
        String[] numbers1 = {"11223344", "1123456","1112345", "1144"};
        //Output: "11"
        Assert.assertEquals(comLongPrefix.commonPrefix(numbers1), "11", "response doesn't match to '11'");
    }

    @Test(description="test numbers 2",
            enabled=true,
            groups={"all", "regression", "numbers"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testNumbers2(){
        String[] numbers2 = {"0000", "001111","0002345", "0077900"};
        //Output: "00"
        Assert.assertEquals(comLongPrefix.commonPrefix(numbers2), "00", "response doesn't match to '00'");
    }

    @Test(description="test one word",
            enabled=true,
            groups={"all", "regression", "one"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testOneWord(){
        String[] oneWord = {"word"};
        //Output: "word"
        Assert.assertEquals(comLongPrefix.commonPrefix(oneWord), "word", "response doesn't match to 'word'");
    }

    @Test(description="test same words",
            enabled=true,
            groups={"all", "regression", "same"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testSameWords(){
        String[] sameWords = {"word", "word", "word", "word", "word"};
        //Output: "word"
        Assert.assertEquals(comLongPrefix.commonPrefix(sameWords), "word", "response doesn't match to 'word'");
    }

    @Test(description="test empty word",
            enabled=true,
            groups={"all", "regression", "empty"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testEmpty(){
        String[] empty = {""};
        //Output: "word"
        Assert.assertEquals(comLongPrefix.commonPrefix(empty), "", "response doesn't match to ''");
    }

    @Test(description="test SpecialChars",
            enabled=true,
            groups={"all", "regression", "spec"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testSpecialChars(){
        String[] specialChars = {"!@#$", "!@#$%^", "!@#$*("};
        //Output: "!@#$"
        Assert.assertEquals(comLongPrefix.commonPrefix(specialChars), "!@#$", "response doesn't match to '!@#$'");
    }

    @Test(description="test words with spaces",
            enabled=true,
            groups={"all", "regression", "space"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testWordsWithSpace(){
        String[] wordsWithSpace = {"aaa bbb", "aaa bcc", "aaa bqw"};
        //Output: "aaa b"
        Assert.assertEquals(comLongPrefix.commonPrefix(wordsWithSpace), "aaa b", "response doesn't match to 'aaa b'");
    }

    @Test(description="test words with %20 spaces",
            enabled=true,
            groups={"all", "regression", "space"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testWordsWithPerc20Space(){
        String[] wordsWithPerc20Space = {"aaa%20bbb", "aaa%20bcc", "aaa%20bqw"};
        //Output: "aaa b"
        Assert.assertEquals(comLongPrefix.commonPrefix(wordsWithPerc20Space), "aaa%20b", "response doesn't match to 'aaa%20b'");
    }

    @Test(description="test words with leading some spaces",
            enabled=true,
            groups={"all", "regression", "space"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testWordsWithLeadingSpaces(){
        String[] wordsWithLeadingSpaces = {"   qq", "   qq11", "   qqaa"};
        //Output: "   qq"
        Assert.assertEquals(comLongPrefix.commonPrefix(wordsWithLeadingSpaces), "   qq", "response doesn't match to '   qq'");
    }

    @Test(description="test words with empty array",
            enabled=true,
            groups={"all", "regression", "space"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testEmptyArray(){
        String[] emptyArray = {""};
        //Output: ""
        Assert.assertEquals(comLongPrefix.commonPrefix(emptyArray), "", "response doesn't match to ''");
    }

    @Test(description="test one char words",
            enabled=true,
            groups={"all", "regression", "char"},
            dependsOnGroups={},
            dependsOnMethods={},
            priority=1
    )
    public void testOneCharWords(){
        String[] oneChar = {"a", "a", "a", "a", "a"};
        //Output: "a"
        Assert.assertEquals(comLongPrefix.commonPrefix(oneChar), "a", "response doesn't match to 'a'");
    }

}
