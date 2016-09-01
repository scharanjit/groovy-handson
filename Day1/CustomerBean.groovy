class Customer {
    // properties
    Integer id
    String name
    Date dob
    // sample code
    static void main(args) {
        def customer = new Customer(id:1, name:"Charanjit Singh", dob:new Date())
        println("Hello ${customer.name}")
        println(customer.id)
        println(customer.name)
        println(customer.dob)
    }
}

//Now if we compare java bean with groovy bean:
//there are no setter and getters ..avoiding lot of biolerpolate code