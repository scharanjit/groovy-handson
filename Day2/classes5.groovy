class U{

    static a(x, Closure c){ c(x); }
    
    static b( a, b=2 ){ "$a, $b" }                         //last argument/s assigned default values
    
    static c( arg, Object[] extras ){ arg + extras.inject(0){ flo, it-> flo+it } }
    
    static gcd( m, n ){ if( m%n == 0 )return n; gcd(n,m%n) } //recursion by calling own name
}

assert U.a(7){ it*it } == 49 //shorthand passing of closures as parameters
assert U.b(7, 4) == '7, 4'
assert U.b(9) == '9, 2'
assert U.c(1,2,3,4,5) == 15 //varying number of arguments using Object[]
assert U.gcd( 28, 35 ) == 7
assert U.gcd( 4, 4 ) == 4
