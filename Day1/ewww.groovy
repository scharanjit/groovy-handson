def props() {
    def m1 = [a: 1, b: 2]
    
    println(m1)
    
    m2 = m1.findAll { k, v -> v % 2 == 0 }
    
    println(m2)
    
    m2.c = 3
    m2.d = 5
    
    m2
}

props()