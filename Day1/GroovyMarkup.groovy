class GroovyMarkup{
    
    static void main(args){
            def someBuilder = new NodeBuilder()
            someBuilder.people(kind:'folks', groovy:true) {
                            person(x:123, name:'James', cheese:'edam') {
                                    project(name:'groovy')
                                    project(name:'geronimo')
                            }
                            person(x:234, name:'bob',cheese:'cheddar') {
                                    project(name:'groovy')
                                    project(name:'drools')
                            }
                }
            println(someBuilder)
        }
}