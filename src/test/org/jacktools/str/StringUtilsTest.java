package test.org.jacktools.str; 

import org.jacktools.str.StringUtils;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.HashMap;
import java.util.Map;

/** 
* StringUtils Tester. 
* 
* @author <jackluosi>
* @since <pre>08/17/ 2017</pre>
* @version 1.0 
*/ 
public class StringUtilsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isNullOrEmpty(Object object) 
* 
*/ 
@Test
public void testIsNullOrEmpty() throws Exception { 
//TODO: Test goes here...
    Map<String,Object> testMap = new HashMap<String, Object>();
    testMap.put("name","a");
    boolean res = StringUtils.isNullOrEmpty(testMap);
    System.out.println(res);
} 


} 
