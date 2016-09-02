class Counter{
    
       //variable within a class is called a field...
    static public count= 0
    //count has 'public' keyword, meaning it's visible from outside class
    //function within a class is called a method...
   
    static incr(){
        count++
        println "Inside incr with count value : "+count
        //variables defined within class visible from everywhere else inside class
    }
   
    static decr(){
        //println a //compile error if  uncommented:
        //a is outside the class and not visible
        count--
         println "Inside decr with count value : "+count
    }
}

Counter.incr();
Counter.incr();
Counter.decr();
 5.times{ Counter.incr() }
assert Counter.count == 6
