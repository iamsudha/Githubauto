package com.githubauto.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {
  @Test
  public void testListSizeEmpty() {
    List<String> names = new ArrayList<>();
    Assert.assertEquals(0, names.size());//compare if the list names is empty in size,0-is expected
  }
  
  @Test
  public void testListSize() {
    List<String> addname = new ArrayList<>();
    addname.add("James");
    System.out.println(addname.size());
    Assert.assertEquals(1, addname.size());//compare if the list addname is 1 in size

  }
}
