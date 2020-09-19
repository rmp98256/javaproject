package com.mokito;

import static org.hamcrest.Matchers.array;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class SpyTest {

	@Test
	public void test() {
List arrayListMock=mock(ArrayList.class);
assertEquals(0, arrayListMock.size());

//mock return defalt value
   stub(arrayListMock.size()).toReturn(5);
   assertEquals(5, arrayListMock.size());
}

}
