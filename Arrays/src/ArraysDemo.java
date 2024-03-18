
public class ArraysDemo {
	
	int[] rollnums;
	int size;
	int capacity;
	
	public ArraysDemo(int capacity) {
		this.capacity = capacity;
		rollnums = new int[capacity];
	}
	
	void insertAtEnd(int element) {
		if(size==capacity) {
			growSize();
		}
		rollnums[size]=element;
		size++;
	}
	
	void insertAtBeginning(int element) {
		if(size==capacity) {
			growSize();
		}
		for(int i=size-1; i>=0; i--) {
			rollnums[i+1]=rollnums[i];
		}
		rollnums[0]=element;
		size++;
	}
	
	void insertAtIndex(int index, int element) {
		if(index<0 || index>size) {
			System.out.println("\n\nInvalid Index position. Cannot Insert!");
			return;
		}
		
		if(size==capacity) {
			growSize();
		}
		
		for(int i=size;i>index;i--) {
			rollnums[i]=rollnums[i-1];
		}
		
		rollnums[index] =element;
		size++;
	}
	
	void growSize() {
		capacity = 2*capacity;
		int[] temp = new int[capacity];
		for(int i=0;i<size;i++) {
			temp[i]=rollnums[i];
		}
		rollnums=temp;
	}
	
	int deleteFromBeginning() {
		if(size==0) {
			return -1;
		}
		int popped = rollnums[0];
		for(int i=0;i<size-1;i++) {
			rollnums[i]=rollnums[i+1];
		}
		size--;
		return popped;
	}
	
	int deleteFromEnd(){
		if(size==0) {
			return -1;
		}
		int popped = rollnums[size-1];
		size--;
		return popped;
	}
	
	int deleteAtIndex(int index) {
		if(index<0 || index>=size) {
			return -1;
		}
		int popped = rollnums[index];
		for(int i=index+1; i<size; i++) {
			rollnums[i-1]=rollnums[i];
		}
		size--;
		return popped;
	}
	
	void sort() {
		
		boolean swapped;
		do {
			swapped=false;
			for(int i=0;i<size-1;i++) {
				if(rollnums[i] > rollnums[i+1]) {
					rollnums[i+1] = rollnums[i] + rollnums[i+1];
					rollnums[i]= rollnums[i+1] - rollnums[i];
					rollnums[i+1] = rollnums[i+1] - rollnums[i];
					swapped = true;
					
				}
			}
		}while(swapped);
	}

	
	void display() {
		System.out.println("\n\nDisplaying with size-------");
		for(int i=0;i<size;i++) {
		System.out.print(rollnums[i] + " ");	
		}
		System.out.println("\n\nDisplaying with capacity-------");
		for(int i=0;i<capacity;i++) {
		System.out.print(rollnums[i] + " ");	
		}
	}
	
	public static void main(String[] args) {
		
		ArraysDemo obj = new ArraysDemo(5);
		obj.insertAtEnd(11);
		obj.insertAtEnd(22);
		obj.insertAtEnd(33);
		obj.insertAtEnd(44);
		obj.insertAtBeginning(99);
		obj.insertAtEnd(55);
		obj.insertAtEnd(66);
		obj.display();
		obj.insertAtEnd(77);
		obj.display();
		System.out.println("\n\n"+obj.deleteAtIndex(2));
		obj.display();
		System.out.println("\n\n"+obj.deleteAtIndex(11));
		System.out.println("\n\n" + obj.deleteFromBeginning());
		obj.display();
		obj.insertAtBeginning(901);
		obj.insertAtEnd(88);
		obj.display();
		obj.insertAtIndex(8, 101);
		obj.display();
		obj.insertAtIndex(8, 201);
		obj.display();
		obj.insertAtIndex(3, 301);
		obj.display();
		obj.insertAtIndex(11, 501);
		obj.display();
		obj.sort();
		obj.display();
		
	}

}
