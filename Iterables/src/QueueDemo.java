class ClassA {  

    ClassA(int x) {

        System.out.print(" Constructor called " + x);

    }

}

  

// This class contains an instance of ClassA

class QueueDemo {   

    ClassA obj1 = new ClassA(10);  

  

    QueueDemo(int i) { obj1 = new ClassA(i); }

  

    public static void main(String[] args) {   

    	QueueDemo obj2 = new QueueDemo(5);

    }

}