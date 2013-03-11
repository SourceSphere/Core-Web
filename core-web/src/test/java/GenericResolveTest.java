import static org.junit.Assert.assertEquals;

import java.lang.reflect.ParameterizedType;

import org.junit.Test;


public class GenericResolveTest 
{
	@Test
	public void test() 
	{
		Generic<String> generic = new Generic<String>();
		assertEquals(String.class, generic.resolveGeneric());
	}
	
	public class Generic<T>
	{
		public Class<?> resolveGeneric()
		{
	         return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}
	}
}
