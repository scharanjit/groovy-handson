import org.codehaus.groovy.runtime.typehandling.GroovyCastException

    def v= 3     //variable v can hold any value
    
    v= 'helicopter'
    v= false
    v= new StringBuffer()
    v= null
    println v 
    
    int i= 15 //variable i can only hold integervalues
    i= 'A'
    assert i == 65 //'A' casted to its integer value
    
    //unable to cast boolean value to integer
    try{ i= false; assert 0 }catch(e){ assert e in GroovyCastException }
    
    Closure c= {it * 3} //variable c can only hold Closures
    
    try{ c= false; assert 0 }catch(e){ assert e in GroovyCastException }
    //unable to cast boolean value to Closure
    
    
    StringBuffer s= new StringBuffer('morning')
    //variable s can only hold StringBuffers
    
    try{ s= { it * 5 }; assert 0 }catch(e){ assert e in GroovyCastException }
    //unable to cast Closure value to StringBuffer
