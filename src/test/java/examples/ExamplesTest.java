package examples;

import io.karatelabs.core.Runner;
import io.karatelabs.core.SuiteResult;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExamplesTest {

    @Test
    void testParallel() {
        SuiteResult results = Runner.path("classpath:examples")
                .outputJunitXml(true)
                //.outputCucumberJson(true)
                .parallel(1);
        assertEquals(0, results.getScenarioFailedCount(), String.join("\n", results.getErrors()));
    }

}
