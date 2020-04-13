package org.acme;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeScoreResourceIT extends ScoreResourceTest {

    // Execute the same tests but in native mode.
}