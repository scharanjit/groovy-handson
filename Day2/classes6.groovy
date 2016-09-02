 class Counter{
    static count = 0
    static{ println 'Counter first accessed' }
    //static initializer
    static incr( n ){ count += n }
    static decr( n ){ count -= n }
}

println 'incrementing...'

Counter.incr(7) //'Counter first accessed printed here

println 'decrementing...'
Counter.decr(4) //nothing printed
