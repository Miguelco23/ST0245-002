import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
private Node first;
private int size;
public LinkedListMauricio()
{
	size = 0;
	first = null;	
}

	/**
	 * Returns the node at the specified position in this list.
	 * @param index - index of the node to return
	 * @return the node at the specified position in this list
	 * @throws IndexOutOfBoundsException
	 */
	private Node getNode(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < size) {
			Node temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
         * @throws IndexOutOfBoundsException
	 */
	public int get(int index) throws IndexOutOfBoundsException {
		temp = getNode(index);
		return temp.data;
	}

// Retorna el tamaño actual de la lista
public int size()
{
	return size
}

public void insertP(int a)
{
	Nodo n = new Nodo(a);
	if(this.p == null)
	{
		this.p = n;
	}
	n.next = this.p;
	this.p = n;
	size++;
}
	
// Inserta un dato en la posición index
public void insert(int data, int index)
{
	Nodo a = this.getNodo(index-1);
	Nodo n = new Nodo(data);
	n.next = a.next;
	a.next = n;
	size++;
}

// Borra el dato en la posición index
public void remove(int index)
{
	...
}

// Verifica si está un dato en la lista
public boolean contains(int data)
{
	boolean a = false;
	Nodo c = new Nodo(data)
	for(int i = 0; i < size; i++)
	{
		
	}
	return a; 
}

}


