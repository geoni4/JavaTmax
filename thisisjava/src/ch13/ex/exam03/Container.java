package ch13.ex.exam03;

public class Container<T, K> {
	T key;
	K value;
	public T getKey() {
		return key;
	}
	
	public K getValue() {
		return value;
	}

	public void set(T key, K value) {
		this.key = key;
		this.value = value;
	}
}
