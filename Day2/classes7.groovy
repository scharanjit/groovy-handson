class Counter{
    def count = 0 //must use def inside classes if no other keyword before name
    def incr( n ){ count += n }
    def decr( n ){ count -= n }
}

def c1= new Counter() //create a new object from class
c1.incr(2);
c1.incr(7);
c1.decr(4);
c1.incr(6)
assert c1.count == 11

def c2= new Counter() //create another new object from class
c2.incr(5);
c2.decr(2)
assert c2.count == 3
