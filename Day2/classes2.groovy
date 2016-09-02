//We can access private variables with an Expando instead. An expando allows us to assign closures to Expando
//names:

def counter= new Expando()
try{
def count= 0
counter.incr= { count++; show() }    //no need to qualify closure call with expando name
counter.decr= { count--; show() }
counter.show= { timesShown++; println "value of count : "+count }
counter.timesShown= 0    //we can associate any value, not just closures, to expando keys
}catch(e){ println e}

counter.incr(); 
counter.incr();
counter.decr();
counter.incr()
 
assert counter.show() == 2   //ignore the assert error or remove println statment from show