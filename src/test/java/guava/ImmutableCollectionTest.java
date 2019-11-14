package guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ImmutableCollectionTest {

  @Test
  public void testCopy() {
//    List<Integer> numbers = Lists.newArrayList(1, 2, 3, 4);
//
//    List<Integer> integers1 = ImmutableList.copyOf(ImmutableList.copyOf(numbers).subList(1,4));
//    List<Integer> integers2 = Collections.unmodifiableList(numbers);
//
//    numbers.add(0, -1);
//
//    Assert.assertEquals(1, integers1.get(0).intValue());//Pass
//    Assert.assertEquals(1, integers2.get(0).intValue());//Failure
//
//    List l = new ArrayList<Number>();
//    List<String> ls = l;       // unchecked warning
//    l.add(0, new Integer(42)); // another unchecked warning
//    String s = ls.get(0);
  }
}
