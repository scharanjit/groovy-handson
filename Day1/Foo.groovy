class Foo {
        // read only property
        final String name = "John"

        // read only property with public getter & protected setter
        
        Integer amount
        protected void setAmount(Integer amount)
        { 
            this.amount = amount 
        }
        
        // dynamically typed property
        def cheese
        
        static void main(args){
        def foo = new Customer(name:"Charan")
        println(foo.name)
       // println(foo.amount)
//        println(foo.cheese)        
        println("hello")
        }
        
 }
