package org.example;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
// comment
@Suite
@SelectPackages("org.example")
@ExcludeTags("param")
public class TestSuite {

}
