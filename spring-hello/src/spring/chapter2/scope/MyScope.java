package spring.chapter2.scope;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class MyScope implements Scope {

	@SuppressWarnings("rawtypes")
	private final ThreadLocal threadScope = new ThreadLocal() {
		protected Object initialValue() {
			return new HashMap();
		}
	};
	
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		Map scope = (Map) threadScope.get();
		Object object = scope.get(name);
		if (object == null) {
			object = objectFactory.getObject();
			scope.put(name, object);
		}
		return object;
	}

	@Override
	public Object remove(String name) {
		Map scope = (Map) threadScope.get();
		return scope.remove(name);
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return null;
	}

}
