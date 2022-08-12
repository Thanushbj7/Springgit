package com.testcases;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
@RunWith(JUnitPlatform.class)
@SelectPackages ({"com.testcases"})
@IncludePackages({"Fail","gradeb","greet"})

class AllTagsTest {

	

}
