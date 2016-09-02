//Closures and functions can't remember any information defined within themselves between invocations. If we want a
//closure to remember a variable between invocations, one only it has access to, we can nest the definitions inside a
//block:

def c  //c is defined over here---outside try block
try{
    def a= new Random() //only closure c can see this variable; it is private to c
    c= { a.nextInt(100) }
}catch(e){println e}

100.times{ print c()+" " }

try{ 
    a;        //'a'inaccessable here
    assert 0 
 }catch(e){ 
 assert e instanceof MissingPropertyException 
}
