class A{
    def list= []
    A(){
        list<< "A constructed"
    }
    
    A(int i){
        this()
        //a constructor can call another constructor if it's the first statement
        list<< "A constructed with $i"
    }
    
    A(String s){
        this(5)
        list<< "A constructed with '$s'"
    }
}

def a1= new A()

assert a1.list == [ "A constructed" ]

def a2= new A(7)
assert a2.list.collect{it as String} == [
"A constructed",
"A constructed with 7",
]

def a3= new A('bird')
assert a3.list.collect{it as String} == [
"A constructed",
"A constructed with 5",
"A constructed with 'bird'",
]
