package generics;

public interface Comparable<T> {

	// Returns a negative integer, zero, or a 
	// positive integer as this object is less than, 
	// equal to, or greater than the specified object.
	int compareTo(T object);
}
